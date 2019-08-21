package cucumbertesting123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class mytestlogin {
	WebDriver driver;
	@Given("TestMe is up and running")
	public void testme_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("registered user enters valid creds")
	public void registered_user_enters_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		  driver.findElement(By .name("password")).sendKeys("password123");
		  driver.findElement(By .name("Login")).click();
	}

	@Then("verifies for the login status for his cred")
	public void verifies_for_the_login_status_for_his_cred() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 String expected=driver.findElement(By .linkText("SignOut")).getText();
		  System.out.println(expected);
		  String actual="SignOut";
		  Assert.assertEquals(actual,expected);
		  driver.close();
	}

}
