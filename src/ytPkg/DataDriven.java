package ytPkg;

import java.io.File;
import java.io.IOException;

import org.testing.base.BaseClass;
import org.testing.pages.LoginIn;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven extends BaseClass
{
	@DataProvider
	public Object[][] dp() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\Prafful\\Desktop\\myData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object[][] ob = new Object[r][c];
		for(int i=0; i<r;i++) 
		{
			for(int j=0; j<c; j++) 
			{
				Cell c1 = ws.getCell(j, i);
				ob[i][j] = c1.getContents();
			}
		}
		//System.out.println("");
		return ob;
	}
	@Test(dataProvider="dp")
	public void tc(String user, String password) 
	{
		LoginIn l = new LoginIn(driver, pr);
		l.signIn(user, password);
	}
}
