package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void a() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://maven.apache.org/download.cgi");
		System.out.println("Hello shammi");
		System.out.println("Hello New Branch");
		System.out.println("Hello Child Branch");
	}
}
