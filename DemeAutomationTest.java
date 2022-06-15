package com.DemoAutomationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.DemoAutomation.DemoAssertion;
import com.genric.BaseTest;

public class DemeAutomationTest extends BaseTest{
	
	private DemoAssertion objDemoAssertion;
	
	public void initializeWebPages() {
	  objDemoAssertion = new DemoAssertion();
	}

     @BeforeClass
	    public void checkFullNamePage() {
    	 this.initializeWebPages();
    	 objDemoAssertion.initilizeWebDriver();
     }
   
	    @Test
	    public void checkFullNameDisplyedDetails() {
	    objDemoAssertion.getFullNameTextOnDemoPage();
	    objDemoAssertion.verifyFullTextOnDemoPage();
	    objDemoAssertion.verifyFullTextOnInTheDemoPage();
	    objDemoAssertion.verifyFullCharPresent();
	    objDemoAssertion.verifyNameIsNull();
	    objDemoAssertion.verifyNameIsNotNull();
	    objDemoAssertion.verifyBothTheNameIsSame();
	    objDemoAssertion.verifyBothTheValuesAreNotSame();
	    }
	    
}
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	  
	  

