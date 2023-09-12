package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTestCase extends ProjectSpecificMethod{
	@Test
	public void run() {
		
		LoginPage lp=new LoginPage();
		lp.userName().password().login();
	}

}
