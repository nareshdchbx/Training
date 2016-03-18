
package com.pageFunctions;


	import org.openqa.selenium.WebDriver;

import com.pageObjects.DCgovLoginObjects;


	


	public class DcGovLoginPage extends com.selenium.SafeActions implements DCgovLoginObjects{
	
		
		
		public DcGovLoginPage(WebDriver d) {
			super(d);
			
		}

		public void login(String uname, String pwd){
			

			safeMouseClick(loginbutton, 30);
			
			waitUntilPresent(username,10);
					
			safeClearAndType(username, uname, 30);

			safeClearAndType(password, pwd, 30);
			
			safeMouseClick(lbutton, 30);

		}
		
public void login1(String uname, String pwd){
			

						
			waitUntilPresent(username,10);
					
			safeClearAndType(username, uname, 30);

			safeClearAndType(password, pwd, 30);
			
			safeMouseClick(lbutton, 30);

		}
		
	}








