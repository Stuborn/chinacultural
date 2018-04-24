package cn.dhc.chinacultural.activity;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import java.lang.reflect.Field;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.widget.CCProgressDialog;

/**
 * Created by zbw on 2018/4/18 15:58.
 */

public class BaseAvtivity extends AppCompatActivity {
	/**
	 * 是否禁止旋转屏幕
	 **/
	private boolean isAllowScreenRoate = false;
	private CCProgressDialog ccProgressDialog;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//是否禁止屏幕旋转
		if (!isAllowScreenRoate) {
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		}
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			try {
				Class decorViewClazz = Class.forName("com.android.internal.policy.DecorView");
				Field field = decorViewClazz.getDeclaredField("mSemiTransparentStatusBarColor");
				field.setAccessible(true);
				field.setInt(getWindow().getDecorView(), Color.TRANSPARENT);  //改为透明
			} catch (Exception e) {
			}
		}
	}
	/**
	 * 标题上的返回按钮点击事件处理
	 *
	 * @param v
	 */
	public void onBack(View v) {
		this.finish();
	}

	//初始化加载框
	protected void initProgressDialog() {
		ccProgressDialog = CCProgressDialog.create(this, getResources().getString(R.string.common_loading), true, new DialogInterface.OnCancelListener() {
			@Override
			public void onCancel(DialogInterface dialog) {
				ccProgressDialog.dismiss();
			}
		});
	}

}
