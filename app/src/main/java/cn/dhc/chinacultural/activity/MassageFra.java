package cn.dhc.chinacultural.activity;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.bean.Constant;
import cn.dhc.chinacultural.bean.LanMuYiBean;
import cn.dhc.chinacultural.utils.LogUtils;
import cn.dhc.chinacultural.utils.ToastUtils;
import cn.dhc.chinacultural.widget.CCProgressDialog;
import cn.dhc.chinacultural.widget.refresh.RefreshLayout;
import okhttp3.Call;
import cn.dhc.chinacultural.bean.ColumnListBean;
import cn.dhc.chinacultural.bean.HTTPResponseBean;
import cn.dhc.chinacultural.bean.LoginResultBean;
import cn.dhc.chinacultural.utils.LogUtils;
import cn.dhc.chinacultural.utils.ToastUtils;
import okhttp3.Call;

import static cn.dhc.chinacultural.bean.Constant.URL_GETCOLUMNLIST;
import static cn.dhc.chinacultural.bean.Constant.URL_LOGIN;

/**
 * 01.资讯Fragment
 * Created by WYHY on 2018/4/20.
 */

public class MassageFra extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {
    private RequestCall mRequestCall;
    private View view;
    private TextView findet;
    private ListView massagelv;
    private TabLayout tabLayout;
    private ImageView im_icon;
    private ImageView im_find;
    private ImageView im_more;
    private int s=0;
    private int page = 1;
    private RefreshLayout refreshLayout;

    // 单例(方法二)
    private static MassageFra fa;
    private MyAdapter myAdapter;

