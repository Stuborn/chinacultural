package cn.dhc.chinacultural.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import cn.dhc.chinacultural.R;

/**
 * Created by WYHY on 2018/4/25.
 */

public abstract  class BaseDialog2 extends Dialog implements View.OnClickListener{

    private Activity activity;
    private Button btn_cancel;
    private EditText editText;

    public BaseDialog2(Activity activity) {
        super(activity, R.style.MyDialogTheme);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment_layout);

        editText=findViewById(R.id.et_com);
//        btn_cancel = findViewById(R.id.btn_cancel);
//
//        btn_cancel.setOnClickListener(this);

        setViewLocation();
        setCanceledOnTouchOutside(true);//外部点击取消
    }

    public void showKeyboard() {
        if(editText!=null){
            //设置可获得焦点
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            //请求获得焦点
            editText.requestFocus();
            //调用系统输入法
            InputMethodManager inputManager = (InputMethodManager) editText
                    .getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.showSoftInput(editText, 0);
        }
    }

    /**
     * 设置dialog位于屏幕底部
     */
    private void setViewLocation(){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
//        int height = dm.heightPixels;

        Window window = this.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.x = 0;
        lp.y = 30;
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
