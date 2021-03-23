package project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class driversetup {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public ExtentTest extentTest;
	private static WebDriver driver;
	//Open with Chrome 
	public static WebDriver getWebDriver1() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\royat\\workspace\\project mini\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = "https://www.flipkart.com/";
		
		driver.get(URL);
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
		return driver;
	}
	
	//open with Firefox
	public static WebDriver getWebDriver2() throws IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\royat\\workspace\\project mini\\webdriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
String URL = "https://www.flipkart.com/";
		
		driver.get(URL);
	
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
		return driver;
	}
}
