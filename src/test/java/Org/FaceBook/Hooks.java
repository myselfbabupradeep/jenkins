package Org.FaceBook;



import com.fb.baseclass.BaseClass;
import com.fb.locators.FbSignupLocators;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {
	
//	public static BaseClass base = BaseClass.getInstance();
//	public static FbSignupLocators locators = FbSignupLocators.getInstance();
	
	
	@Before
	public void lanuchingEdge()
	{
		System.out.println("Hookclass Execution - Before annotation");
		BaseClass.launchEdgeBrowser();
//		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
	}
	
	
	@After
	public void quitTheBrowser()
	{
		System.out.println("Hookclass Execution - After annotation");
//		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		BaseClass.waitfor3seconds();
		BaseClass.closeBrowser();
	}

}
