package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;

public class PInglunActivity extends Activity{

    ListView listview;
    String txt[]={"tv_name"};
    ImageView img,iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pl_layout);

        listview=findViewById(R.id.lv_pl);
        img=findViewById(R.id.fragment_order_new_empty_view);
        Setlistview();
        iv_back=findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PInglunActivity.this.finish();
            }
        });

    }
    public void Setlistview(){
        List list=new ArrayList();
        Map map=new HashMap();
        map.put("ti",txt[0]);
        list.add(map);
        img.setVisibility(View.GONE);

        SimpleAdapter adepter=new SimpleAdapter(this
                ,list,
                R.layout.commentlist_layout,
                new String[]{"ti"}
                ,new int[]{R.id.tv_name});
        listview.setAdapter(adepter);
    }
}
