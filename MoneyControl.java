package pro;

public class MoneyControl {

	public static void main(String args[])
	
	{
		System.setProperty("WebDriver.chrome.driver","./driver/chrome/ChromeDriver.exe");
		//Initializing the Chrome driver exe file
		Driver driver= new driver.ChromeDriver;
		driver.manage().window().maximize();
		driver.manage().window().timeout().impicitWait(60,TimeUnits.SECONDS);

		//Getting the website
		driver.get.url("https://www.moneycontrol.com/");
		
		//Click on Stocks link
		
		WebElement stockEle= driver.findelement(By.linkText("Stocks");
		stockEle.click();
		
		//to get all the company list
		
  driver.findelement(By.xpath("//table[@class='pcq_tbl MT10'pcq_tbl MT10']/tbody/tr/td"));
  //to get all the links and linktext pf the company under A
  
  WebElelement linkEle=driver.findelement(By.xpath("//table[@class='bl_12']/tbody/tr/td[1]));"
  int total;
  for (int i=0;i<=1;i++)
  {
	  
	  String total(linkEle.linktext());
	  System.out.println("All link");
	  		
  }
		
  
  //Titile:
  WebElelement titleEle = driver.findelement(by.xpath("//*[@company_name='Ashok Leyland Ltd.'));
  driver.getTitile();
  System.out.println("Tittle" , +titleEle);
  
		
				
		
	}

}
