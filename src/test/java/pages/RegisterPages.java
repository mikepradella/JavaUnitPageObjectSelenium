package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPages {
	static WebDriver driver;
	
	public RegisterPages (WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void preencherIdDinamicos() {
		
		WebElement dinamico = driver.findElement(By.xpath(".//label[text()='Full Name* ']/following-sibling::div[1]/input"));
		dinamico.sendKeys("mike tyson");
		
	}
}
