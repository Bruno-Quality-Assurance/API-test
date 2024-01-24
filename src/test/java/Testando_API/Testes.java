package Testando_API;

import java.io.IOException;
import org.junit.Test;
import Cenarios_de_Testes.Cenarios_Checklist;
import io.restassured.RestAssured;

public class Testes {

	
	@Test
	public void CT001_Testando_EndPoint1() throws InterruptedException, IOException {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
	@Test
	public void CT002_Testando_EndPoint2() throws InterruptedException, IOException {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
	@Test
	public void CT003_Testando_EndPoint3() throws InterruptedException, IOException {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
	
	
}
