package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;

public class SearchAfterActivity extends Activity {
    private TextView tv_cancel,tv_find;
    private ImageView iv_shanchu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchafter_layout);
        tv_cancel=findViewById(R.id.tv_cancel);
        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchAfterActivity.this.finish();
            }
        });
        tv_find=findViewById(R.id.tv_find);
        tv_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchAfterActivity.this,SearchActivity.class);
                startActivity(intent);
                SearchAfterActivity.this.finish();
            }
        });
        iv_shanchu=findViewById(R.id.iv_shanchu);
        iv_shanchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchAfterActivity.this,SearchActivity.class);
                startActivity(intent);
                SearchAfterActivity.this.finish();
            }
        });
    }
}
