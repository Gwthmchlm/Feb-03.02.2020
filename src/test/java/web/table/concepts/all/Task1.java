package web.table.concepts.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.xml.LaunchSuite;

public class Task1 extends BaseInfo{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace Oxygen\\WebTables\\drivers\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	ChromeOptions d = c.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(d);
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	// to print all cells in a table
	List<WebElement> tables = driver.findElements(By.tagName("table"));
	for (WebElement t : tables) {
		List<WebElement> rows = t.findElements(By.tagName("tr"));
		for (WebElement r : rows) {
			String text = r.getText();
			System.out.println(text);
		}
	}
	
	
	
	
	
	
}
}
