package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class ClientsPage_Action {
	
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet3");
	}
	public static void Execute(WebDriver driver) throws Exception {
		
		Thread.sleep(3000);
		ClientsPage.getClients(driver).click();
		Thread.sleep(3000);
		ClientsPage.getAddNewClient(driver).click();
		Thread.sleep(5000);
	  
		String ClientName = ExcelUtils.getCellData(1, 1);
		System.out.println(ClientName);
		String ContactName = ExcelUtils.getCellData(1, 2);
		String Email = ExcelUtils.getCellData(1, 3);
		String RegistryNumber = ExcelUtils.getCellData(1, 4);
		String Countries = ExcelUtils.getCellData(1, 5);
		String City = ExcelUtils.getCellData(1, 6);
		String Street = ExcelUtils.getCellData(1, 7);
		String Zip = ExcelUtils.getCellData(1, 8);
		//String DateAdded = ExcelUtils.getCellData(1, 9);
		String Code = ExcelUtils.getCellData(1, 10);
		//String AgreementDay = ExcelUtils.getCellData(1, 11);
		//String Status = ExcelUtils.getCellData(1, 12);
		
		ClientsPage.addClientName(driver, ClientName);
		ClientsPage.addContactName(driver, ContactName);
		ClientsPage.addEmail(driver, Email);
		ClientsPage.addRegistryNumber(driver, RegistryNumber);	
		ClientsPage.addCountries(driver, Countries);
		ClientsPage.addCity(driver, City);
		ClientsPage.addStreet(driver, Street);
		ClientsPage.addZip(driver, Zip);
		//ClientsPage.addDateAdded(driver, DateAdded);
		ClientsPage.addCode(driver, Code);
		//ClientsPage.addAgreementDay(driver, AgreementDay);
		//ClientsPage.addStatus(driver, Status);
		
		ClientsPage.getSave(driver).click();
		//return "Pass";
  }
}


