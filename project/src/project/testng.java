package project;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.NullPointerException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import org.openqa.selenium.TimeoutException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

 public class testng {
	

	static WebDriver driver = null;
	 
	public void OpenBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\royat\\workspace\\project\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\royat\\workspace\\project\\webdriver\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\royat\\workspace\\project\\webdriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
@SuppressWarnings("null")
public static void main(String[] args) throws IOException,NullPointerException{
		
		WebDriver driver = null;
		int BROWSER;
		 testng t =new testng();
		System.out.println("Enter your choice:\n Press 1 for Chrome\n Press 2 for Firefox\n ");
		Scanner obj=new Scanner(System.in);
		BROWSER =obj.nextInt();
		driversetup d=new driversetup();
		if(BROWSER==1){
			driver=driversetup.getWebDriver1();
			//Check for page title
			String Actual = driver.getTitle();
			String Expected= "Mobiles - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
			if (Actual.equals(Expected)){
				System.out.println("Title Not Matched");
			}else{
				System.out.println("Title Matched");
			}
			System.out.println("Online shopping website is open\n Navigation to home page of the application after handling the pop up window.\nIn the search box the search criteria “mobiles” is entered.");
			System.out.println("Mobile cost price is set to “30000” and latest product displayed first with price less than 30000");
			//browser closed
			driver.quit();
			
		}
		else if(BROWSER==2){
			driver=driversetup.getWebDriver2();
			//Check for page title
			String Actual = driver.getTitle();
			String Expected= "Mobiles - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
			if (Actual.equals(Expected)){
				System.out.println("Title Not Matched");
			}else{
				System.out.println("Title Matched");
			}
			System.out.println("Online shopping website is open\n Navigation to home page of the application after handling the pop up window.\nIn the search box the search criteria “mobiles” is entered.");
			System.out.println("Mobile cost price is set to “30000” and latest product displayed first with price less than 30000");
			//browser closed
			driver.quit();
		}
		else{
			System.out.println("Invalid value Entered");
			driver.quit();
		}
		

		t.verifyflipkarthomepage();
	}
	
	
	public void verifyflipkarthomepage() throws IOException,NullPointerException{
		
		String URL = "https://www.flipkart.com/";
		
		driver.get(URL);
		//Search of webelements as per requirement
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/popupwindow.png"));
		
		driver.findElement(By.className("_2doB4z")).click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("mobile");
		File screenshotFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile2, new File(".//screenshot/mobilesearch.png"));

		
		driver.findElement(By.className("L0Z3Pu")).click();
		
	
		
		List<WebElement> textfield = driver.findElements(By.className("_2SqgSY"));
		textfield.get(1).click();
		
		
	
		List<WebElement> searchfield = driver.findElements(By.className("_10UF8M"));
		searchfield.get(4).click();
		File screenshotFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile3, new File(".//screenshot/mobile_search_result.png"));

		
		List<WebElement> price = driver.findElements(By.className("_2YxCDZ"));
		price.get(1).click();
		File screenshotFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile4, new File(".//screenshot/mobile_new_release_result.png"));
	
		
		List<WebElement> maxprice = driver.findElements(By.className("_3AsjWR"));
		maxprice.get(19).click();
		
		File screenshotFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile5, new File(".//screenshot/finalresult.png"));
		
	}
	

}
	
	
		
		
		
	

