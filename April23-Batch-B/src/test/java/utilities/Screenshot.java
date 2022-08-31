package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void capturesceenshot(WebDriver driver,String name) throws IOException
	{
		//step-1
		 TakesScreenshot tcs=(TakesScreenshot) driver;
		 //step-2
		 File source=tcs.getScreenshotAs(OutputType.FILE);
		 
		 String path=System.getProperty("user.dir")+"\\Screenshots\\"+name+".png";
		 //step-3
		 File desc=new File(path);
		// File desc=new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium123\\Screenshots\\screen1");
		 //step-4
		 FileHandler.copy(source, desc);
		 System.out.println("capture screenshot");

}
}
