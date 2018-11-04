package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

public class LogIn_Action {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	}
	
	public static void Execute(WebDriver driver) throws Exception {

	String sEmail = ExcelUtils.getCellData(1, 1);
	String sPassword = ExcelUtils.getCellData(1, 2);
	System.out.println(sEmail);
	System.out.println(sPassword);
	LogInPage.txtbx_Email(driver).sendKeys(sEmail);
	LogInPage.txtbx_Password(driver).sendKeys(sPassword);
	LogInPage.btn_LogIn(driver).click();
}
}
