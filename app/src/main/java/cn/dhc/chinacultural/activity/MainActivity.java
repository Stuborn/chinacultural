package cn.dhc.chinacultural.activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import cn.dhc.chinacultural.R;

public class MainActivity extends BaseAvtivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.massage://资讯
                    changeFragment(new MassageFra().getMassageFra());
                    return true;
                case R.id.government://政务
                    changeFragment(new GovernmentFra().getGovernmentFra());
                    return true;
                case R.id.QA://问答
                    changeFragment(new QAFra().getQAFra());
                    return true;
                case R.id.find://发现
                    changeFragment(new FindFra().getFindFra());
                    return true;
                case R.id.mine://我的
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    MineFra mineFra = new MineFra().getMineFra();

                    mineFra.setArguments(bundle);
                    changeFragment(mineFra);
                    return true;
            }
            return false;
        }
    };
    private Intent intent;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = getIntent();
        name = intent.getStringExtra("name");
        changeFragment(new MassageFra().getMassageFra());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void changeFragment(Fragment fm) {
        android.app.FragmentManager FragmentManager = getFragmentManager();
        android.app.FragmentTransaction transaction = FragmentManager.beginTransaction();
        transaction.replace(R.id.content, fm);
        transaction.commit();
    }

}
