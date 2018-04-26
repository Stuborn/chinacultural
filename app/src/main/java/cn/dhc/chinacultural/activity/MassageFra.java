package cn.dhc.chinacultural.activity;

import android.app.Fragment;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.bean.LanMuYiBean;
import cn.dhc.chinacultural.utils.LogUtils;
import cn.dhc.chinacultural.utils.ToastUtils;
import cn.dhc.chinacultural.widget.refresh.RefreshLayout;
import okhttp3.Call;

/**
 * 01.资讯Fragment
 * Created by WYHY on 2018/4/20.
 */

public class MassageFra extends Fragment implements SwipeRefreshLayout.OnRefreshListener, RefreshLayout.OnLoadListener {
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
        info(view);
        selectTab();
//        setlistview();
        initData();
        refresh();
        return view;
    }

    private void initData() {
        page = 1;
        mRequestCall = OkHttpUtils
                .get()
                .url("http://192.168.0.37:8086/zcm/zcm/nrfb/app/getAppArticleList/1/2018-04-25%2019:17:34/"+page+"/10")
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
                Intent intent = new Intent(getActivity(),SearchActivity.class);
                startActivity(intent);
            }
        });

        massagelv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position,
                                    long id) {
                if(s==0){
                    Intent intent = new Intent(getActivity(),NewsActivity.class);
                    startActivity(intent);
                }else if(s==1){
                    Intent intent = new Intent(getActivity(),ImagesActivity.class);
                    startActivity(intent);
                }

            }


        });


    }


    public void selectTab(){
        //tab的下划线颜色
        tabLayout.setSelectedTabIndicatorColor(Color.RED);
        for (int i = 0; i < 20; i++) {
            //添加tab
            tabLayout.addTab(tabLayout.newTab().setText("TAB" + i));
        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getText().toString().equals("头条"))
                {
                    massagelv.setAdapter(null);
                    setlistview();
                    s=0;
                }else if(tab.getText().toString()=="要闻")
                {

                }else if(tab.getText().toString()=="滚动")
                {

                }else if(tab.getText().toString().equals("图集"))
                {
                    massagelv.setAdapter(null);
                    setlistview2();
                    s=1;
                }else if(tab.getText().equals(""))
                {
                    Intent intent = new Intent(getActivity(),LanmuActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    public void setlistview(){
        SimpleAdapter adepter=new SimpleAdapter(getActivity()
                ,getData(),
                R.layout.msg_model1_layout,
                new String[]{"title","time","a","r","tu"}
                ,new int[]{R.id.tv_title,R.id.tv_a,
                R.id.tv_time,R.id.iv_r,R.id.iv_p});
        massagelv.setAdapter(adepter);
    }
    public void setlistview2(){
        SimpleAdapter adepter=new SimpleAdapter(getActivity()
                ,getData2(),
                R.layout.img_model_layout,
                new String[]{"title","time","a","r","tu"}
                ,new int[]{R.id.tv_title,R.id.tv_a,
                R.id.tv_time,R.id.iv_r,R.id.iv_p});
        massagelv.setAdapter(adepter);
    }
    public List getData(){
        String title[]={"#关押25年再审6年# 刘忠林故意杀人案改判无罪！",
                "#关押25年再审6年# 刘忠林故意杀人案改判无罪！",
                "#关押25年再审6年# 刘忠林故意杀人案改判无罪！"};
        String time[]={"TextView","TextView","TextView"};
        String a[]={"刚刚","刚刚","刚刚"};
        List list=new ArrayList();
        int r[]={R.drawable.reicon,R.drawable.reicon,R.drawable.reicon};
        int tu[]={R.drawable.news,R.drawable.news,R.drawable.news};

        for(int i=0;i<time.length;i++)
        {
            Map map=new HashMap();
            map.put("title",title[i]);
            map.put("time",time[i]);
            map.put("a",a[i]);
            map.put("r",r[i]);
            map.put("tu",tu[i]);
            list.add(map);
        }
        return list;
    }
    public List getData2(){
        String title[]={"#关押25年再审6年# 刘忠林故意杀人案改判无罪！",
                "#关押25年再审6年# 刘忠林故意杀人案改判无罪！",
                "#关押25年再审6年# 刘忠林故意杀人案改判无罪！"};
        String time[]={"TextView","TextView","TextView"};
        String a[]={"刚刚","刚刚","刚刚"};
        List list=new ArrayList();
        int r[]={R.drawable.reicon,R.drawable.reicon,R.drawable.reicon};
        int tu[]={R.drawable.img2,R.drawable.img2,R.drawable.img2};

        for(int i=0;i<time.length;i++)
        {
            Map map=new HashMap();
            map.put("title",title[i]);
            map.put("time",time[i]);
            map.put("a",a[i]);
            map.put("r",r[i]);
            map.put("tu",tu[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public void onRefresh() {
        page = 1;
        mRequestCall = OkHttpUtils
                .get()
                .url("http://192.168.0.37:8086/zcm/zcm/nrfb/app/getAppArticleList/1/2018-04-25%2019:17:34/"+page+"/10")
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
                .url("http://192.168.0.37:8086/zcm/zcm/nrfb/app/getAppArticleList/1/2018-04-25%2019:17:34/"+page+"/10")
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
}
