package Base_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;
	public static	Properties pr;
	
	/*public static Properties getProperty() throws IOException
	
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config_File");
		Properties pro=new Properties();
		pro.load(fis);
		
		
		
	}*/
	public static Properties loadProperty() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config_File");
		Properties pro=new Properties();
		pro.load(fis);
		return pro;
	}
	
	public static void main(String[] args) throws IOException {
		//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config_File");
		//FileInputStream fis=new FileInputStream("D:\\Practice\\Java_Practice\\com.Cucumber.RedBus\\src\\main\\java\\Config_File\\config.proper");
		//Properties pro=new Properties();
		//pro.load(fis);
		//Properties pr=loadProperty();
		//System.out.println(pr.get("Browser"));
	}
	

}
