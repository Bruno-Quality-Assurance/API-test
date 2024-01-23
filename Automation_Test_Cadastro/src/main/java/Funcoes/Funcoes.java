package Funcoes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Funcoes {

	public void PrintScreen(WebDriver Driver,String Path) throws IOException {
		
		File scrFile = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(scrFile, new File(Path + ".jpg"));
        
	}
	
	
}
