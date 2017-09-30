package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPages {
	static WebDriver driver;

	public FacebookPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherComboBox() {
		
		Select dia = new Select(driver.findElement(By.id("day")));
		dia.selectByValue("3");
		
		Select mes =  new Select(driver.findElement(By.id("month")));
		mes.selectByIndex(3);
		
		Select ano = new Select(driver.findElement(By.id("year")));
		ano.selectByVisibleText("2017");
		
		
		
	}
	
	

}
