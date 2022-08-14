package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword= driver.findElement(By.name("PASSWORD"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
	String text =elementWelcomeMessage.getText();
	System.out.println(text);
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
	WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
	sourceId.sendKeys("Website");
	
	WebElement elementCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select CampaignId = new Select(elementCampaign);
	CampaignId.selectByIndex(3);
	
	WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select Indu = new Select(elementIndustry);
	Indu.selectByVisibleText("Computer Software");
	WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select Own = new Select(elementOwnership);
	Own.selectByValue("OWN_CCORP");
	
	WebElement elementCreateLeaad = driver.findElement(By.className("smallSubmit"));
	elementCreateLeaad.click();
	

}

}
