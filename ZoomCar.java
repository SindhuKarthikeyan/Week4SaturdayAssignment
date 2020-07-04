package Week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
		
		drivers.get("https://www.zoomcar.com/chennai");
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		drivers.findElementByXPath("//a[@class='search']").click();
		
		drivers.findElementByXPath("(//div[@class='items'])[1]").click();
		
		Thread.sleep(3000);
		
		drivers.findElementByXPath("//button[@class='proceed']").click();
		
		//Thread.sleep(3000);
		
		drivers.findElementByXPath("//div[@class='day low-price']").click();
		
		drivers.findElementByXPath("//button[@class='proceed']").click();
		
		Thread.sleep(3000);
		
		drivers.findElementByXPath("//div[@class='actions']/button").click();
		
		Thread.sleep(3000);
		
		 List<WebElement> AllCarNames = drivers.findElementsByXPath("//h3");
		  
		  Set<String> CarNames = new TreeSet<String>();
		  
		  for (WebElement EachNames: AllCarNames) {
			  
			String T1=  EachNames.getText();
			
			System.out.println(T1);
			}
		  int ListSize= AllCarNames.size();
		  
		  System.out.println("The number of Result displayed :" +ListSize);
		  
		Map<Integer,String> map= new LinkedHashMap<Integer,String>();
		
		List<WebElement> carNames = drivers.findElementsByXPath("//div[@class='details']/h3");

		List<WebElement> carPrices = drivers.findElementsByXPath("//div[@class='price']");
		List<Integer> maxprice = new ArrayList<Integer>();

		for (int i = 0; i < carNames.size(); i++) {

			String carNameKey = carNames.get(i).getText();

			String carPriceValue = carPrices.get(i).getText().replaceAll("[^0-9]", "");
			map.put(Integer.parseInt(carPriceValue), carNameKey);
			maxprice.add(Integer.parseInt(carPriceValue));

		}
		System.out.println(map);
		int size = map.size();

		Collections.sort(maxprice);
		int price = maxprice.get(maxprice.size() - 1);
		System.out.println("Max price is : " + price);
		String car = map.get(price);
		System.out.println(car+"----> "+price);
		drivers.findElementByXPath("(//h3[text()='"+car+"']/following::button)").click();
		
	}
			
			
		
		
		  
		
		  
			
		}
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


