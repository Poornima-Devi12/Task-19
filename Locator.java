package task19;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();  //Launch the driver
		
		driver.navigate().to("https://www.guvi.in/register");//Load the url
		
		driver.manage().window().maximize();   //maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait makes the selenium driver to wait
		
		driver.findElement(By.className("form-control")).sendKeys("Poornima Devi");//CLASSNAME locator is used
		driver.findElement(By.id("email")).sendKeys("deviprabu39@gmail.com");//ID locator is used
		
		Thread.sleep(4000);//makes the execution wait
		
		driver.findElement(By.xpath("//input[@class='form-control password-err']")).sendKeys("Deviprabu@03");//xpath locator is used
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9087853926");//CSS locator is used
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();//XPATH locator is used
		driver.findElement(By.tagName("select")).sendKeys("Students");//TAGNAME locator is used
		driver.findElement(By.id("degreeDrpDwn")).sendKeys("other");//ID locator is used
		driver.findElement(By.id("year")).sendKeys("2018");//ID locator is used
		driver.findElement(By.linkText("Submit")).click();//LINKTEXT locator is used
		
		driver.close();//closing the browser

	}

}
