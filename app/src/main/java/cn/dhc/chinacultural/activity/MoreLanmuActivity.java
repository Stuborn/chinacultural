package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/25.
 */

public class MoreLanmuActivity extends Activity {
    private ImageView iv_back;
    private ListView lv_lanmuitem,lv_l;
    private TextView tv_cel;
    private int img1[]={R.drawable.lanmuredian, R.drawable.lanmuredian,R.drawable.lanmuredian};
    private String txt1[]={"文化北京","文化北京","文化北京"};
    private String txt2[]={"默认","推荐","地方"};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morelanmu_layout);

        iv_back=findViewById(R.id.iv_back);
        lv_lanmuitem=findViewById(R.id.lv_lanmuitem);
        lv_lanmuitem.setDivider(null);
        lv_l=findViewById(R.id.lv_l);


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
        lv_l.setAdapter(adepter);
        SimpleAdapter gadepter=new SimpleAdapter(this
                ,list2,
                R.layout.more_layout,
                new String[]{"txt2"}
                ,new int[]{R.id.tv_txt});
        lv_lanmuitem.setAdapter(gadepter);
        lv_lanmuitem.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv_lanmuitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView=view.findViewById(R.id.tv_txt);

            }
        });

        iv_back=findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoreLanmuActivity.this.finish();
            }
        });
        tv_cel=findViewById(R.id.tv_cancel);
        tv_cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoreLanmuActivity.this.finish();
            }
        });
    }
}
