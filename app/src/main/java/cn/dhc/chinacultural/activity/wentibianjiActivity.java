package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class wentibianjiActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edit;
    Button btn;
    ImageView back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wentibianji_layout);

        edit=findViewById(R.id.wenti_edit2);
        back=findViewById(R.id.iv_back);

        btn=findViewById(R.id.tijiao);
        back.setOnClickListener(this);

        btn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tijiao:
                Toast.makeText(getApplicationContext(),"提交按钮",Toast.LENGTH_SHORT);
                break;
            case R.id.iv_back:
                Intent intent = new Intent();
                intent.setClass(wentibianjiActivity.this, wentiActivity.class);
                wentibianjiActivity.this.startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
}
