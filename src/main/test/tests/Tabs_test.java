package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import pages.Tabs_page;

public class Tabs_test extends  BaseLibrary {
	Tabs_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Tabs_page();
	}
	@Test(priority = 0)
	public void Clickwedgets()  {
		obj.clickwedgets();
	}
	@Test(priority = 1)
	public void Clicktabs() {
		obj.clicktabs();;
	}
	@Test(priority = 2)
	public void ReadTextFromtab1() {
		obj.readTextFromtab1();
	}
	@Test(priority = 3)
	public void ReadTextFromtab2() {
		obj.readTextFromtab2();
	}
	@Test(priority = 4)
	public void ReadTextFromtab3() {
		obj.readTextFromtab3();
	}

}
