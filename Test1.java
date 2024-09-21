package project;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.driver.chrome", "D:\\ChromeDriver\\chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Sarvesh");
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Kulkarni");
		Thread.sleep(2000);
		WebElement jobtitle = driver.findElement(By.id("job-title"));
		jobtitle.sendKeys("Developer");
		Thread.sleep(1000);
		WebElement checkbox = driver.findElement(By.className("col-sm-8 col-sm-offset-2"));
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		Thread.sleep(1000);
		

		 WebElement submitButton = driver.findElement(By.className("btn btn-lg btn-primary"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
		
		WebElement radiobutton = driver.findElement(By.className("col-sm-8 col-sm-offset-2"));
		if(!radiobutton.isSelected()) {
			radiobutton.click();
		}
		Thread.sleep(1000);

		Select dropdown = new Select(driver.findElement(By.id("select-menu")));
		dropdown.selectByVisibleText("2-4");
		
		Thread.sleep(2000);
		
		WebElement datefield = driver.findElement(By.id("datepicker"));
		datefield.sendKeys("2024-06-08");
		
		Thread.sleep(1000);

	     Thread.sleep(2000);
	     
	     driver.close();
	     
		
	}

}
