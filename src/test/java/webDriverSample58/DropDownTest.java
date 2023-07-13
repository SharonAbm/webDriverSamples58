package webDriverSample58;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select sinSel = new Select(driver.findElement(By.id("select-demo")));
		//sinSel.selectByValue("Wednesday");
		sinSel.selectByVisibleText("Wednesday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		mulSel.selectByIndex(1);
		mulSel.selectByValue("Ohio");
		mulSel.selectByVisibleText("New York");
		//mulSel.getAllSelectedOptions();

		mulSel.deselectByVisibleText("Ohio");
		

	}

}
