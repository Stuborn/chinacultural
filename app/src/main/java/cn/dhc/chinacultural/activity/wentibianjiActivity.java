package cn.dhc.chinacultural.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class wentibianjiActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit;
    Button btn;
    ImageView back;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wentibianji_layout);
        initView();

        edit = findViewById(R.id.wenti_edit2);

        btn = findViewById(R.id.tijiao);


        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tijiao:
                Toast.makeText(getApplicationContext(), "提交按钮", Toast.LENGTH_SHORT);
                break;
            case R.id.title_back:
                finish();
                break;
            default:
                break;
        }
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("问题反馈");
        title_back.setOnClickListener(this);
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
    }
}
