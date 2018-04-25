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

public class QAFra extends Fragment {
    private View view;
    // 单例(方法二)
    private static QAFra fa;
    public static QAFra getQAFra() {
        if (fa == null) {
            fa = new QAFra();
        }
        return fa;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.qa_layout, container, false);
        return   view;
    }
}
