package webDriverSample58;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//String salary= driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
		//System.out.println("Salary ...:"+salary);
		//String position=  driver.findElement(with(By.tagName("td")).toRightOf(By.xpath("//td[contains(text(), 'B. Wagner')]"))).getText();
		//System.out.println("Position ...:"+position);
		//
		driver.get("https://automationbookstore.dev/");
		Thread.sleep(2000);
		//WebElement closeIcon = driver.findElement(By.linkText("ClearText"));
		WebElement closeIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));
		System.out.println("Close Icon ...."+closeIcon.isDisplayed());
		driver.findElement(By.cssSelector("#searchBar")).sendKeys("Test");
		Thread.sleep(2000);
		closeIcon= driver.findElement(By.xpath("//a[@title='Clear text']"));
		if(closeIcon.isDisplayed())
		{
			closeIcon.click();
		}
		System.out.println("Close Icon after text ...."+closeIcon.isDisplayed());
		
		
		

	}


}
