package cn.dhc.chinacultural.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.dhc.chinacultural.R;


public class ChuangzuoActivity extends AppCompatActivity implements View.OnClickListener {

    ListView mylistview;
    TextView huida, pinglun, txt1, txt2, txt3, txt4;
    ImageView back;
    LinearLayout li;


    String biaoti[] = {"20亿年前的地下水你喝过么？",
            "安卓病毒爆发，影响2000万用户，看看你的手机中招了吗！"
    };

    String neirong[] = {"水是生命之源，正是因为地球有水存在，" +
            "所以才孕育出了生命。这些26亿年前的水不仅向我们展示了不同时期的环境状况。" +
            "也为我们探索火星提供了有价值的信息。25亿年前，地球上已经有海洋了，当前的理" +
            "论认为至少在38亿年前，地球海洋中就有生命存在，至于陆地生命最早是何时出现，" +
            "目前仍然是个未知数。不过，对于20多亿年前海洋的研究，我们已经取得了一些发现。" +
            "亿万年前的水又是什么味道的呢。", "腾讯TRP-AI反病毒引擎捕获到一个恶意推送信息的软" +
            "件开发工具包（SDK）——“寄生推”，它如“寄生虫”一般的恶意推广手段，正在严重影响超过2" +
            "000千万手机用户的使用体验。通过预留的“后门”，云控开启恶意功能，进行恶意广告行为和应用推" +
            "广，目前已有300多款知名应用受“寄生推”SDK感染。"};

    String shijian[] = {"2010-10-12", "2011-10-12"};
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;
    private RelativeLayout top_title;
    private TextView textView3;
    private TextView textView4;
    private LinearLayout ll_1;
    private ListView listview_my;
    private TextView textView8;
    private LinearLayout pinglun_li;
    private LinearLayout ll_plk;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wodechuangzuo_layout);
        initView();


        huida = this.findViewById(R.id.huida);
        pinglun = this.findViewById(R.id.pinglun);
        huida.setTextColor(Color.RED);

        txt1 = findViewById(R.id.textView3);
        txt2 = findViewById(R.id.textView4);

        txt3 = findViewById(R.id.textView8);


        huida.setOnClickListener(this);
        pinglun.setOnClickListener(this);

        li = findViewById(R.id.pinglun_li);

        mylistview = this.findViewById(R.id.listview_my);
        listvieA();

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.huida:
                ll_1.setVisibility(View.VISIBLE);

                listview_my.setVisibility(View.VISIBLE);

                pinglun_li.setVisibility(View.VISIBLE);

                ll_plk.setVisibility(View.GONE);
                huida.setTextColor(Color.RED);
                pinglun.setTextColor(Color.BLACK);
                txt3.setText("没有更多内容");
                txt1.setText("2个回答");
                txt2.setText("按时间排序");
                li.setBackgroundResource(0);
                listvieA();
                break;
            case R.id.pinglun:
                huida.setTextColor(Color.BLACK);
                pinglun.setTextColor(Color.RED);
                txt1.setText("");
                txt2.setText("");
                mylistview.setAdapter(null);
                if (txt1.getText().toString() == null || txt1.getText().toString() == "") {


                    ll_1.setVisibility(View.GONE);

                    listview_my.setVisibility(View.GONE);

                    pinglun_li.setVisibility(View.GONE);

                    ll_plk.setVisibility(View.VISIBLE);
                    txt3.setText("");
                }


                break;

            default:
                break;
        }

    }

    public void listvieA() {
        List list = new ArrayList();

        for (int i = 0; i < shijian.length; i++) {
            Map map = new HashMap();
            map.put("neirong", neirong[i]);
            map.put("biaoti", biaoti[i]);
            map.put("shijian", shijian[i]);
            list.add(map);
        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list,
                R.layout.listview_layout,
                new String[]{"biaoti", "neirong", "shijian"},
                new int[]{R.id.list_biaoti, R.id.list_neirong, R.id.list_shijian});//适配器

        mylistview.setAdapter(simpleAdapter);//启动适配器
    }

    private void initView() {
        title_back = (TextView) findViewById(R.id.title_back);
        title_back.setText("我的创作");
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tv_center = (TextView) findViewById(R.id.tv_center);
        iv_add = (ImageView) findViewById(R.id.iv_add);
        top_title = (RelativeLayout) findViewById(R.id.top_title);
        top_title.setOnClickListener(this);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
        ll_1 = (LinearLayout) findViewById(R.id.ll_1);
        ll_1.setOnClickListener(this);
        listview_my = (ListView) findViewById(R.id.listview_my);

        textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(this);
        pinglun_li = (LinearLayout) findViewById(R.id.pinglun_li);
        pinglun_li.setOnClickListener(this);
        ll_plk = (LinearLayout) findViewById(R.id.ll_plk);
        ll_plk.setOnClickListener(this);
    }
}
