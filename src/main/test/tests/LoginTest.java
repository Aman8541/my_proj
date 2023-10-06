package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Loginpage;

public class LoginTest extends BaseLibrary{
	Loginpage obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Loginpage();
	}
	@Test
	public void titaltest() {
		obj.gettitals();
	}

}
