package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Artefatos.Massa_de_Testes.Massa_de_Teste;
import Page_Objects.PageObject;


public class Steps {

	PageObject po = new PageObject();
	Massa_de_Teste mt = new Massa_de_Teste();
//-------------------------------------------------------------------

	public WebDriver ChromeDriver(String TipoBrowser,String PathDriver){
		
		
		ChromeOptions CO = new ChromeOptions();
		//CO.addArguments("--headless");
		System.setProperty(TipoBrowser, PathDriver);
		WebDriver driver = new ChromeDriver(CO);			
		return driver;
	}
	
//-----------------------------------------------------------------------------------------------------
	
	public void Acessa_Ambiente (WebDriver driver,String Url) throws InterruptedException{
		driver.manage().window().maximize();
		driver.navigate().to(Url);
		Thread.sleep(10000);
	}
	
//---------------------------------------------------------------------------------------------------------	
	
	
	
	public void Login(WebDriver driver,String User, String Senha) throws InterruptedException{
		
		driver.findElement(By.id(po.User_ID())).sendKeys(User);
		driver.findElement(By.id(po.Senha_ID())).sendKeys(Senha + Keys.ENTER);
		Thread.sleep(8000);
		
		try {
			
			driver.findElement(By.xpath(po.Termo_Xpath())).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(po.Avancar_Xpath())).click();
			Thread.sleep(8000);
			
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
//---------------------------------------------------------------------------------------------------------	

	
	
}
