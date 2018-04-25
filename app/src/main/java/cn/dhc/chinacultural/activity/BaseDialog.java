package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/25.
 */

public abstract  class BaseDialog extends Dialog implements View.OnClickListener{

    private Activity activity;
    private Button btn_cancel;

    public BaseDialog(Activity activity) {
        super(activity, R.style.MyDialogTheme);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_layout);

//        flt_amble_upload = (FrameLayout) findViewById(R.id.flt_amble_upload);
//        flt_take_photo_upload = (FrameLayout) findViewById(R.id.flt_take_photo_upload);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);
//
//        flt_amble_upload.setOnClickListener(this);
//        flt_take_photo_upload.setOnClickListener(this);
        btn_cancel.setOnClickListener(this);

        setViewLocation();
        setCanceledOnTouchOutside(true);//外部点击取消
    }

    /**
     * 设置dialog位于屏幕底部
     */
    private void setViewLocation(){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;

        Window window = this.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.x = 0;
        lp.y = height;
        lp.width = ViewGroup.LayoutParams.MATCH_PARENT;
        lp.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        // 设置显示位置
        onWindowAttributesChanged(lp);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.flt_amble_upload:
//                amble();
//                this.cancel();
//                break;
//            case R.id.flt_take_photo_upload:
//                photo();
//                this.cancel();
//                break;
            case R.id.btn_cancel:
                this.cancel();
                break;
        }
    }

//    public abstract void amble();
//    public abstract void photo();

}
