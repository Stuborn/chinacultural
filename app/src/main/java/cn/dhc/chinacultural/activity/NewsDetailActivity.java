package cn.dhc.chinacultural.activity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;

public class NewsDetailActivity extends BaseAvtivity {

	private WebView webView;
	private TextView tv_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news_detail);
		initView();
//		onBack(tv_title);
	}

	private void initView() {
//		Intent intent = getIntent();
//		String url = intent.getStringExtra("url");
//		tv_title = findViewById(R.id.title_back);
//		tv_title.setText("中国文化");
		webView = findViewById(R.id.wv);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		webView.loadUrl("http://192.168.0.26/jlbank/H5word.html");
	}

}
