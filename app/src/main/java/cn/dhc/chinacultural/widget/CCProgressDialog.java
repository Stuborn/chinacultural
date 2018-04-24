
package cn.dhc.chinacultural.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import cn.dhc.chinacultural.R;


public class CCProgressDialog extends Dialog {

    private static final int STEP_DURATION = 20;


    private static final Interpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();

    private static final float start = 10.0f;
    private static final float dest = 300.0f;

    private int mCurrentStep = 0;
    private int mSteps = 32;
    private boolean forward = true;

	public CCProgressDialog(Context context) {
		super(context);
	}

	public CCProgressDialog(Context context, int theme) {
		super(context, theme);
	}
	
	private Runnable mStepper = new Runnable() {
		
		@Override
		public void run() {
			float fraction = DEFAULT_INTERPOLATOR.getInterpolation(mCurrentStep / (float) mSteps);
            float newValue = start + (dest - start) * fraction;
//            LogUtils.i("mCurrentStep=" + mCurrentStep + " fraction=" + fraction + " newValue=" + newValue);
            onAnimationStep(newValue);
            
            if (forward) {
            	if (mCurrentStep < mSteps) {
            		mCurrentStep++;
                    schedule(true);
				} else {
					forward = false;
					schedule(true);
				}
            } else {
            	if (mCurrentStep > 0) {
            		mCurrentStep--;
                    schedule(true);
				} else {
					forward = true;
					schedule(true);
				}
            }
		}
	};


    private void onAnimationStep(float value) {
    	TextView txt = (TextView)this.findViewById(R.id.common_pdialog_message_tv);
//		Shader shader = new RadialGradient(value, 20.0f, 50.0f, Color.WHITE, Color.GRAY, TileMode.CLAMP);
//		txt.getPaint().setShader(shader);
//		txt.invalidate();
    }
	

    private void schedule(boolean delayed) {
    	TextView mView = (TextView)this.findViewById(R.id.common_pdialog_message_tv);
        Handler handler = mView.getHandler();
//        if (handler != null) {
//            if (delayed) {
//                handler.postDelayed(mStepper, STEP_DURATION);
//            } else {
//                handler.post(mStepper);
//            }
//        }
    }
    

	public void setMessage(CharSequence message) {
		if(message != null && message.length() > 0) {
			findViewById(R.id.common_pdialog_message_tv).setVisibility(View.VISIBLE);
			TextView txt = (TextView)findViewById(R.id.common_pdialog_message_tv);
			txt.setText(message);
			txt.invalidate();
		}
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus){
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			this.mCurrentStep = 0;
			this.schedule(false);
		} else {
			TextView mView = (TextView)this.findViewById(R.id.common_pdialog_message_tv);
	        Handler handler = mView.getHandler();
	        handler.removeCallbacks(this.mStepper);
		}
    }
	

	public static CCProgressDialog show(Context context, CharSequence message,
                                        boolean cancel, final OnCancelListener listener) {
		final CCProgressDialog dialog = new CCProgressDialog(context, R.style.CCProgressDialog);
		dialog.setTitle("");
		dialog.setContentView(R.layout.common_loading_dialog);

		if(message == null || message.length() == 0) {
			dialog.findViewById(R.id.common_pdialog_message_tv).setVisibility(View.GONE);
		} else {
			TextView txt = (TextView)dialog.findViewById(R.id.common_pdialog_message_tv);
			Shader shader = new RadialGradient(start, 20.0f, 50.0f, Color.WHITE, Color.GRAY, TileMode.CLAMP);
//			txt.getPaint().setShader(shader);
			txt.setText(message);
		}
		dialog.setCancelable(false);
//		dialog.setOnCancelListener(listener);

		ImageView iv = (ImageView)dialog.findViewById(R.id.common_pdialog_cancel_iv);
		if (cancel) {
			iv.setVisibility(View.VISIBLE);
			iv.setClickable(true);
			iv.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (listener != null) {
						listener.onCancel(dialog);
					}
				}
			});
		} else {
			iv.setVisibility(View.GONE);
		}

		dialog.getWindow().getAttributes().gravity = Gravity.CENTER;
		WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
		lp.dimAmount = .3f;
		dialog.getWindow().setAttributes(lp);
//		dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		if (dialog!=null) {
			dialog.show();
		}
		return dialog;
	}


	public static CCProgressDialog create(Context context, CharSequence message,
                                          boolean cancel, final OnCancelListener listener) {
		final CCProgressDialog dialog = new CCProgressDialog(context, R.style.CCProgressDialog);
		dialog.setTitle("");
		dialog.setContentView(R.layout.common_loading_dialog);
		
		if(message == null || message.length() == 0) {
			dialog.findViewById(R.id.common_pdialog_message_tv).setVisibility(View.GONE);
		} else {
			TextView txt = (TextView)dialog.findViewById(R.id.common_pdialog_message_tv);
//			Shader shader = new RadialGradient(start, 20.0f, 50.0f, Color.WHITE, Color.GRAY, TileMode.CLAMP);
//			txt.getPaint().setShader(shader);
			txt.setText(message);
		}
		dialog.setCancelable(false);
		//dialog.setOnCancelListener(listener);
		
		ImageView iv = (ImageView)dialog.findViewById(R.id.common_pdialog_cancel_iv);
		if (cancel) {
			iv.setVisibility(View.GONE);
			iv.setClickable(true);
			iv.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if (listener != null) {
						listener.onCancel(dialog);
					}
				}
			});
		} else {
			iv.setVisibility(View.GONE);
		}
		
		dialog.getWindow().getAttributes().gravity = Gravity.CENTER;
		WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
		lp.dimAmount = .3f;
		dialog.getWindow().setAttributes(lp); 
//		dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		return dialog;
	}
	
}
