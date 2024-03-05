package Org.FaceBook;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fb.baseclass.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FbSignUp
{
	
//	public static Webbase.driver base.driver;
//	public static List<WebElement> options;
//	public static Actions action;
//	public static Select select;
	public static BaseClass base = BaseClass.getInstance();
	
	
	
	
	
	
	@Given("Launch the Edge Browser with Url {string}")
	public void launch_the_edge_browser_with_url(String url) 
	{
//	    Webbase.driverManager.edgebase.driver().setup();
//	    EdgeOptions options = new EdgeOptions();
//		options.addArguments("start-maximized");
//		base.driver = new Edgebase.driver(options);
//		action = new Actions(base.driver);
//		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		base.driver.get(url);
		base.launchEdgeBrowser();
	}

	@Given("Click on Create New AccountButton")
	public void click_on_create_new_account_button()
	{
	    WebElement create = base.driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));
//	    create.click();
	    base.singleTap(create);
	}

//	@When("User Clicks on available tab and entering the data by One Dimensional List")
//	public void user_clicks_on_available_tab_and_entering_the_data_by_one_dimensional_list(DataTable dataTable)
//	
//	{
//             WebElement firstname = base.driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
//	         WebElement lastname = base.driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
//		     WebElement mail = base.driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input"));
//		     WebElement password = base.driver.findElement(By.xpath("//input[contains(@data-type,'password')]"));
//		List<String> list = dataTable.asList();
//     	
//     	for (int i = 0; i <= list.size(); i++)
//     	{
//     		String type = "null";
//		if(type.equals(list.get(0))) 
//		{
//			firstname.click();
//			firstname.sendKeys(type);
//		}else if(type.equals(list.get(1))) 
//		{
//			lastname.click();
//			lastname.sendKeys(type);
//		}else if(type.equals(list.get(2))) 
//		{
//			mail.click();
//			mail.sendKeys(type);
//		}
//		else if(type.equals(list.get(3))) 
//		{
//			password.click();
//			password.sendKeys(type);
//		}
//		
//     	}		
//	}
//
//	@When("Click on gender radio button and Take ScreenShot")
//	public void click_on_gender_radio_button_and_take_screen_shot() 
//	{
//	   try
//	   {
//	   WebElement gender = base.driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
//	   action.click(gender).perform();
//	   TakesScreenshot take = (TakesScreenshot)base.driver;
//	   File Source = take.getScreenshotAs(OutputType.FILE);
//	   File path = new File("D:\\Eclipse\\Fb_cucumber\\target\\image.png");
//	   FileUtils.copyFile(Source, path);
//	   }
//	   catch(Exception e)
//	   {
//		   System.err.println(e);
//	   }
//	}
//
//	
//	@Then("Click on sign up button and take ScreenShot")
//	public void click_on_sign_up_button_and_take_screen_shot() 
//	{
//		 try
//		   {
//	    WebElement signup = base.driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]/parent::div/button"));
//	    signup.click();
//	    TakesScreenshot take = (TakesScreenshot)base.driver;
//		   File Source = take.getScreenshotAs(OutputType.FILE);
//		   File path = new File("D:\\Eclipse\\Fb_cucumber\\target\\picture.png");
//		   FileUtils.copyFile(Source, path);
//		   }
//		   catch(Exception e)
//		   {
//			   System.err.println(e);
//		   }
//	    
//	}
//
//	@When("User Clicks on available tab and entering the data by One Dimensional Map")
//	public void user_clicks_on_available_tab_and_entering_the_data_by_one_dimensional_map(io.cucumber.datatable.DataTable dataTable)
//	{
//	    
//	}

