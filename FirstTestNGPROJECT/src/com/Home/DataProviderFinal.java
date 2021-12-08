package com.Home;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFinal {

	
	@Test (dataProvider = "createData")
	public void userTest (String username, String password) {
		System.out.println("Your username is : "+username);
		System.out.println("Your password is : "+password);
	}

	@DataProvider
	public Object[][] createData(){
		
		Object[][] data = new Object[3][2];
		
		//first row
		data[0][0] = "user1";
		data[0][1] = "password1";
				
		
		//second row
		data[1][0] = "user2";
		data[1][1] = "password2";
		
		
		//Third row 
		data[2][0] = "user3";
		data[2][1] = "password3";
		
		return data;
	}
			

}