package test.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelp {
	private WebDriver driver;
	private ExtentTest logger;
	private WebDriverWait wait;

	private void LaunchDriver() {
		WebDriverManager.chromedriver().version("81.0.4044.138").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-browser-side-navigation");
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 10);

	}

	public WebDriver getWebDriver() {
		if (driver == null) {
			LaunchDriver();
		}
		return driver;
	}

	public void setLogger(ExtentTest logg) {
		logger = logg;
	}

	public void launchUrl(String url) {
		try {
			System.out.println("launch url");
			driver.get(url);
			logger.log(LogStatus.PASS, url + " is successfully launched");

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, e.getMessage());
		}
	}

	public void click(String element) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
			driver.findElement(By.xpath(element)).click();
			logger.log(LogStatus.PASS, "Clicked");

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, e.getMessage().substring(0, 121));
		}
	}

	public void click(WebElement webElement) {
		try {
			wait.until(ExpectedConditions.visibilityOf(webElement));
			webElement.click();
			logger.log(LogStatus.PASS, "Clicked");

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, e.getMessage());
		}
	}

	public void enterValue(String element, String value) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
			driver.findElement(By.xpath(element)).sendKeys(value);
			logger.log(LogStatus.PASS, value + " is successfully entered");

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, e.getMessage());
		}
	}

	public void endTestCase(String result) {
		if (result.equalsIgnoreCase("pass")) {
			logger.log(LogStatus.PASS, "The Test Case is successfully passed");
		} else {
			logger.log(LogStatus.FAIL, "The Test Case is failed");
		}

	}

}
