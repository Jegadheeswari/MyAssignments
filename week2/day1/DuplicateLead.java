package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword= driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		elementCrmsfa.click();
		WebElement elementLead  = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		WebElement elementCreateLead  = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName  = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Capgemini");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Priya");
		
		WebElement elementLastName  = driver.findElement(By.id("createLeadForm_lastName"));;
		elementLastName.sendKeys("Dharshini");
		
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Priyoo");
		
		WebElement elementDepartment = driver.findElement(By.name("departmentName"));
		elementDepartment.sendKeys("Testing");
		
		WebElement elementDescription = driver.findElement(By.name("description"));
		elementDescription.sendKeys("Hi Welcome to the portal");
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("prigeryg@gmail.com");
		
		WebElement elementState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select Province = new Select(elementState);
		Province.selectByVisibleText("New York");
		
		
		WebElement elementCreateLeaad = driver.findElement(By.className("smallSubmit"));
		elementCreateLeaad.click();
		
		System.out.println(driver.getTitle());
		
		WebElement elementDuplicate = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicate.click();
		
		WebElement elementNewCompanyName  = driver.findElement(By.id("createLeadForm_companyName"));
		elementNewCompanyName.clear();
		elementNewCompanyName.sendKeys("Virtusa");
		
		WebElement elementNewFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementNewFirstName.clear();
		elementNewFirstName.sendKeys("kani");
		
		WebElement elementCreateLeaad1 = driver.findElement(By.className("smallSubmit"));
		elementCreateLeaad1.click();
		
		System.out.println(driver.getTitle());
		

	}


}
