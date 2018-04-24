package cn.dhc.chinacultural.activity;


import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.dhc.chinacultural.R;


/**
 * A {@link PreferenceActivity} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class SettingsActivity extends AppCompatActivity {

    LinearLayout li1,li2,li3;
    ImageView img,back;
    int i=0;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_layout);
        li1=(LinearLayout) findViewById(R.id.li1);
        li2=(LinearLayout) findViewById(R.id.li2);
        li3=(LinearLayout) findViewById(R.id.li3);
        img=findViewById(R.id.kaiguan);
        back=findViewById(R.id.iv_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent();
                intent8.setClass(SettingsActivity.this, ScrollingActivity.class);
                SettingsActivity.this.startActivity(intent8);
                finish();
            }
        });








        li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"清理缓存",Toast.LENGTH_SHORT).show();
            }
        });
        li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0)
                {
                    img.setImageResource(R.drawable.kai);
                    i=1;
                }
                else
                {
                    img.setImageResource(R.drawable.guan);
                    i=0;
                }
            }
        });
        li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SettingsActivity.this, wenziActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        });
    }

}
