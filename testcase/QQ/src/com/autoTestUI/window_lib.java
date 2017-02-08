package com.autoTestUI;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class window_lib extends UiAutomatorTestCase{

	public static void windowtest(UiDevice device, String appName)
			throws UiObjectNotFoundException, RemoteException, IOException, InterruptedException {
		Date starttime;
		Date endtime;
		long launchTime;	
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

		starttime = new Date();
		System.out.println("----------Start time： " +  format.format(starttime));
		System.out.println("starttime:" +  System.currentTimeMillis());
		otoDisplayRun.execCmdNoSave("am start -n " + appName);
		
		endtime = new Date();
		System.out.println("----------结束时间： " +  format.format(endtime));
		System.out.println("endtime:" +  System.currentTimeMillis());
		
		launchTime = endtime.getTime() - starttime.getTime();
		System.out.println("----------APP launch 时间： " + launchTime +"ms");
		Thread.sleep(3000);
		
		// 改变窗体大小 将左边框向右侧拉动 改变大小
		if(IfExist("android:id/mwOuterBorder",device)){
			UiObject objectSide = new UiObject(new UiSelector().resourceId("android:id/mwOuterBorder"));
			android.graphics.Rect myAppSide = objectSide.getVisibleBounds();
			device.drag(myAppSide.left, myAppSide.top, myAppSide.left + 100,myAppSide.top, 2);
			Thread.sleep(2000);
			// 重新通过resourceId 获取窗口边界坐标，与预计的坐标不相等
			if(IfExist("android:id/mwOuterBorder",device)){
				UiObject objectSide1 = new UiObject(new UiSelector().resourceId("android:id/mwOuterBorder"));
				android.graphics.Rect myAppSide1 = objectSide1.getVisibleBounds();
				// 验证上一次拖动是否成功：10 pixcel 的误差
				if (myAppSide1.left < (myAppSide.left + 40)|| myAppSide1.left > (myAppSide.left + 60)) {
					System.out.println("----------[failed]:"+myAppSide.left+"->"+myAppSide1.left + "拖动左边框向右改变窗口大小失败！");
					}
				// 改变窗体大小 将左边框向左拉动 改变大小
				device.drag(myAppSide1.left, myAppSide1.top, myAppSide1.left - 100,myAppSide1.top, 2);
				Thread.sleep(2000);
				// 重新通过resourceId 获取窗口边界坐标
				if(IfExist("android:id/mwOuterBorder",device)){
					UiObject objectSide2 = new UiObject(new UiSelector().resourceId("android:id/mwOuterBorder"));
					android.graphics.Rect myAppSide2 = objectSide2.getVisibleBounds();
					// 验证上一次拖动是否成功
					if (myAppSide2.left < (myAppSide.left - 10)|| myAppSide2.left > (myAppSide.left + 10)) {
						System.out.println("----------[failed]:"+myAppSide2.left+"->"+myAppSide.left+"拖动左边框向左改变窗口大小失败！");
						}
					//拖动右下角，扩大窗口
					device.drag(myAppSide2.right - 1, myAppSide2.bottom - 1,myAppSide2.right + 100, myAppSide2.bottom + 100, 2);
					Thread.sleep(2000);
					// 重新通过resourceId 获取窗口边界坐标 下面拖动时，差几个像素点到边界 所以-2
					if(IfExist("android:id/mwOuterBorder",device)){
						UiObject objectSide3 = new UiObject(new UiSelector().resourceId("android:id/mwOuterBorder"));
						android.graphics.Rect myAppSide3 = objectSide3.getVisibleBounds();
						// 验证上一次拖动是否成功
						if (myAppSide3.right < (myAppSide2.right + 40)|| myAppSide3.right > (myAppSide2.right + 60)) {
							System.out.println("----------[failed]:"+myAppSide2.right+"->"+myAppSide3.right+"拖拽右下角扩大窗口失败！");
							}
						device.drag(myAppSide3.right - 1, myAppSide3.bottom - 1,myAppSide3.right - 100, myAppSide3.bottom - 100, 2);
						Thread.sleep(2000);
					}
				}
			}
		}
		
		// 拖动程序 拖动程序后， 窗口最大化/最小化等位置将无法通过resourceId获取到
		if(IfExist("android:id/mw_decor_header",device)){
			UiObject objectHead = new UiObject(new UiSelector().resourceId("android:id/mw_decor_header"));
			objectHead.dragTo(1000, 500, 10);
			Thread.sleep(1000);
		}

		// 强制关闭程序
		otoDisplayRun.execCmdNoSave("am force-stop " + appName.substring(0, appName.indexOf("/")));
	}
	public static boolean IfExist(String str,UiDevice mydevice) throws InterruptedException{
		UiObject myobject = new UiObject(new UiSelector().resourceId(str));
		int i = 0;
		while(!myobject.exists() && i < 5){
//			SolveProblems();
			Thread.sleep(1000);
			if(i == 4){
				TakeScreen(mydevice,str.substring(str.indexOf('/')+1)+"----not find");
				System.out.println("----------[failed]:" + str + " not find !!!测试未通过");
				return false;
			}
			i++;
		}
		return true;
	}
	public static void TakeScreen(UiDevice mydevice,String descript){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date time = new Date();
		String timestr = format.format(time);
		File files = new File("/storage/sdcard0/Pictures/"+timestr+"_"+descript+".jpg");
		mydevice.takeScreenshot(files);
	}
}
