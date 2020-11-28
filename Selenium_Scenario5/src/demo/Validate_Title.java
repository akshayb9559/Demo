package demo;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Title {

	WebDriver wd;
	String url = "http://openclinic.sourceforge.net/openclinic/home/index.php";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
		wd.manage().window().maximize();
	}

	@Test
	public void test() {
		String actualTitle = wd.getTitle();
		String expectedTitle = "Welcome to OpenClinic : Clinica1";
		
		assertEquals(actualTitle,expectedTitle);
	}

	@After
	public void tearDown() throws Exception {
		wd.quit();
	}
}
