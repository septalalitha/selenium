import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver ","geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://book2.spicejet.com/"); 		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count= driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i<count; i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

}
}
