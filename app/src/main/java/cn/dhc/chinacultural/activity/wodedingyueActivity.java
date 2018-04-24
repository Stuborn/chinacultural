package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

public class wodedingyueActivity extends AppCompatActivity implements View.OnClickListener {

    GridView mygridview;
    ImageView img,back;
    int i=0;
    Button btn;
    String biaoqian[]={"头条","新闻","军事","滚动","直播","艺术家","图片","体育","两会",};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wodedingyue_ayout);

        mygridview=findViewById(R.id.wode_gridview);

        btn=findViewById(R.id.bianji_btn);
        back=findViewById(R.id.iv_back);

        img=findViewById(R.id.img);

        List list=new ArrayList();
        for(int i=1;i<biaoqian.length;i++)
        {
            Map map=new HashMap();
            map.put("biaoqian",biaoqian[i]);
            list.add(map);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.gridview_layout,new String[]{"biaoqian"}
        ,new int[]{R.id.biaoqian});

        mygridview.setAdapter(adapter);
        btn.setOnClickListener(this);
        back.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.bianji_btn:
                if(i==0)
                {
                    img.setVisibility(View.GONE);
                    btn.setText("完成");
                    i++;
                }else
                {
                    img.setVisibility(View.INVISIBLE);
                    btn.setText("编辑");
                    i--;
                }
                break;
            case R.id.iv_back:
                Intent intent = new Intent();
                intent.setClass(wodedingyueActivity.this, ScrollingActivity.class);
                wodedingyueActivity.this.startActivity(intent);
                finish();
            default:
                break;
        }
    }
}
