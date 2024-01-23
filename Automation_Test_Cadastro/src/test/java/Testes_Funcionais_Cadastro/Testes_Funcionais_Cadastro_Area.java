package Testes_Funcionais_Cadastro;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Artefatos.Massa_de_Testes.Massa_de_Teste;
import Cenarios_de_Testes.Cadastro_Area;
import Cenarios_de_Testes.Cadastro_Bairro;
import Cenarios_de_Testes.Cadastro_Bloqueio_de_Posto;
import Funcoes.Funcoes;
import Page_Objects.PageObject;
import Steps.Steps;
import io.restassured.RestAssured;

public class Testes_Funcionais_Cadastro_Area {


	@Test
	public void Login_Endpoint_1() {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
	
		
}

