package jp.tsubo.ane.android;
import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.adobe.fre.FREFunction;


public class RingerModeManager implements FREExtension {
  public FREContext createContext(String arg0) {
		// TODO 自動生成されたメソッド・スタブ
		FREContext context = new FREContext(){
			@Override
			public Map<String, FREFunction> getFunctions() {
				HashMap<String, FREFunction> result = new HashMap<String, FREFunction>();
				result.put("GetRingerMode", new GetRingerModeFunction());
				result.put("SetNormalMode", new SetNormalModeFunction());
				result.put("SetSilentMode", new SetSilentModeFunction());
				result.put("SetVibrateMode", new SetVibrateModeFunction());
				return result;
			}
			@Override
			public void dispose(){

			}
		};

		return context;
	}

	@Override
	public void dispose() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
