package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/24.
 */

public class RegisterActivity extends Activity {
    private Button btn_in,btn_register;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        btn_in=(Button)findViewById(R.id.btn_in);
        btn_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至 MainActivity
                Intent intent = new Intent(RegisterActivity.this, IndexActivity.class);
                startActivity(intent);
                //结束当前的 Activity
                RegisterActivity.this.finish();
            }
        });
        btn_register=(Button)findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至 MainActivity
                Intent intent = new Intent(RegisterActivity.this, IndexActivity.class);
                startActivity(intent);
                //结束当前的 Activity
                RegisterActivity.this.finish();
            }
        });
    }
}
