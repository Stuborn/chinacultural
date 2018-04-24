package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class wenziActivity extends AppCompatActivity {

    private RadioGroup mSexRg;
    ImageView back;

    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wenzi);

        back=findViewById(R.id.iv_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(wenziActivity.this, SettingsActivity.class);
                wenziActivity.this.startActivity(intent);
                finish();
            }
        });



        initView();
    }
    private void initView() {
//        初始化按钮对象
        mSexRg = (RadioGroup)findViewById(R.id.zihao);
//        给按钮对象设置监听器
        mSexRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                     case R.id.larger:
                         Toast.makeText(getApplicationContext(),"超大",Toast.LENGTH_SHORT).show();
                          break;
                     case R.id.big:
                         Toast.makeText(getApplicationContext(),"大",Toast.LENGTH_SHORT).show();
                         break ;
                     case R.id.middle:
                         Toast.makeText(getApplicationContext(),"中",Toast.LENGTH_SHORT).show();
                         break ;
                     case R.id.small:
                         Toast.makeText(getApplicationContext(),"小",Toast.LENGTH_SHORT).show();
                          break ;
                     default:
                          break;
                }
            }
        });
    }

}
