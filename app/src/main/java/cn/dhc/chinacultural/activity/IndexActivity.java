package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/24.
 */

public class IndexActivity extends BaseAvtivity {
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
				//跳转至 MainActivity
				Intent intent = new Intent(IndexActivity.this, MainActivity.class);
				startActivity(intent);
				//结束当前的 Activity
				IndexActivity.this.finish();
			}
		});

	}

}
