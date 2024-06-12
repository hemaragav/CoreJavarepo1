package Week3.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjio {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags" ,Keys.ENTER);
		
		driver.findElement(By.xpath("//li[@class='rilrtl-list-item']/div/following::div[1]")).click();
		driver.findElement(By.xpath("//label[.='Fashion Bags (1,114)']")).click();
		
}

}
