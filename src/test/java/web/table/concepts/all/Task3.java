package web.table.concepts.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// to print a particular cell value

public class Task3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace Oxygen\\WebTables\\drivers\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	ChromeOptions d = c.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(d);
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < rows.size(); i++) {
		WebElement row = rows.get(i);
		List<WebElement> datas = row.findElements(By.tagName("td"));
		for (int j = 0; j < datas.size(); j++) {
			WebElement data = datas.get(j);
			String text = data.getText();
			if (text.equals("Dubai")) {
				System.out.println(text);
				System.out.println("row position is "+i);
				System.out.println("column position is "+j);
			}
		}
	}
	
	
}
	
}
