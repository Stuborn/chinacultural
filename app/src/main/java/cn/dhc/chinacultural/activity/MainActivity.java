package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import cn.dhc.chinacultural.R;

public class MainActivity extends Activity {

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
                    changeFragment(new MineFra().getMineFra());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
