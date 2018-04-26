package cn.dhc.chinacultural.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class shejiaobdActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout weixin, qq, weibo;
    ImageView back;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shejiao_layout);
        initView();

        weixin = findViewById(R.id.shejiao_weixin);
        qq = findViewById(R.id.shejiao_QQ);
        weibo = findViewById(R.id.shejiao_weibo);


        weibo.setOnClickListener(this);
        qq.setOnClickListener(this);
        weixin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shejiao_weixin:
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shejiao_QQ:
                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shejiao_weibo:
                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.title_back:
                finish();
                break;
            default:
                break;
        }
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("绑定社交软件");
        title_back.setOnClickListener(this);
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
    }
}
