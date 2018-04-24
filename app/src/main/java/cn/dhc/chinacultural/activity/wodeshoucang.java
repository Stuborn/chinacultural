package cn.dhc.chinacultural.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import cn.dhc.chinacultural.R;

public class wodeshoucang extends AppCompatActivity implements View.OnClickListener {

    ImageView back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wode_shoucang);
        back=findViewById(R.id.iv_back);

        back.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.iv_back:
                Intent intent = new Intent();
                intent.setClass(wodeshoucang.this, ScrollingActivity.class);
                wodeshoucang.this.startActivity(intent);
                finish();
                break;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        // TODO Auto-generated method stub
        if(item.getItemId() == android.R.id.home)
        {
            Intent intent = new Intent();
            intent.setClass(wodeshoucang.this, ScrollingActivity.class);
            wodeshoucang.this.startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
