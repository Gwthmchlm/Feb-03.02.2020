package web.table.concepts.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseInfo {
static WebDriver driver;
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace Oxygen\\WebTables\\drivers\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	ChromeOptions d = c.addArguments("--disable-notifications");
	driver = new ChromeDriver(d);
	driver.manage().window().maximize();
}
}
