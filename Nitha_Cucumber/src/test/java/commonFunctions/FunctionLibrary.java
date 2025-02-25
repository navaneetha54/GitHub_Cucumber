package commonFunctions;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary {
	public static WebDriver driver;
	public static String Expected="";
	public static String Actual="";
	//method for launching browser
	public static WebDriver startBrowser(String url)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	//method for textboxes
	public static void typeAction(String Locatortype,String Locatorvalue, String testData)
	{
		if(Locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locatorvalue)).clear();
			driver.findElement(By.name(Locatorvalue)).sendKeys(testData);
		}
		if(Locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locatorvalue)).clear();
			driver.findElement(By.xpath(Locatorvalue)).sendKeys(testData);
		}if(Locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locatorvalue)).clear();
			driver.findElement(By.id(Locatorvalue)).sendKeys(testData);
		}
	}
	//methods for buttons,checkboxes,radio buttons,and images
	public static void clickAction(String Locatortype,String Locatorvalue)
	{
		if(Locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locatorvalue)).click();
		}
		if(Locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locatorvalue)).click();
		}
		if(Locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locatorvalue)).sendKeys(Keys.ENTER);
		}
	}
	//method for validate title
	public static void validateTitle(String Expected_Title)
	{
		String Actual_Title=driver.getTitle();
		try {
			Assert.assertEquals(Actual_Title, Expected_Title,"Title is not maching");
			
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
		 
	}
	//methods for capture supplier number
	public static void  capturesupnum(String Locatortype,String Locatorvalue)
	{
		if(Locatortype.equalsIgnoreCase("name"))
		{
			Expected=driver.findElement(By.name(Locatorvalue)).getAttribute("value");
		}
		if(Locatortype.equalsIgnoreCase("xpath"))
		{
			Expected=driver.findElement(By.xpath(Locatorvalue)).getAttribute("value");
		}
		if(Locatortype.equalsIgnoreCase("id"))
		{
			Expected=driver.findElement(By.id(Locatorvalue)).getAttribute("value");
		}
	}
	//method for validate supplier number
	public static void supplierTable() throws Throwable
	{
		if(!driver.findElement(By.xpath("//input[@id='psearch']")).isDisplayed())
			//if search textbox not displyed click search panel button
			driver.findElement(By.xpath("//span[@data-caption='Search']")).click();
		driver.findElement(By.xpath("//input[@id='psearch']")).click();
		driver.findElement(By.xpath("//input[@id='psearch']")).sendKeys(Expected);
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		Thread.sleep(3000);
		//capture supplier number from specific row cell
		Actual=driver.findElement(By.xpath("\"//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span\"")).getText();
		if(Actual.equals(Expected))
		{
			Reporter.log("Supplier Number found in Table::"+Expected+"      "+Actual,true);
			
		}
		else
		{
			Reporter.log("Supplier Number Not found in Table::"+Expected+"      "+Actual,true);
		}

		
				
	}

}
