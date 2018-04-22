package cn.dhc.chinacultural.app;

import android.app.Application;

import cn.dhc.chinacultural.utils.ScreenManager;

/**
 * Created by zbw on 2018/4/19 15:27.
 */

public class MyApplication extends Application {

	//堆栈管理工具
	public ScreenManager mScreenManager;

	public static MyApplication instance;

	public static MyApplication getInstance() {
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		if (instance == null) {
			instance = MyApplication.this;
		}
		mScreenManager = ScreenManager.getScreenManager();
		
	}
}
