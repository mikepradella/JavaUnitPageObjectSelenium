package pages;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CadastroPages {
	
	// instanciando do driver
	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampos(){
		//neste momento ele esta apenas buscando o nome por Id
		WebElement nome = driver.findElement(By.id("FirstName"));
		//aqui ele envie valor para o campo
		nome.sendKeys("mike");
		
		WebElement sobrenome = driver.findElement(By.name("LastName"));
		sobrenome.sendKeys("pradella");
		
		WebElement email = driver.findElement(By.id("GmailAddress"));
		email.sendKeys("");
		
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("Fulano22@");
		
		WebElement confirmarsenha = driver.findElement(By.name("PasswdAgain"));
		confirmarsenha.sendKeys("Fulano22@");
		
		WebElement dia = driver.findElement(By.id("BirthDay"));
		dia.sendKeys("22");
		
		//combo box -- html select - abre o combo
		WebElement mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		mes.click();
		// aqui seleciona especifico no combo
		WebElement dezembro = driver.findElement(By.xpath(".//*[@id=':c']/div"));
		dezembro.click();
		
		WebElement ano = driver.findElement(By.name("BirthYear"));
		ano.sendKeys("1989");
					
		
		WebElement sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(sexo).click().perform();
		
		WebElement sexom = driver.findElement(By.xpath(".//*[@id=':f']/div"));
		Actions action = new Actions(driver);

		action.moveToElement(sexom).click().perform();
		
		
		WebElement celular = driver.findElement(By.id("RecoveryPhoneNumber"));
		celular.sendKeys("11999654321");
		
		WebElement email2 = driver.findElement(By.id("RecoveryEmailAddress"));
		email2.sendKeys("testeemail@oh.com");
		
		WebElement botao = driver.findElement(By.name("submitbutton"));
    	botao.click();
		
	}
	 	
	public String validarMensagem(){
		//errormsg_0_GmailAddress
		return driver.findElement(By.id("errormsg_0_GmailAddress")).getText();
			
	}
	
	public static void capturaTela(WebDriver driver) throws IOException {
		
		// instanciado a class Random para trocar os nomes das paginas capturadas
		Random num = new Random();	
		
		// captura a tela e salva na pasta evidenciaUsandoMetodo do projeto , funciona corretamente
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String caminhoEvidencia = "C:/Users/Inmetrics/workspace/com.apreendendoAutomacao.cucumber/Evidencias";
		//este comando salva na raiz - new File("my.jpg")
		FileUtils.copyFile(source,new File("C:/Users/Inmetrics/workspace/CadastroGoogle/evidenciaUsandoMetodo/my"+(num.nextInt())+".jpg"));
	
	}
	
}
