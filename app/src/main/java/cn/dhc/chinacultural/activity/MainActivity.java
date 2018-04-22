package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import cn.dhc.chinacultural.R;

public class MainActivity extends BaseAvtivity implements View.OnClickListener{
private EditText et_1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		findViewById(R.id.btn_1).setOnClickListener(this);
		et_1 = findViewById(R.id.et_1);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.btn_1:
//				Intent intent = new Intent(MainActivity.this,NewsDetailActivity.class);
//				intent.putExtra("url", et_1.getText().toString()+"");
//				startActivity(intent);
				//测试123
				startActivity(new Intent(MainActivity.this,NewsDetailActivity.class));
				break;
		}
	}
}
