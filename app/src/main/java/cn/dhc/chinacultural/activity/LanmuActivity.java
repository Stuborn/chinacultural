package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

public class LanmuActivity extends Activity {

    private GridView mygridview;
    private ListView listview;
    private ImageView iv_back,iv_del;
    private Button btn_manager,btn_lanmu;
    private int img1[]={R.drawable.lanmuredian,R.drawable.lanmuredian,R.drawable.lanmuredian};
    private String txt1[]={"文化北京","文化北京","文化北京"};

    private String txt2[]={"军事","军事","军事","+"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanmu_layout);

        mygridview=findViewById(R.id.gv_lanmu);
        listview=findViewById(R.id.lv_dingyue);
        List list1=new ArrayList();
        for(int i=0;i<txt1.length;i++)
        {
            Map map=new HashMap();
            map.put("txt1",txt1[i]);
            map.put("img1",img1[i]);
            list1.add(map);
        }
        List list2=new ArrayList();
        for(int i=0;i<txt2.length;i++)
        {
            Map map=new HashMap();
            map.put("txt2",txt2[i]);
            list2.add(map);
        }
        SimpleAdapter adepter=new SimpleAdapter(this
                ,list1,
                R.layout.lanmulist_layout,
                new String[]{"img1","txt1"}
                ,new int[]{R.id.iv_lanmuicon,R.id.tv_title});
        listview.setAdapter(adepter);
        SimpleAdapter gadepter=new SimpleAdapter(this
                ,list2,
                R.layout.gridview_layout,
                new String[]{"txt2"}
                ,new int[]{R.id.biaoqian});
        mygridview.setAdapter(gadepter);
        iv_back=findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LanmuActivity.this.finish();
            }
        });
        iv_del=findViewById(R.id.iv_del);
        btn_manager=findViewById(R.id.btn_lanmu_mange);
        btn_lanmu=findViewById(R.id.btn_lanmu);
        btn_manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_manager.setVisibility(View.GONE);
                btn_lanmu.setVisibility(View.VISIBLE);
//                iv_del.setVisibility(View.VISIBLE);
                listview.setVisibility(View.GONE);
            }
        });
        btn_lanmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_lanmu.setVisibility(View.GONE);
                btn_manager.setVisibility(View.VISIBLE);
//                iv_del.setVisibility(View.GONE);
                listview.setVisibility(View.VISIBLE);
            }
        });
        mygridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView=view.findViewById(R.id.biaoqian);
                if(textView.getText().equals("+")){
                    Intent intent=new Intent(LanmuActivity.this,MoreLanmuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
