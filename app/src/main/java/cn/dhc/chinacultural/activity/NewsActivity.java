package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/23.
 */

public class NewsActivity extends Activity {

    private TextView title;
    private TextView www;
    private TextView time,addpl;
    private ImageView img,back,iv_pl,iv_more;
    private TextView content;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_layout);
        title=(TextView)findViewById(R.id.title);
        www=(TextView)findViewById(R.id.tv_w);
        time=(TextView)findViewById(R.id.tv_time);
        img=(ImageView)findViewById(R.id.iv_p);
        back=findViewById(R.id.iv_back);
        iv_pl=findViewById(R.id.iv_pllist);
        iv_more=findViewById(R.id.iv_more);
        addpl=findViewById(R.id.tv_addpl);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //结束当前的 Activity
                NewsActivity.this.finish();
            }
        });
        iv_pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewsActivity.this,PInglunActivity.class);
                startActivity(intent);
            }
        });
        iv_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseDialog baseDialog=new BaseDialog(NewsActivity.this){
//                    @Override
//                    public void amble() {
//                    }
//                    @Override
//                    public void photo() {
//                    }
                };
                baseDialog.show();
            }
        });
        addpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final BaseDialog2 baseDialog2=new BaseDialog2(NewsActivity.this){
//                    @Override
//                    public void amble() {
//                    }
//                    @Override
//                    public void photo() {
//                    }
                };
                baseDialog2.show();
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        baseDialog2.showKeyboard();
                    }
                }, 200);
            }
        });
    }
}
