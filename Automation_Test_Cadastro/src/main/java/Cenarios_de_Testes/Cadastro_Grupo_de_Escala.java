package Cenarios_de_Testes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Artefatos.Massa_de_Testes.Massa_de_Teste;
import Funcoes.Funcoes;
import Page_Objects.PageObject;
import Steps.Steps;

public class Cadastro_Grupo_de_Escala {

	
	public boolean CT001_Cadastro_Grupo_de_Escala(String Nome_Cenario) throws InterruptedException, IOException {
		
		

		Steps step = new Steps();
		Funcoes f = new Funcoes();
		Massa_de_Teste mt = new Massa_de_Teste();
		PageObject po = new PageObject();
		
		
		WebDriver Driver =  step.ChromeDriver();
		
		try {
			
			//Acessa_Ambiente
			System.out.println(Nome_Cenario+": "+ "Acessando Url:" + mt.url());
			step.Acessa_Ambiente(Driver, mt.url());
			
			//login
			System.out.println(Nome_Cenario+": "+ "Logando...");
			step.Login(Driver, mt.Usuario(), mt.Senha());
			
			//Menu
			System.out.println(Nome_Cenario+": "+ "Menu: "+mt.Menu_Cadastros_GrupodeEscala());
			step.Acessa_Ambiente(Driver,mt.Menu_Cadastros_GrupodeEscala());
	
			//Preenchendo
			//System.out.println(Nome_Cenario+": "+ "Preenchendo Informações...");
			//step.Preechendo_Periodo_de_Banco_de_Horas(Driver);
			
			
			
					
			System.out.println(Nome_Cenario+": "+ "Gerando Evidencia...");
			f.PrintScreen(Driver,po.Path_Print() +  Nome_Cenario);
			System.out.println(Nome_Cenario+": OK");
			System.out.println("---------------------------------------------------------------------------------------");  
			//Driver.close();
			return true;
			
		} catch (Exception e) {
			System.out.println(Nome_Cenario+": NOK");
			System.out.println(e.getMessage()); return false;}
       
		 
	}
		
}

