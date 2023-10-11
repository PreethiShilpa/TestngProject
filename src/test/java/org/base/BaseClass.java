package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public void getDriver(String Browser) {
		
		switch(Browser) {
		case "Chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\preet\\eclipse-workspace\\selenium16-08-2023\\driver\\chromedriver-win64");
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("Invalid Browser Type");
			break;
		}
	}
public void getUrl(String url) {
	driver.get(url);
}

public void windowsMax() {
	driver.manage().window().maximize();

}
public void keysSend(WebElement element, String keysToSend) {
	element.sendKeys(keysToSend);
	
}
protected void click(WebElement element, String click) {
	element.click();
	
}
public void getSelect(String Select,WebElement element, String text, int value) {
	Select s = new Select(element);
switch (Select) {
case "SelectByText":
	s.selectByVisibleText(text);	
	break;
case "SelectByValue":
	s.selectByValue(text);
	break;
case "SelectByIndex":
	s.selectByIndex(value);
break;
}
}

public void getAttribute(WebElement element, String text) {
	String attribute = element.getAttribute(text);
	System.out.println(attribute);
}

public void getAttributeValue(WebElement element, String value) {
	String attributevalue = element.getAttribute(value);
	System.out.println(attributevalue);	
}

public void getText(WebElement element, String text) {
	String text2 = element.getText();
	System.out.println(text2);

}
public void alert(String AlertType,WebElement element,String text) {	
     switch (AlertType) {
     case "SimpleAlert":
    	 element.click();
    	 Alert SimpleAlert = driver.switchTo().alert();
    	 SimpleAlert.accept();
    	 break;
     case "ConfirmAlert":
    	 element.click();
    	 Alert ConfirmAlert = driver.switchTo().alert();
    	 ConfirmAlert.dismiss();	
	  break;
     case "PromptAlert":
    	 element.click();
    	 Alert PromptAlert = driver.switchTo().alert();
    	 PromptAlert.sendKeys(text);
    	 PromptAlert.accept();
	break;
}
 
}


public String excelRead(int row, int cell) throws IOException {
        	
    	File file = new File("C:\\Users\\preet\\OneDrive\\Pictures\\excel file\\details.xlsx");
    	FileInputStream stream = new FileInputStream(file);
    	Workbook book = new XSSFWorkbook(stream);
    	Sheet sheet = book.getSheet("Sheet1");
    	Row row2 = sheet.getRow(row);
    	Cell cell2 = row2.getCell(cell);
    	CellType cellType = cell2.getCellType();
    	    	
    	String value = null;
    	
    	switch (cellType) {
    	case STRING:
    		 value = cell2.getStringCellValue();
    		break;
    	case NUMERIC:
    		if (DateUtil.isCellDateFormatted(cell2)) {
    			Date dateCellValue = cell2.getDateCellValue();
    			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
    			 value = simple.format(dateCellValue);
    			
    		} else {
    			double numericCellValue = cell2.getNumericCellValue();
    			long l = (long)numericCellValue;
    			BigDecimal valueOf = BigDecimal.valueOf(l);
    			 value = valueOf.toString();
    		}
    		break;
    		

    	default:
    		System.out.println("In valid Cell format");
    		break;
    	}
		return value;
		
} 	
		
public static void screenShot(String name) {
	try {
		// Type Casting // Narrowing Casting
		// LowerInterface ref = (LowerInterface)HigherInterfaceRef;
		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		File targetFile = new File("C:\\Users\\preet\\OneDrive\\Pictures\\Screenshots\\"+name+".png");

		FileUtils.copyFile(sourceFile, targetFile); // throws on IOException

	} catch (Exception e) {
		// TODO: handle exception
	}}

public static String screenCapture(WebDriver driver) {  
		  String errorfilepath = null; 
		  try {
		      File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   File DestFile = new File("src/../ErrorImages/"+ System.currentTimeMillis() + ".png");   
		   errorfilepath = DestFile.getAbsolutePath();   FileUtils.copyFile(SourceFile, DestFile);
		     } catch (Exception e) {
		     }
		  return errorfilepath; 
	
	
}
}
