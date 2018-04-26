package cn.dhc.chinacultural.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class wenziActivity extends AppCompatActivity {

    private RadioGroup mSexRg;
    ImageView back;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wenzi);


        initView();
    }

    private void initView() {
//        初始化按钮对象
        mSexRg = (RadioGroup) findViewById(R.id.zihao);
//        给按钮对象设置监听器
        mSexRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.larger:
                        Toast.makeText(getApplicationContext(), "超大", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.big:
                        Toast.makeText(getApplicationContext(), "大", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.middle:
                        Toast.makeText(getApplicationContext(), "中", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.small:
                        Toast.makeText(getApplicationContext(), "小", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("正文字号");
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tv_center = (TextView) findViewById(R.id.tv_center);

        iv_add = (ImageView) findViewById(R.id.iv_add);

    }

}