//	@When("User Clicks on available tab and entering the data by example Keyword {string} {string} {string} {string} {string} {string} {string}")
//	public void user_clicks_on_available_tab_and_entering_the_data_by_example_keyword(String firstname, String lastname, String email, String password, String date, String month, String year)
//	{
//		base.driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys(firstname);
//		  base.driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys(lastname);
//		  base.driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input)]")).sendKeys(email);
//		  base.driver.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys(password);
//		  base.driver.findElement(By.xpath("//div/input[@aria-label='New password']")).sendKeys(string5);
//		  WebElement dropdown1 = base.driver.findElement(By.xpath("//select[@id='day']"));
//		  select = new Select(dropdown1);
//		  options = select.getOptions();
//		  for(WebElement option : options) {
//			  String text = option.getText();
//			  if(text.contains(string6.substring(1))) {
//				  select.selectByVisibleText(text);
//			  }
//		  }
//		  base.driver.findElement(By.xpath("//select[@id='month']")).sendKeys(string7);
//		  WebElement dropdown2 = base.driver.findElement(By.xpath("//select[@id='year']"));
//		  select = new Select(dropdown2);
//		  List<WebElement> options = select.getOptions();
//		  for(WebElement option : options) {
//			  String text = option.getText();
//			  if(text.contains(string8.substring(1))) {
//				  select.selectByVisibleText(text);
//				  
//			  }
//		  }
//		  base.driver.findElement(By.xpath("//select[@id='year']")).sendKeys(string8);
//		  base.driver.findElement(By.xpath("//label[text()='Male']")).click();
//		  base.driver.findElement(By.xpath("//button[@name='websubmit']")).click(); 
//		  Thread.sleep(5000);
//		  TakesScreenshot v = (TakesScreenshot)base.driver;
//		  File f = v.getScreenshotAs(OutputType.FILE);
//		  for(int i=1;i<=3;i++) {
//			  File m = new File("Screenshot"+i+".png"); 
//			  FileUtils.copyFile(f,m);
//			  Thread.sleep(2000);
//		  }
//		
//	}
	
	@When("User Clicks on available tab and entering the data by example Keyword {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_clicks_on_available_tab_and_entering_the_data_by_example_keyword(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Exception 
	{
//		  base.driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys(string);
//		  base.driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys(string2);
//		  base.driver.findElement(By.xpath("//div/input[contains(@aria-label,'Mobile')]")).sendKeys(string3);
//		  base.driver.findElement(By.xpath("//div/input[contains(@aria-label,'Re-enter')]")).sendKeys(string4);
//		  base.driver.findElement(By.xpath("//div/input[@aria-label='New password']")).sendKeys(string5);  
//		  WebElement dd1 = base.driver.findElement(By.xpath("//select[@id='day']"));
//		  select = new Select(dd1);
//		  options = select.getOptions();
//		  select.selectByVisibleText(string6);
//		  WebElement dd2 = base.driver.findElement(By.xpath("//select[@id='month']"));
//		  select = new Select(dd2);
//		  options = select.getOptions();
//		  select.selectByVisibleText(string7);
//		  WebElement dd3 = base.driver.findElement(By.xpath("//select[@id='year']"));
//		  select = new Select(dd3);
//		  options = select.getOptions();
//		  select.selectByVisibleText(string8);
//
//		  base.driver.findElement(By.xpath("//label[text()='Male']")).click();
//		  
//		  TakesScreenshot scrn = (TakesScreenshot)base.driver;
//		      File file = scrn.getScreenshotAs(OutputType.FILE);
//			  File target = new File("D:\\Eclipse\\Fb_cucumber\\target\\beforesignup- "+string+".png"); 
//			  FileUtils.copyFile(file,target);
//			  Thread.sleep(2000);
//			  
//			  base.driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//			  Thread.sleep(10000);
//			  TakesScreenshot scrn1 = (TakesScreenshot)base.driver;
//			  
//			  File file1 = scrn1.getScreenshotAs(OutputType.FILE);
//				  File target1 = new File("D:\\Eclipse\\Fb_cucumber\\target\\aftersignup- "+string+".png"); 
//				  FileUtils.copyFile(file1,target1);
//				  Thread.sleep(2000);
////				  base.driver.quit();
			  
	}

	
	
	@And("Click on sign up button and take ScreenShot in example keyword")
	public void click_on_sign_up_button_and_take_screen_shot_in_example_keyword() throws Exception  
	{
//		TakesScreenshot scrn1 = (TakesScreenshot)base.driver;
//		File file1 = scrn1.getScreenshotAs(OutputType.FILE);
//		  File target1 = new File("D:\\Eclipse\\Fb_cucumber\\target\\aftersignup- "+string+".png"); 
//		  FileUtils.copyFile(file1,target1);
//		  Thread.sleep(2000);
		 
//		  base.closeBrowser();
		  
		  
//		
//			  base.driver.quit();
		
	}



}
