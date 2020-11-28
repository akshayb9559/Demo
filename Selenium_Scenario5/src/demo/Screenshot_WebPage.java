package demo;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_WebPage {

	WebDriver wd;
	String url = "https://api.jquery.com/dblclick/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
		wd.manage().window().maximize();
	}

	@Test
	public void test() {
		try {
			File image = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Certification Data\\Take_ScreenShot.jpg");
			Files.copy(image, destination);


		} catch (IOException e) {
			System.out.println("Message : " + e.getMessage());
		}
	}

	@After
	public void tearDown() throws Exception {
		wd.quit();
	}
}