    public static MassageFra getMassageFra() {
        if (fa == null) {
            fa = new MassageFra();
        }
        return fa;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.massage_layout, container, false);
        initProgressDialog();
        info(view);
        initData();
		//获得栏目列表
		getColumnList();
        refresh();
        return view;
    }

	private RequestCall mColumnRequestCall;

	/**
	 * 获得栏目列表
	 */
	private void getColumnList() {
		ccProgressDialog.show();
		mColumnRequestCall = OkHttpUtils
				.post()
				.url(URL_GETCOLUMNLIST)
				.build();

		mColumnRequestCall.execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {
				call.cancel();
				ccProgressDialog.dismiss();
				LogUtils.e("网络请求失败！" + e.toString());
			}

			@Override
			public void onResponse(String response, int id) {
				ccProgressDialog.dismiss();
				LogUtils.e("请求栏目列表返回response:" + response);
				Gson g = new GsonBuilder().serializeNulls().create();
				HTTPResponseBean mHttpResponseBean = g.fromJson(response, HTTPResponseBean.class);
				if (mHttpResponseBean.success.equals("true")) {
					//栏目列表请求成功
					ColumnListBean.DataBean mDataBean = (ColumnListBean.DataBean) mHttpResponseBean.getPesponseBean(ColumnListBean.DataBean.class);
					List<ColumnListBean.DataBean.CategorydataBean> mCategroydataBean = mDataBean.getCategorydata();
					setColumn(mCategroydataBean);
				}
			}
		});
	}

	private void setColumn(List<ColumnListBean.DataBean.CategorydataBean> mCategroydataBean) {
		for (int i = 0; i < mCategroydataBean.size(); i++) {
			//添加tab
			tabLayout.addTab(tabLayout.newTab().setText(mCategroydataBean.get(i).getNAME_() + ""));
			selectTab(mCategroydataBean);
		}
	}

    private void initData() {
        page = 1;
        mRequestCall = OkHttpUtils
                .get()
                .url(Constant.URL_GETARTICLELIST+page+"/10")
                .build();

        mRequestCall.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                call.cancel();
                LogUtils.e("网络请求失败！" + e.toString());
            }

            @Override
            public void onResponse(String response, int id) {
                LogUtils.e("网络请求返回response:" + response);
                Gson g = new GsonBuilder().serializeNulls().create();
                LanMuYiBean loginBean = g.fromJson(response, LanMuYiBean.class);
                if (loginBean.isSuccess()){
                    myAdapter.setData(loginBean.getRows());
                }else {
                    ToastUtils.showShort(getContext(), "登录失败！原因：" + loginBean.getMessage().toString());
                }
            }
        });


        }

    private void refresh() {

        refreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorAccent, R.color.colorPrimaryDark);

        refreshLayout.setOnRefreshListener(this);

        refreshLayout.setOnLoadListener(this);
    }

    public void info(View view){
        refreshLayout = (RefreshLayout)view.findViewById(R.id.refreshLayout);
        findet=(TextView) view.findViewById(R.id.et_find);
        massagelv=(ListView)view.findViewById(R.id.massage_lv);
        myAdapter = new MyAdapter(getActivity());
        massagelv.setAdapter(myAdapter);
        tabLayout=(TabLayout)view.findViewById(R.id.HS);
        im_icon=(ImageView)view.findViewById(R.id.logo);
        im_find=(ImageView)view.findViewById(R.id.find_img);
        im_more=(ImageView)view.findViewById(R.id.btn_img);

		im_icon.setImageResource(R.drawable.logo);
		im_find.setImageResource(R.drawable.soushuoicon);
		im_more.setImageResource(R.drawable.caidanicon);

		findet.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getActivity(), SearchActivity.class);
				startActivity(intent);
			}
		});

		massagelv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			private LanMuYiBean.RowsBean itemAtPosition;

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
									long id) {
				if (s == 0) {
					Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
					itemAtPosition = ((LanMuYiBean.RowsBean) adapter.getItemAtPosition(position));
					intent.putExtra("url",itemAtPosition.getH5URL());
					intent.putExtra("allow",itemAtPosition.getAllowcomments());
					intent.putExtra("postnumb",itemAtPosition.getPostNum());
					startActivity(intent);
				} else if (s == 1) {
					Intent intent = new Intent(getActivity(), ImagesActivity.class);
					startActivity(intent);
				}

			}


		});

		view.findViewById(R.id.iv_add).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getActivity(), LanmuActivity.class);
				startActivity(intent);
			}
		});
	}


	public void selectTab(final List<ColumnListBean.DataBean.CategorydataBean> mCategroydataBean) {
		//tab的下划线颜色
		tabLayout.setSelectedTabIndicatorColor(Color.RED);
		tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				ToastUtils.showShort(getActivity().getApplicationContext(), "当前tab名称：" + mCategroydataBean.get(tab.getPosition()).getNAME_() + ";当前tabID：" + mCategroydataBean.get(tab.getPosition()).getID_());
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {
			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {
			}
		});
	}

	public void setlistview() {
		SimpleAdapter adepter = new SimpleAdapter(getActivity()
				, getData(),
				R.layout.msg_model1_layout,
				new String[]{"title", "time", "a", "r", "tu"}
				, new int[]{R.id.tv_title, R.id.tv_a,
				R.id.tv_time, R.id.iv_r, R.id.iv_p});
		massagelv.setAdapter(adepter);
	}

	public void setlistview2() {
		SimpleAdapter adepter = new SimpleAdapter(getActivity()
				, getData2(),
				R.layout.img_model_layout,
				new String[]{"title", "time", "a", "r", "tu"}
				, new int[]{R.id.tv_title, R.id.tv_a,
				R.id.tv_time, R.id.iv_r, R.id.iv_p});
		massagelv.setAdapter(adepter);
	}

	public List getData() {
		String title[] = {"专家解读机构改革方案：合并归类重组 改革力度空前",
				"专家解读机构改革方案：合并归类重组 改革力度空前",
				"专家解读机构改革方案：合并归类重组 改革力度空前"};
		String time[] = {"TextView", "TextView", "TextView"};
		String a[] = {"刚刚", "刚刚", "刚刚"};
		List list = new ArrayList();
		int r[] = {R.drawable.reicon, R.drawable.reicon, R.drawable.reicon};
		int tu[] = {R.drawable.news, R.drawable.news, R.drawable.news};

		for (int i = 0; i < time.length; i++) {
			Map map = new HashMap();
			map.put("title", title[i]);
			map.put("time", time[i]);
			map.put("a", a[i]);
			map.put("r", r[i]);
			map.put("tu", tu[i]);
			list.add(map);
		}
		return list;
	}

	public List getData2() {
		String title[] = {"专家解读机构改革方案：合并归类重组 改革力度空前",
				"专家解读机构改革方案：合并归类重组 改革力度空前",
				"专家解读机构改革方案：合并归类重组 改革力度空前"};
		String time[] = {"TextView", "TextView", "TextView"};
		String a[] = {"刚刚", "刚刚", "刚刚"};
		List list = new ArrayList();
		int r[] = {R.drawable.reicon, R.drawable.reicon, R.drawable.reicon};
		int tu[] = {R.drawable.img2, R.drawable.img2, R.drawable.img2};

		for (int i = 0; i < time.length; i++) {
			Map map = new HashMap();
			map.put("title", title[i]);
			map.put("time", time[i]);
			map.put("a", a[i]);
			map.put("r", r[i]);
			map.put("tu", tu[i]);
			list.add(map);
		}
		return list;
	}

    @Override
    public void onRefresh() {
        page = 1;
        mRequestCall = OkHttpUtils
                .get()
                .url(Constant.URL_GETARTICLELIST+page+"/10")
                .build();

        mRequestCall.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                call.cancel();
                LogUtils.e("网络请求失败！" + e.toString());
            }

            @Override
            public void onResponse(String response, int id) {
                LogUtils.e("网络请求返回response:" + response);
                Gson g = new GsonBuilder().serializeNulls().create();
                LanMuYiBean loginBean = g.fromJson(response, LanMuYiBean.class);
                if (loginBean.isSuccess()){
                    myAdapter.setData(loginBean.getRows());
                }else {
                    ToastUtils.showShort(getContext(), "登录失败！原因：" + loginBean.getMessage().toString());
                }
            }
        });
        refreshLayout.setRefreshing(false);
    }

    @Override
    public void onLoad() {
        page = ++page;
        mRequestCall = OkHttpUtils
                .get()
                .url(Constant.URL_GETARTICLELIST+page+"/10")
                .build();

        mRequestCall.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                refreshLayout.setLoading(false);
                call.cancel();
                LogUtils.e("网络请求失败！" + e.toString());
            }

            @Override
            public void onResponse(String response, int id) {
                LogUtils.e("网络请求返回response:" + response);
                Gson g = new GsonBuilder().serializeNulls().create();
                LanMuYiBean loginBean = g.fromJson(response, LanMuYiBean.class);
                if (loginBean.isSuccess()){
                    refreshLayout.setLoading(false);
                    myAdapter.addData(loginBean.getRows());
                }else {
                    refreshLayout.setLoading(false);
                    ToastUtils.showShort(getContext(), "登录失败！原因：" + loginBean.getMessage().toString());
                }
                if (loginBean.getRows().size()<1){
                    refreshLayout.setOnLoadListener(null);
                }
                refreshLayout.setRefreshing(false);
            }
        });
    }

//	private CCProgressDialog ccProgressDialog;
//	//初始化加载框
//	private void initProgressDialog() {
//		ccProgressDialog = CCProgressDialog.create(getActivity(), getResources().getString(R.string.common_loading), true, new DialogInterface.OnCancelListener() {
//			@Override
//			public void onCancel(DialogInterface dialog) {
//				ccProgressDialog.dismiss();
//			}
//		});
//	}
}
