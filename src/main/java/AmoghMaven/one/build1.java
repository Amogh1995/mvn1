package AmoghMaven.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class build1 {
	String s;
	 @Test
	    public void  main()
	    {
	        System.out.println( "This is build job!" );
	    }
	 @Test
	 public void jb()
	 {
		 System.setProperty("webdriver.chrome.driver","E:/Amog java/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String expectedtitle="Google";
			driver.get("http://google.com");
			s=driver.getTitle();
			Assert.assertEquals(s, expectedtitle,"This checks for the login");
	 }
}
