package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.bean.LoginResultBean;
import cn.dhc.chinacultural.utils.LogUtils;
import cn.dhc.chinacultural.utils.ToastUtils;
import okhttp3.Call;

import static cn.dhc.chinacultural.bean.Constant.URL_LOGIN;

/**
 * Created by WYHY on 2018/4/24.
 */

public class IndexActivity extends BaseAvtivity {
	private RequestCall mRequestCall;
	private Button btn_re, btn_index;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index_layout);
//		setImmerseLayout(findViewById(R.id.ti));
		btn_re = (Button) findViewById(R.id.btn_re);
		btn_re.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//跳转至 MainActivity
				Intent intent = new Intent(IndexActivity.this, RegisterActivity.class);
				startActivity(intent);
				//结束当前的 Activity
				IndexActivity.this.finish();
			}
		});
		btn_index = (Button) findViewById(R.id.btn_index);
		btn_index.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mRequestCall = OkHttpUtils
						.post()
						.url(URL_LOGIN)
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
						LoginResultBean loginBean = g.fromJson(response, LoginResultBean.class);
						if (loginBean.isSuccess()){
							//跳转至 MainActivity
							Intent intent = new Intent(IndexActivity.this, MainActivity.class);
							startActivity(intent);
							//结束当前的 Activity
							IndexActivity.this.finish();
						}else {
							ToastUtils.showShort(getApplicationContext(), "登录失败！原因：" + loginBean.getMessage().toString());
						}
					}
				});

			}
		});

	}

}
