package wrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrappers extends WrapperMethods{
	
	@Parameters({"platformName", "udid", "systemPort", "wdaLocalPort"})
	@BeforeMethod
	public void bm(String platformName, String udid, String systemPort, String wdaLocalPort) {
		//launchApp("iOS");
		launchApp(platformName, udid, systemPort, wdaLocalPort);
	}

}
