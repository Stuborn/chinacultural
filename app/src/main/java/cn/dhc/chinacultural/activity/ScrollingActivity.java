package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout li1,li2,li3,li4,li5,li6;
    ImageView touxiang,shezhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        li1=findViewById(R.id.wodechuangzuo);
        li2=findViewById(R.id.wodeshoucang);
        li3=findViewById(R.id.wodedingyue);
        li4=findViewById(R.id.wodejifen);
        li5=findViewById(R.id.wentifankui);
        li6=findViewById(R.id.guanyu);

        touxiang=findViewById(R.id.wode_touxiang);
        shezhi=findViewById(R.id.iv_more);

        li1.setOnClickListener(this);
        li2.setOnClickListener(this);
        li3.setOnClickListener(this);
        li4.setOnClickListener(this);
        li5.setOnClickListener(this);
        li6.setOnClickListener(this);
        touxiang.setOnClickListener(this);
        shezhi.setOnClickListener(this);




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wodechuangzuo:
                Intent intent = new Intent();
                intent.setClass(ScrollingActivity.this, ChuangzuoActivity.class);
                ScrollingActivity.this.startActivity(intent);
                finish();
                break;
            case R.id.wodeshoucang:
                Intent intent2 = new Intent();
                intent2.setClass(ScrollingActivity.this, wodeshoucang.class);
                ScrollingActivity.this.startActivity(intent2);
                finish();
                break;
            case R.id.wodedingyue:
                Intent intent3 = new Intent();
                intent3.setClass(ScrollingActivity.this, wodedingyueActivity.class);
                ScrollingActivity.this.startActivity(intent3);
                finish();
                break;
            case R.id.wodejifen:
                Intent intent4 = new Intent();
                intent4.setClass(ScrollingActivity.this, wodejifenActivity.class);
                ScrollingActivity.this.startActivity(intent4);
                break;
            case R.id.wentifankui:
                Intent intent5 = new Intent();
                intent5.setClass(ScrollingActivity.this, wentiActivity.class);
                ScrollingActivity.this.startActivity(intent5);
                finish();
                break;
            case R.id.guanyu:
                Toast.makeText(getApplicationContext(),"关于我们",Toast.LENGTH_SHORT).show();
                break;
            case R.id.wode_touxiang:
                Intent intent7 = new Intent();
                intent7.setClass(ScrollingActivity.this, genrenziliaoActivity.class);
                ScrollingActivity.this.startActivity(intent7);
                finish();
                break;
            case R.id.iv_more:
                Intent intent8 = new Intent();
                intent8.setClass(ScrollingActivity.this, SettingsActivity.class);
                ScrollingActivity.this.startActivity(intent8);
                finish();
                break;

            default:
                break;
        }
    }

}
