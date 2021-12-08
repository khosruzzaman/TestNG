package com.Home;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

/**
 * In testNG, How many types of annotations are available? which annotations are did you used in your last project?
 * 
 * Annotations.
 * @BeforeGroups, @AfterGroups
 * @BeforeSuit, @AfterSuit
 * @BeforeClass, @AfterCalss
 * @BeforMethod, @Aftermethod
 * @BeforeTest, @AfterTest
 * 			@Test
 * @DataProvider
 * @Listener
 * @Parameters
 * 
 * 
 */

public class FirstUse {
	
	private static final String Parameters = null;

	@BeforeSuite
	void beforeSuit() {
		System.out.println("BeforeSuit Test");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("BeforeClass Test");
	}
	@BeforeMethod
	void beforeMethod() {
		
		System.out.println("BeforeMethod Test");
	}
	
	@BeforeTest
	void beforeTest() {
		
		System.out.println("BeforeTest Test");
		
	}
	@Test
	 void finalTest() {
		System.out.println("Final Test");
	}
	
	@Test
	 void finalTest2() {
		System.out.println("Final Test 2");
	}
	
	//@Parameters ({"First-name"})
	
	@Test
	public void pTest(String name ) {
		System.out.println("Parameter value is : "+name);
		assert"Miraz".equals(name);
	}
	
	@AfterSuite
	void afterSuit() {
		System.out.println("afterSuit Test");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("afterClass Test");
	}
	@AfterMethod
	void afterMethod() {
		
		System.out.println("afterMethod Test");
	}
	
	@AfterTest
	void afterTest() {
		
		System.out.println("afterTest Test");
		
	}
	
	

	
	

}
