package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import cn.dhc.chinacultural.R;

public class wodejifenActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wodejifen_activity);
        back=findViewById(R.id.iv_back);

        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.iv_back:
                Intent intent = new Intent();
                intent.setClass(wodejifenActivity.this, ScrollingActivity.class);
                wodejifenActivity.this.startActivity(intent);
                finish();
                break;
        }
    }

}
