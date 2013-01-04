package vn.com.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class PowerConnectionReciever extends BroadcastReceiver {

	
	int a = 10;
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		
		
		boolean isCharing = (status == BatteryManager.BATTERY_STATUS_CHARGING) || (status == BatteryManager.BATTERY_STATUS_FULL);
		
		//connect by usb or ac pluged
		int chargPlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		boolean isUsb = chargPlug == BatteryManager.BATTERY_PLUGGED_USB;
		boolean isAc = chargPlug == BatteryManager.BATTERY_PLUGGED_AC;
		
		//remain percent
		
		
		Toast.makeText(context, "status::: " + status+  " --isCharing: " + isCharing + " --- isUSB: " + isUsb, Toast.LENGTH_LONG).show();
		
		
		
		
	}

}
