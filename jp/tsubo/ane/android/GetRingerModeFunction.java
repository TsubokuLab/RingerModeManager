package jp.tsubo.ane.android;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

public class GetRingerModeFunction implements FREFunction {
  private AudioManager mAudio;

	@Override
	public FREObject call(FREContext context, FREObject[] arg1) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Activity activity = context.getActivity();
			mAudio = (AudioManager) activity.getSystemService(Context.AUDIO_SERVICE);
			int rtn = mAudio.getRingerMode();
		    return FREObject.newObject(rtn);
		} catch (FREWrongThreadException e) {
		    e.printStackTrace();
		}
		return null;
	}

}
