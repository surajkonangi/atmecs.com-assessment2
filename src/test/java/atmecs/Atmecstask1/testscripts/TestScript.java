package atmecs.Atmecstask1.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.PageAction;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;
import com.atmecs.atmecswebsite.validation.PagesValidation;

public class TestScript extends TestBase {
    
	@Test
	public void moreinfovalidate() throws IOException {
		
		Readproperties read = new Readproperties();
    	PageAction page = new PageAction();
    	
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("hamoepage.explorenow.button"));
    	PagesValidation.explorevalidate();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.clicklogo.img"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.aimimoreinfo.button"));
    	PagesValidation.aimipagevalidate();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.clicklogo.img"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.argumentedinfo.button"));
    	PagesValidation.ArgumentedValidation();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.clicklogo.img"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.internetofthingsinfo.button"));
    	PagesValidation.internetofthingsvalidation();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.clicklogo.img"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.chatbots.button"));
    	PagesValidation.chatbotsvalidation();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.clicklogo.img"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.blockchain.button"));
    	PagesValidation.blockchainvalidation();
    	
    	
    	
    	
    	driver.quit();
    	
    	
    	
    	
	}
}
