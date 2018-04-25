package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;

public class SearchActivity extends Activity {
    private TextView tv_cancel,tv_1,tv_2,tv_3,tv_4,tv_5,tv_6;
    private ImageView iv_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);
        tv_cancel=findViewById(R.id.tv_cancel);
        tv_1=findViewById(R.id.tv_1);
        iv_find=findViewById(R.id.find_img);
        tv_2=findViewById(R.id.tv_2);
        tv_3=findViewById(R.id.tv_3);
        tv_4=findViewById(R.id.tv_4);
        tv_5=findViewById(R.id.tv_5);
        tv_6=findViewById(R.id.tv_6);
        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchActivity.this.finish();
            }
        });
        iv_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchActivity.this,SearchAfterActivity.class);
                startActivity(intent);
            }
        });
    }
}
