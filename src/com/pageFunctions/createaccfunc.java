package com.pageFunctions;


import org.openqa.selenium.WebDriver;

import com.pageObjects.CreateAccountPage;
import com.selenium.SafeActions;





public class createaccfunc extends SafeActions implements CreateAccountPage {
	
	public WebDriver driver;



	public createaccfunc(WebDriver d) {
		super(d);
	}



	public void createacc(String Fname ,String Lname,String Uname,String pswd){
		
	
		
		safeMouseClick(Apply, 30);
		safeClearAndType(FirstName, Fname, 30);
		safeClearAndType(LastName, Lname, 30);
		safeClearAndType(UserName, Uname, 30);
		safeClearAndType(Password, pswd, 30);
		safeClearAndType(ConfirmPassword, pswd, 30);
		safeMouseClick(CreateAccountBtn, 30);
		
	}
}