package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cn.dhc.chinacultural.R;

/**
 * 图集详情页面
 */
public class ImagesActivity extends Activity {

    private ImageView pinglun,iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_layout);
        pinglun=findViewById(R.id.pinglun);
        iv_back=findViewById(R.id.iv_back);
        pinglun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImagesActivity.this,PInglunActivity.class);
                startActivity(intent);
            }
        });
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagesActivity.this.finish();
            }
        });
    }
}
