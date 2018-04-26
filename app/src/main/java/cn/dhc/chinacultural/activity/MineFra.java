package cn.dhc.chinacultural.activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/20.
 */

public class MineFra extends Fragment implements View.OnClickListener {
    private View view;
    // 单例(方法二)
    private static MineFra fa;
    private TextView title_back;
    private TextView tv_center;
    private ImageView iv_add;
    private RelativeLayout top_title;
    private ImageView wode_touxiang;
    private Button login_btn;
    private LinearLayout wodechuangzuo;
    private LinearLayout wodeshoucang;
    private LinearLayout wodedingyue;
    private LinearLayout wodejifen;
    private LinearLayout wentifankui;
    private LinearLayout guanyu;
    private ImageView iv_mail_list;
    private TextView tv_mail_list;
    private RelativeLayout rl_phone_list;
    private ImageView iv_mail_list2;
    private TextView tv_mail_list2;
    private RelativeLayout rl_phone_list2;
    private ImageView iv_mail_list3;
    private TextView tv_mail_list3;
    private RelativeLayout rl_phone_list3;
    private ImageView iv_mail_list4;
    private TextView tv_mail_list4;
    private RelativeLayout rl_phone_list4;
    private ImageView iv_mail_list5;
    private TextView tv_mail_list5;
    private RelativeLayout rl_phone_list5;
    private ImageView iv_mail_list6;
    private TextView tv_mail_list6;
    private RelativeLayout rl_phone_list6;
    private Intent intent;

    public static MineFra getMineFra() {
        if (fa == null) {
            fa = new MineFra();
        }
        return fa;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_scrolling, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        title_back = (TextView) view.findViewById(R.id.title_back);
        tv_center = (TextView) view.findViewById(R.id.tv_center);
        iv_add = (ImageView) view.findViewById(R.id.iv_add);
        iv_add.setOnClickListener(this);
        top_title = (RelativeLayout) view.findViewById(R.id.top_title);
        wode_touxiang = (ImageView) view.findViewById(R.id.wode_touxiang);
        wode_touxiang.setOnClickListener(this);
        login_btn = (Button) view.findViewById(R.id.login_btn);
        wodechuangzuo = (LinearLayout) view.findViewById(R.id.wodechuangzuo);
        wodeshoucang = (LinearLayout) view.findViewById(R.id.wodeshoucang);
        wodedingyue = (LinearLayout) view.findViewById(R.id.wodedingyue);
        wodejifen = (LinearLayout) view.findViewById(R.id.wodejifen);
        wentifankui = (LinearLayout) view.findViewById(R.id.wentifankui);
        guanyu = (LinearLayout) view.findViewById(R.id.guanyu);

        login_btn.setOnClickListener(this);
        iv_mail_list = (ImageView) view.findViewById(R.id.iv_mail_list);
        iv_mail_list.setOnClickListener(this);
        tv_mail_list = (TextView) view.findViewById(R.id.tv_mail_list);
        rl_phone_list = (RelativeLayout) view.findViewById(R.id.rl_phone_list);
        rl_phone_list.setOnClickListener(this);
        rl_phone_list2 = (RelativeLayout) view.findViewById(R.id.rl_phone_list2);
        rl_phone_list2.setOnClickListener(this);
        rl_phone_list3 = (RelativeLayout) view.findViewById(R.id.rl_phone_list3);
        rl_phone_list3.setOnClickListener(this);
        rl_phone_list4 = (RelativeLayout) view.findViewById(R.id.rl_phone_list4);
        rl_phone_list4.setOnClickListener(this);
        rl_phone_list5 = (RelativeLayout) view.findViewById(R.id.rl_phone_list5);
        rl_phone_list5.setOnClickListener(this);
        rl_phone_list6 = (RelativeLayout) view.findViewById(R.id.rl_phone_list6);
        rl_phone_list6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:

                break;
            case R.id.rl_phone_list:
                intent = new Intent();
                intent.setClass(getContext(), ChuangzuoActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_phone_list2:
                intent = new Intent();
                intent.setClass(getContext(), wodeshoucang.class);
                startActivity(intent);
                break;
            case R.id.rl_phone_list3:
                intent = new Intent();
                intent.setClass(getContext(), wodedingyueActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_phone_list4:
                intent = new Intent();
                intent.setClass(getContext(), wodejifenActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_phone_list5:
                intent = new Intent();
                intent.setClass(getContext(), wentiActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_phone_list6:
                Toast.makeText(getContext(), "关于我们", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_add:
                intent = new Intent();
                intent.setClass(getContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.wode_touxiang:
                intent = new Intent();
                intent.setClass(getContext(), genrenziliaoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
