import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

public class APIs_Utilizadas_em_Login {

	
	@Test
	public void Login_Endpoint_1() {
		RestAssured.given()
		.when().get("https://www.google-analytics.com/j/collect?v=1&_v=j101&a=1433741593&t=pageview&_s=1&dl=https%3A%2F%2Fapp.qa.nexti.com%2F&ul=pt-br&de=UTF-8&dt=Nexti%20Web&sd=24-bit&sr=1280x720&vp=1000x660&je=0&_u=IEBAAUABAAAAACAAI~&jid=1613609627&gjid=483436627&cid=739034402.1698685361&tid=UA-119150285-1&_gid=1973297475.1698685361&_r=1&_slc=1&gtm=u64&z=334476281")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	

	@Test
	public void Login_Endpoint_2() {
		RestAssured.given()
		.when().get("https://nxt.chat.qa.nexti.com:8089/queue/count?access_token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2FjY291bnRfaWQiOjEyNzEyMDQsInVzZXJfbmFtZSI6ImNvbnRyb2wiLCJzY29wZSI6WyJvcGVuaWQiXSwibGFuZ3VhZ2UiOiJwdCIsImV4cCI6MTY5ODc1NzkxMiwiYXV0aG9yaXRpZXMiOlsidGVuYW50fjEiLCJjcmVhdGUiLCJ1cGRhdGUiLCJyZWFkIiwiZGVsZXRlIl0sImp0aSI6ImMwYjBmZjg4LWQ0NDktNDk3Yy1iNzYyLTgyZjg5ODg0NmFhOSIsImNsaWVudF9pZCI6ImZyb250ZW5kIn0.GW-igCikgKTtGgVoKrB5mjGR_sTdY0iu61ChAGI-bgmT6GpSIX_KchO7f-247NGQjqEYJta0sSlioTdHZCc89WQyfAMbaRKPYbci9LZBM5o2sUVcyNuiG3X3pXIDEWl8e1EvcJx8AsWdkfqfJoj9lPnJIL9HfQrGG3NLI3lwjpLlcOEIMnl2DFfJEFM0bcegts1Zw9X4OMx-yWRdOcY2_n4HZKoGtsao1fF4QulGUe0pyh6tkGqJraD5VPLlyqwHP6GdzFEOw2L0S6tqp2TH007ONlforwO-y8485PgU6HIsjxVhSxGMRLT4KjFdRo7nv667AcOjKV4FRnYV1tRYkA")
		.then().statusCode(200).log().status();
		System.out.println("---------------------------------------------------------");
		
	}
	
}
