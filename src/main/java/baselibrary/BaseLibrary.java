package baselibrary;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import applicationutility.Application_utility;
import excelutility.Excel_utility;
import propertyutility.Property_file;
import screenshotutility.Screenshort;
import waitutility.Wait_utility;

public class BaseLibrary implements Wait_utility,Excel_utility,Property_file,Application_utility,Screenshort {
	public static WebDriver driver;
	public void launchURL(String env,String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\java workspace\\19july_testNG_automation_framework\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(env);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='×']")).click();
		driver.findElement(By.xpath("//*[@href=\"newdemo.html\"]")).click();
		}
		else if(browsername.equalsIgnoreCase("mozila")) {
			System.setProperty("webdriver.gecko.driver", "D:\\java workspace\\19july_testNG_automation_framework\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(env);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[text()='×']")).click();
			driver.findElement(By.xpath("//*[text()='Practice']")).click();	
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\java workspace\\19july_testNG_automation_framework\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get(env);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[text()='×']")).click();
			driver.findElement(By.xpath("//*[text()='Practice']")).click();	
		}
	}
	//@AfterTest
	public void teardown(){
		driver.quit();
	}
	@Override
	public String getdata(int sheetno, int columnno, int row) {
		String value="";
		try {
			FileInputStream fil=new FileInputStream("D:\\java workspace\\19july_testNG_automation_framework\\testdata\\Book1.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fil);
			XSSFSheet sheet=wb.getSheetAt(sheetno);
			value=sheet.getRow(row).getCell(columnno).getStringCellValue();
		} catch (Exception e) {
			System.out.println("please check file location"+e);
		}
		return value;
		
	}
	@Override
	public String getdata(String key) {
		String path="D:\\java workspace\\19july_testNG_automation_framework\\testdata\\config.properties";
		String value="";
		try {
			FileInputStream fl=new FileInputStream(path);
			Properties pro=new Properties();
			pro.load(fl);
			value=pro.getProperty(key);
			
		} catch (Exception e) {
			System.out.println("please check property file location"+e);
		}
		return value;
		
	}
	@Override
	public void DoubleClick(WebElement dc) {
		Actions act=new Actions(driver);
		act.doubleClick(dc).perform();
		
	}
	@Override
	public void RightClick(WebElement rc) {
		Actions act=new Actions(driver);
		act.contextClick(rc).perform();
		
	}
	@Override
	public void screenshorts(String folderName, String FileName) {
		try {
			String loc=System.getProperty("user.dir");
			String path=loc+"//"+"screenshort"+"//"+folderName+"//"+FileName+".png";
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
			
		} catch (Exception e) {
			System.out.println("issue in screenshort"+e);
		}
	}
	@AfterMethod
	public void resultAnlysis(ITestResult result) {
		String filename=result.getMethod().getMethodName();
		try {
			
			if(result.getStatus()==ITestResult.SUCCESS) {
				screenshorts("passed",filename);
			}
			else if(result.getStatus()==ITestResult.FAILURE) {
				screenshorts("failed",filename);
			}
		} catch (Exception e) {
			System.out.println("error in screenshort"+e);
		}
	}
	@Override
	public void mouseover(WebElement ele) {
		Actions mo=new Actions(driver);
		mo.moveToElement(ele).perform();
		
	}
	@Override
	public void mouseover_click(WebElement ele, String Linktext) {
		Actions mc=new Actions(driver);
		mc.moveToElement(ele).build().perform();
		driver.findElement(By.linkText(Linktext)).click();
		
	}
	@Override
	public void handleWindows(int tabno) {
	Set<String> setwindow=driver.getWindowHandles();
	List<String> listwindow=new ArrayList<>(setwindow);
	driver.switchTo().window(listwindow.get(tabno));
		
	}
	@Override
	public void uplodefile(String path)  {
		StringSelection ss=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		try {
			Robot ro=new Robot();
			ro.delay(700);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.delay(1000);
			ro.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			System.out.println("issue in uplode_file"+e);
		}
	}
	@Override
	public void selectByVisibleText(WebElement ele, String text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
		
	}
	@Override
	public void selectByvalue(WebElement ele, String value) {
		Select sel=new Select(ele);
		sel.selectByValue(value);
		
	}
	@Override
	public void selectByindex(WebElement ele, int index) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
		
	}
	@Override
	public void Elementtobeclickable(WebElement ele, int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	@Override
	public void Alert_present(int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());	
		
	}
}
