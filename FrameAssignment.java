package Week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/frame.html");
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			//WebElement eleframe=driver.findElementByXPath("//iframe[@src='default.html']");
			
			driver.switchTo().frame(0);
			
			driver.findElementByXPath("//button[@id='Click']").click();
		
			driver.switchTo().defaultContent();
			
			//WebElement eleframe1=driver.findElementByXPath("//iframe[@src='page.html']");
			
            driver.switchTo().frame(1);
            
           driver.switchTo().frame("frame2");
			
			driver.findElementById("Click1").click();
		
			driver.switchTo().defaultContent();
			
			List<WebElement> numFrames = driver.findElementsByXPath("//iframe");
			System.out.println("Number fo frames : "+numFrames.size());	
			
			
			
	}

}
