package Week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		WebElement eleTable = driver.findElementById("table_id");
		//rows of table 
		List<WebElement> Allrows = eleTable.findElements(By.tagName("tr"));
		System.out.println("Size of Rows: "  + Allrows.size());
		
		//for (int i = 1; i < Allrows.size(); i++) {
			WebElement eachrow=Allrows.get(1);
			List<WebElement> Allcol =eachrow.findElements(By.tagName("td"));
			System.out.println("Size of Coloumn: "  + Allcol.size());
			System.out.println(Allrows.get(2).getText());
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
