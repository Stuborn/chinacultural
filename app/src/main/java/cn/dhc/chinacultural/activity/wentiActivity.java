package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

public class wentiActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edit;
    ListView listview;
    ImageView back;

    String wen[]={"问：我不喜欢A类文章，想多看B类文章怎么办"
            ,"问：我不喜欢A类文章，想多看B类文章怎么办"
            ,"问：我不喜欢A类文章，想多看B类文章怎么办"
            ,"问：我不喜欢A类文章，想多看B类文章怎么办"
    };

    String da[]={"请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            ,"请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            ,"请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
            ,"请点击文章列表页中该文右下角的小叉号，并选择细分理由，系统会默认减少该类推荐"
    };

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wentifankui_layout);


        edit=findViewById(R.id.wenti_edit);

        listview=findViewById(R.id.listview_wenti);
        back=findViewById(R.id.iv_back);

        back.setOnClickListener(this);

        edit.setOnClickListener(this);
        setListview();




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.wenti_edit:
                Intent intent = new Intent();
                intent.setClass(wentiActivity.this, wentibianjiActivity.class);
                wentiActivity.this.startActivity(intent);
                finish();
                break;
            case R.id.iv_back:
                Intent intent1 = new Intent();
                intent1.setClass(wentiActivity.this, ScrollingActivity.class);
                wentiActivity.this.startActivity(intent1);
                finish();
                break;
            default:
                break;
        }
    }

    public void setListview(){
        List list=new ArrayList();

        for (int i=0;i<wen.length;i++)
        {
            Map map=new HashMap();
            map.put("wen",wen[i]);
            map.put("da",da[i]);
            list.add(map);
        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(),list,
                R.layout.wentifankui_listview,
                new String[]{"wen","da"},
                new int[]{R.id.wenti_txt,R.id.daan_txt});//适配器

        listview.setAdapter(simpleAdapter);//启动适配器
    }

}
