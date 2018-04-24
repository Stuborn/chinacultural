package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.dhc.chinacultural.R;

public class genrenziliaoActivity extends AppCompatActivity implements View.OnClickListener {


    LinearLayout shejiao,touxiang,yonghu,shengri,shouji;
    ImageView back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerenziliao_layout);

        shejiao=findViewById(R.id.ziliao_shejiao);
        touxiang=findViewById(R.id.ziliao_touxiang);
        yonghu=findViewById(R.id.ziliao_yonghu);
        shengri=findViewById(R.id.ziliao_shengri);
        shouji=findViewById(R.id.ziliao_shouji);
        back=findViewById(R.id.iv_back);

        shejiao.setOnClickListener(this);
        touxiang.setOnClickListener(this);
        yonghu.setOnClickListener(this);
        shengri.setOnClickListener(this);
        shouji.setOnClickListener(this);
        back.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ziliao_touxiang:
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ziliao_yonghu:
                Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ziliao_shengri:
                Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ziliao_shouji:
                Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ziliao_shejiao:
                Intent intent = new Intent();
                intent.setClass(genrenziliaoActivity.this, shejiaobdActivity.class);
                genrenziliaoActivity.this.startActivity(intent);
                finish();
                break;
            case R.id.iv_back:
                Intent intent1 = new Intent();
                intent1.setClass(genrenziliaoActivity.this, ScrollingActivity.class);
                genrenziliaoActivity.this.startActivity(intent1);
                finish();
                break;
            default:
                break;
        }
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // TODO Auto-generated method stub
        if(item.getItemId() == android.R.id.home)
        {
            Intent intent = new Intent();
            intent.setClass(genrenziliaoActivity.this, ScrollingActivity.class);
            genrenziliaoActivity.this.startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
