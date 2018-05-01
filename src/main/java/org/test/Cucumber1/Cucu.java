package org.test.Cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Cucu {

WebDriver driver;
		@Given("^the user in demoqa website$")
		public void the_user_in_demoqa_website(){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Desktop\\bharathi Excep\\Cucumber1\\driver\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("http://demoqa.com/registration/");

		}

		@When("^the user fname and lname$")
		public void the_user_fname_and_lname() {
			driver.findElement(By.name("radio_4[]")).click();
			driver.findElement(By.name("checkbox_5[]")).click();
			driver.findElement(By.id("dropdown_7")).getText();
		   Select s=new Select(driver.findElement(By.id("dropdown_7")));
		   s.selectByIndex(10);
		}

		@Then("^the user verifies the entered text in fname and lname$")
		public void the_user_verifies_the_entered_text_in_fname_and_lname() {
			System.out.println(driver.findElement(By.name("radio_4[]")).getAttribute("value"));
			Assert.assertEquals("click",driver.findElement(By.name("radio_4[]")).getAttribute("value"));
			System.out.println(driver.findElement(By.name("checkbox_5[]")).getAttribute("value"));
			Assert.assertEquals("click",driver.findElement(By.name("checkbox_5[]")).getAttribute("value"));
			System.out.println(driver.findElement(By.id("dropdown_7")).getAttribute("value"));
			Assert.assertEquals("SelectByIndex(10)",driver.findElement(By.name("dropdown_7")).getAttribute("value"));
			
			
		    
		    
		}

	}


