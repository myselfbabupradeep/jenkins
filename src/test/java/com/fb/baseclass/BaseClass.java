package com.fb.baseclass;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static BaseClass base = null;
	
	private BaseClass() {}
	
	public static BaseClass getInstance()
	{
		if(base==null)
		{
			base = new BaseClass();
		}
		return base;
	}

	public static WebDriver driver;
	public static List<WebElement> options;
	public static Actions actions;
	public static Select select;
	public static JavascriptExecutor js;
	
	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	
	public void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//		driver.get(url);
	}
	
	public void gotoUrl(String url) {
		driver.get(url);
	}
	
	public void closeTab() {
		driver.close();
	}
	
	public void giveText(WebElement element , String string)
	{
		element.sendKeys(string);
	}
	
	public boolean equalsCheck(Object ob) {
		boolean equals = driver.equals(ob);
		return equals;
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public String giveTitleofpage() {
		String title = driver.getTitle();
		return title;
	}
	
	public String giveCurrentUrl() {
		String title = driver.getCurrentUrl();
		return title;
	}
	
	public boolean whetherDisplayed(WebElement webelement ) {
		boolean displayed = webelement.isDisplayed();
		return displayed;
	}
	
	public boolean whetherSelected(WebElement webelement ) {
		boolean selected = webelement.isSelected();
		return selected;
	}
		
	public boolean whetherEnabled(WebElement webelement ) {
		boolean enable = webelement.isEnabled();
		return enable;
	}	
	
	public void forwardKey() {
		driver.navigate().forward();
	}
	
	public void backKey() {
		driver.navigate().back();		
	}
	
	public void refreshKey() {
		driver.navigate().refresh();
	}
	
	public String givetext(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public void singleTap(WebElement element)
	{
	actions.click(element).build().perform();
	
	}
	
	
	public void doubleTap(WebElement element)
	{
	actions.doubleClick(element).build().perform();
	}
	
	public void rightClick(WebElement element)
	{
	actions.contextClick(element).build().perform();
	}
	
	public void goForElement(WebElement element)
	{
	actions.moveToElement(element).build().perform();
	}
	
	public void pickAndDrop(WebElement source,WebElement target)
	{
	actions.dragAndDrop(source, target).build().perform();
	}
	
	public void writeText(WebElement webelement, String value)
	{
	actions.sendKeys(webelement, value).build().perform();
		
	}
	
	public void screenShot(String string) {
		try{
			TakesScreenshot ts = (TakesScreenshot)driver;
		
		  
		  File file = ts.getScreenshotAs(OutputType.FILE);
			  File target = new File("D:\\Eclipse\\Fb_cucumber\\target\\"+string+".png"); 
			  FileUtils.copyFile(file,target);
			  Thread.sleep(2000);
		  }
		catch(Exception e)
		{
		  System.err.println();
		  e.printStackTrace();
		}		
	}
	
	public void selectByText(WebElement dropdown, String visibletext) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibletext); 
	}
	
	public void selectByindex(WebElement dropdown, int i)	{
		Select s = new Select(dropdown);
		s.selectByIndex(i);
	}
	
	public void selectBy(WebElement dropdown, String value) {
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}
	
	public List<WebElement> giveOptions(WebElement dropdown) {
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public void scrollDowntoView(WebElement element)
	{
		js.executeScript("argument[0].scrollIntoView(true)", element);
	}
	
	public void scrollUptoView(WebElement element)
	{
		js.executeScript("argument[0].scrollIntoView(false)", element);
	}
	
	public void writeTextinJS(WebElement element,String string) 
	{
		js.executeScript("argument[0].setAttribute('value','"+string+"')", element);
	
	}
	
	public void clickUsingJS(WebElement element) {
		js.executeScript("arguments[0].click", element);
	}
	
		
	public void giveTextinAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
	public Alert switchtoAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public void alertAccept(Alert alert) {
		alert.accept();
	}
	public void alertdismiss(Alert dismiss) {
		dismiss.dismiss();
	}
	
	public static void waitfor3seconds() {
		

	try 
	{
		Thread.sleep(3000);
	} 
	catch (InterruptedException e) 
	{
		
		e.printStackTrace();
	}
	}
	
	public void brokenLink(String string)
	{
		List<WebElement> links = driver.findElements(By.tagName("link"));
		Iterator<WebElement> iterator = links.iterator();
		while(iterator.hasNext()) {
		WebElement link = iterator.next();
		String href = link.getAttribute("href");
		if(href == null || href.isEmpty()) {
			System.out.println("Link Not Available");
				
	}
		else if(!href.startsWith(string)) {
			System.out.println("Link not related to Fb:"+href);
		}
		else {
			try{HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			int responcecode= http.getResponseCode();
			if(responcecode==200) {
				System.out.println("Link is not broken:"+href);
			}}catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
	}
		
	
//	public void brokenLinksone() {
//		public static void main(String[] args) throws MalformedURLException, IOException {
//			WebDriverManager.edgedriver().setup();
//			WebDriver driver = new EdgeDriver();
//			EdgeOptions options = new EdgeOptions();
//			driver.get("https://www.facebook.com");
//			driver.manage().window().maximize();
//			List<WebElement> elements = driver.findElements(By.tagName("link"));
//			Iterator<WebElement> iterator = elements.iterator();
//			while(iterator.hasNext()) {
//				WebElement link = iterator.next();
//				String href = link.getAttribute("href");
//				
//				if((href==null)|| href.isEmpty()){
//					System.out.println("Link unavailable");
//				}
//				else if(!href.startsWith("www.facebook.com")) {
//					System.out.println("Links not related to FB: "+href);
//				}
//				else {
//					HttpURLConnection http = (HttpURLConnection)(new URL(href).openConnection());
//					http.setRequestMethod("HEAD");
//					http.connect();
//					int responsecode = http.getResponseCode();
//					if(responsecode==200) {
//						System.out.println("Link not broken: "+href);
//					}
//				}
//			}
//		}

//	}
	
	
}
