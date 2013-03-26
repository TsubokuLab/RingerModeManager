package jp.tsubo.ane.android;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class SetVibrateModeFunction implements FREFunction {
  private AudioManager mAudio;
	private Vibrator mVibrator;
	@Override
	public FREObject call(FREContext context, FREObject[] arg1) {
		// TODO 自動生成されたメソッド・スタブ
		Activity activity = context.getActivity();
		mAudio = (AudioManager) activity.getSystemService(Context.AUDIO_SERVICE);
		mAudio.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
		mVibrator.vibrate(300);
		return null;
	}

}
