package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;

public class wodeshoucang extends AppCompatActivity implements View.OnClickListener {

    ImageView back;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wode_shoucang);
        initView();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent();
            intent.setClass(wodeshoucang.this, ScrollingActivity.class);
            wodeshoucang.this.startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("我的收藏");
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
    }
}
