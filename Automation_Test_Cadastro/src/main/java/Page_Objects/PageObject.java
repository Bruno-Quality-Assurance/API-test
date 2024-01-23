package Page_Objects;

public class PageObject {

	
	public String Tipo_Navegador(){return "webdriver.chrome.driver" ;}
	public String Path_Driver()   {return "C:\\Users\\Auditeste0367\\Desktop\\QA_Automation_Test_Nexti\\Drivers\\chromedriver.exe";}
	public String  Path_Print()   {return "C:\\Users\\Auditeste0367\\Desktop\\QA_Automation_Test_Nexti\\Automation_Test_Nexti_Time\\Automation_Test_Nexti_Time\\src\\main\\java\\Artefatos\\Evidencias\\";}
	
	
	//Login
	public String User_ID()       {return "inputUsername";}
	public String Senha_ID()      {return "inputPassword";}
	public String Termo_Xpath()   {return "/html/body/core-main/div/div[2]/div/div[3]/div/div[1]/label/i";}
	public String Avancar_Xpath() {return "/html/body/core-main/div/div[2]/div/div[3]/div/div[2]/advance-button[2]/div/button";}
	
	
	//Preenchendo Cenário de Compensação
	public String BotaoNovo_Xpath()				{return "/html/body/core-main/div/div[2]/div[2]/div[2]/div[2]/button";} //Novo
	public String Nome_Xpath() 					{return "timetrackingprofile_name";};//Nome 
	public String Situaçao_Xpath() 				{return "dataTimeTrackingComptimeCompensationPeriodStatus";}//Situaçao
	public String DataInicioCredito_Xpath() 	{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/datepicker/p/input";}//Data início crédit
	public String DataFimcredito_Xpath() 		{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div[2]/datepicker/p/input";}//Data fim crédito
	public String DataInicioDebito_Xpath() 		{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div[3]/datepicker/p/input";}//Data início débito 
	public String Datafimdebito_Xpath() 		{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div/div[2]/div[4]/datepicker/p/input";}//Data fim débito 
	public String PeriododeBancodeHoras_Xpath() {return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div/div[3]/div/div/select";}//Período de Banco de Horas *
	public String Exceção_Xpath() 				{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/ul/li[2]/a";}//Exceção
	public String Tipodefiltro_Xpath() 			{return "/html/body/core-main/div/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div[1]/form/div[2]/div/div[1]/div/div/div/div/div/div/div/select";}//Tipo de filtro *


    //Data fim  - Período de Banco de Horas
	public String Data_Fim_Xpath()				{return "/html/body/core-main/div/div[2]/div[3]/div[1]/div/div[1]/div[1]/div[2]/div[1]/form/div[1]/div[1]/div[2]/div[2]/datepicker/p/input";} //Data fim


}
