package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class shejiaobdActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout weixin,qq,weibo;
    ImageView back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shejiao_layout);

        weixin=findViewById(R.id.shejiao_weixin);
        qq=findViewById(R.id.shejiao_QQ);
        weibo=findViewById(R.id.shejiao_weibo);
        back=findViewById(R.id.iv_back);

        weibo.setOnClickListener(this);
        qq.setOnClickListener(this);
        weixin.setOnClickListener(this);
        back.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.shejiao_weixin:
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.shejiao_QQ:
                Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.shejiao_weibo:
                Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_back:
                Intent intent = new Intent();
                intent.setClass(shejiaobdActivity.this, ScrollingActivity.class);
                shejiaobdActivity.this.startActivity(intent);
                finish();
            break;
            default:
                break;
        }
    }
}
