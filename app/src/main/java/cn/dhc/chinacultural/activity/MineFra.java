package cn.dhc.chinacultural.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/20.
 */

public class MineFra extends Fragment {
    private View view;
    // 单例(方法二)
    private static MineFra fa;
    public static MineFra getMineFra() {
        if (fa == null) {
            fa = new MineFra();
        }
        return fa;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.mine_layout, container, false);
        return   view;
    }
}
