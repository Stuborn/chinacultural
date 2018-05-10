package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.utils.LogUtils;


public class NewsDetailActivity extends BaseAvtivity implements View.OnClickListener{

	private WebView webView;
	private TextView tv_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news_detail);
		initView();
	}

	private void initView() {
		Intent intent = getIntent();
		String url = intent.getStringExtra("url");
		String allow = intent.getStringExtra("allow");
		String postnumb = intent.getStringExtra("postnumb");
		LogUtils.e("url:"+url+";allow"+allow+"postnumb:"+postnumb);
		tv_title = findViewById(R.id.title_back);
		tv_title.setText("中国文化");
		webView = findViewById(R.id.wv);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		webView.loadUrl(url);
		findViewById(R.id.title_back).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.title_back:
				this.finish();
				break;
		}
	}
}
