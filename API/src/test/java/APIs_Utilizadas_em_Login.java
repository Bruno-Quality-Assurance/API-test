import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

public class APIs_Utilizadas_em_Login {

	
	@Test
	public void Login_Endpoint_1() {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	

	@Test
	public void Login_Endpoint_2() {
		RestAssured.given()
		.when().get("https://www.auditeste.com.br")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
}
