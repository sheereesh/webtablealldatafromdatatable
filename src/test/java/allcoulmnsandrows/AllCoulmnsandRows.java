package allcoulmnsandrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCoulmnsandRows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/ul/li/a[contains(text(),'Sortable Data Tables')]")).click();
		int rows=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr")).size();
		System.out.println("number of rows "+rows);
		int colums=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th")).size();
		System.out.println("number of columns "+ colums);
		
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<colums;c++) {
			 
		String	data=driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
		System.out.println(data);
	}
		System.out.println();
	}

	}
}
