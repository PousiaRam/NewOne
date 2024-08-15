package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {

	public List<WebElement> category;
	public String categoryname;

	public static ChromeDriver driver;

	@BeforeMethod
	public void openbrowser() {

		int k = 0;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nnnow.com/");
		category = driver.findElements(By.xpath("//li[@class='nw-mainnav-items']//a//span"));

		int categorysize = category.size();
		// System.out.println(categorysize);
		for (int i = 0; i < categorysize; i++) {
			

		}
		
	}
}
