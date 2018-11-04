package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.BusinessPage_Action;
import appModules.ClientsPage_Action;
import appModules.LogOutPage;
import appModules.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(Constant.URL);
		
		SignIn_Action.SetUpExcel();

		SignIn_Action.Execute(driver);

		System.out.println("Login Successfully.");
		
		ExcelUtils.setCellData("Pass", 1, 3);
		
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");
		BusinessPage_Action.SetUpExcel();
		
		BusinessPage_Action.Execute(driver);
		
		ExcelUtils.setCellData("Pass", 1, 12);
		
		ClientsPage_Action.SetUpExcel();
		
		ClientsPage_Action.Execute(driver);
		
		ExcelUtils.setCellData("Pass", 1, 12);
		
		LogOutPage.setLogOutIcon(driver);

        	LogOutPage.setLogOutButton(driver);

        	Thread.sleep(2000);

        	LogOutPage.setLogOut(driver);

        	System.out.println("Logout Successfully.");

		driver.quit();

		

	}

}
