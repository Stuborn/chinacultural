package cn.dhc.chinacultural.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;

public class wodejifenActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wodejifen_activity);
        initView();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("我的积分");
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
    }
}
