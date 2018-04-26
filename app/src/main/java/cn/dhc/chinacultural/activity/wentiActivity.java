package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

public class wentiActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit;
    ListView listview;
    ImageView back;

    String wen[] = {"问：我不喜欢A类文章，想多看B类文章怎么办"
            , "问：我不喜欢A类文章，想多看B类文章怎么办"
            , "问：我不喜欢A类文章，想多看B类文章怎么办"
            , "问：我不喜欢A类文章，想多看B类文章怎么办"
    };

    String da[] = {"请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            , "请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            , "请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            , "请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
    };
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wentifankui_layout);
        initView();


        edit = findViewById(R.id.wenti_edit);

        listview = findViewById(R.id.listview_wenti);


        edit.setOnClickListener(this);
        setListview();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.wenti_edit:
                Intent intent = new Intent();
                intent.setClass(wentiActivity.this, wentibianjiActivity.class);
                wentiActivity.this.startActivity(intent);

                break;
            case R.id.title_back:
                finish();
                break;

            default:
                break;
        }
    }

    public void setListview() {
        List list = new ArrayList();

        for (int i = 0; i < wen.length; i++) {
            Map map = new HashMap();
            map.put("wen", wen[i]);
            map.put("da", da[i]);
            list.add(map);
        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list,
                R.layout.wentifankui_listview,
                new String[]{"wen", "da"},
                new int[]{R.id.wenti_txt, R.id.daan_txt});//适配器

        listview.setAdapter(simpleAdapter);//启动适配器
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("问题反馈");
        title_back.setOnClickListener(this);
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
    }
}
