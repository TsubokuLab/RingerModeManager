package jp.tsubo.ane.android
{
  import flash.external.ExtensionContext;
	
	public class RingerModeManager
	{
		private var context:ExtensionContext;
		
		public function RingerModeManager()
		{
			context = ExtensionContext.createExtensionContext("jp.tsubo.ane.android.RingerModeManager", null);
		}
		/**
		 * @exception Androidのオーディオ状態を取得します。0:サイレント 1:バイブレート 2:通常。
		 */
		public function getRingerMode():int
		{
			return context.call("GetRingerMode") as int;
		}
		/**
		 * @exception Androidのオーディオを通常モードに設定します。
		 */
		public function setNormalMode():void
		{
			context.call("SetNormalMode");
		}
		/**
		 * @exception Androidのオーディオをサイレントモードに設定します。
		 */
		public function setSilentMode():void
		{
			context.call("SetSilentMode");
		}
		/**
		 * @exception Androidのオーディオをバイブレートモードに設定します。
		 */
		public function setVibrateMode():void
		{
			context.call("SetVibrateMode");
		}
	}
}
