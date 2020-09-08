package Android_Package;

import java.io.File;

import io.appium.java_client.remote.MobileCapabilityType;

public class Base_class {

	
	public static void main(String[] args)
	{
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator1");
		//Android updated its internal framework to uiautomator2 and through Appium code,
		//we need to tell that we need to access uiautomator2 elements of Android.
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		
		
		

	}

}
