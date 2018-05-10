package cn.dhc.chinacultural.activity;

import android.app.Fragment;
import android.content.DialogInterface;

import cn.dhc.chinacultural.R;
import cn.dhc.chinacultural.widget.CCProgressDialog;

/**
 * Created by zbw on 2018/4/27 04:10.
 */

public class BaseFragment extends Fragment{
	protected CCProgressDialog ccProgressDialog;
	//初始化加载框
	protected void initProgressDialog() {
		ccProgressDialog = CCProgressDialog.create(getActivity(), getResources().getString(R.string.common_loading), true, new DialogInterface.OnCancelListener() {
			@Override
			public void onCancel(DialogInterface dialog) {
				ccProgressDialog.dismiss();
			}
		});
	}
}
