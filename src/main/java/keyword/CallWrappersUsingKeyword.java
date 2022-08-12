package keyword;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class CallWrappersUsingKeyword {

	public void getAndCallKeyword(String fileName) throws Exception{
		FileInputStream file = new FileInputStream(new File(fileName));

		System.out.println("file name: "+fileName);

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		Class<GenericWrappers> wrapper = GenericWrappers.class;
	    Object wM = wrapper.newInstance();
	    
		// Get first/desired sheet from the workbook
		XSSFSheet sh = workbook.getSheetAt(0);
		for (int i = 1; i <= sh.getLastRowNum(); i++) {

			String keyword = "" ;
			String locator = "" ;
			String data = "" ;
			try {
				keyword = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println("Keyword = "+keyword);
				locator = sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println("locator = "+locator);
				data = sh.getRow(i).getCell(2).getStringCellValue();
			} catch (NullPointerException e) {
				// ignore
			}
			
			
			Method[] methodName = wrapper.getDeclaredMethods();
			
			for (Method method : methodName) {
				System.out.println("method name = "+method.getName());
				
				if(method.getName().toLowerCase().equals(keyword.toLowerCase())){

					if(locator.equals("") && data.equals(""))
							method.invoke(wM);
					else if(locator.equals(""))
							method.invoke(wM,data);
					else if(data.equals(""))
						{method.invoke(wM,locator);
							System.out.println("wM = "+wM.toString());
							System.out.println("locator = "+locator);
						System.out.println("Wrapper is called for clickbyxpath method.....");}
					else
						method.invoke(wM,locator,data);
					
					// go out of for
					break;

				}				
			}			
		}
		
	}
}
