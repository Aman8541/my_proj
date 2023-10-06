package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Menu_page;

public class Menu_test extends BaseLibrary {
	Menu_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchedURL(String env,String browsername ) {
		launchURL(getdata(env),browsername);
		obj=new Menu_page();
	}
	@Test(priority = 0)
	public void CLICK_wedgetss() {
		obj.clickWedgets();
	}
	@Test(priority = 1)
	public void CLICK_menuu() {
		obj.clickmenu();
	}
	@Test(priority = 2)
	public void MOUSEOVER() {
		obj.MouseOver();
	}
	@Test(priority = 3)
	public void mouseover_CLICK() {
		obj.MouseOver_click();
	}
	

}
