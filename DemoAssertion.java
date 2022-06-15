package com.DemoAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.genric.BaseTest;

public class DemoAssertion extends BaseTest {
	
	
	
	public String getFullNameTextOnDemoPage() {
    	String Name = getDriver().findElement(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']")).getText();
    	return Name;
    }
    
    public void verifyFullTextOnDemoPage() {
    	
    	Assert.assertEquals(this.getFullNameTextOnDemoPage(),"Full Name*");
    }	
    public void verifyFullTextOnInTheDemoPage() {
    	Assert.assertTrue("Full Name*".contains("Full"));
    }
    
   public void verifyFullCharPresent() {
	   Assert.assertTrue(this.getFullNameTextOnDemoPage().contains("Full"));
   }
   
   public void verifyFullNameOnDemoPage() {
	   Assert.assertFalse("Full Name*".contains("Full"));;
	   System.out.println("The name is false");
   }
   
   public void verifyNameIsNull() {
	   Assert.assertNull(null);
	   System.out.println("The Name is False");
	   
   }
   public void verifyNameIsNotNull() {
	   Assert.assertNotNull(this.getFullNameTextOnDemoPage());
	   Assert.assertNotNull(this.getFullNameTextOnDemoPage(), "Full Name*");
   }
   
   public void verifyBothTheNameIsSame() {
	   Assert.assertSame(this.getFullNameTextOnDemoPage(),"Full");
	   System.out.println("The  both name are same");
   }
   
   public void verifyBothTheValuesAreNotSame() {
	   Assert.assertNotSame(this.getFullNameTextOnDemoPage(),"Full Name*");
	   System.out.println("The  both name are not same");
   }
   
   
   
}   

    
    
    
    
    

