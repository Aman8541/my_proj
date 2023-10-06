package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Links_page;

public class Link_test extends BaseLibrary {
	Links_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Links_page();
	}
	@Test(priority = 0)
	public void clickElement() {
		obj.clickElement();
	}
	@Test(priority = 1)
	public void clicklinks() {
		obj.clicklink();
	}
	@Test(priority = 2)
	public void clickdemoPages() {
		obj.clickdemopage();
	}
	@Test(priority = 3)
	public void changeWindow() {
		obj.changeDemoWindow();
	}
	@Test(priority = 4)
	public void CloseWindow() {
		obj.closewindow();
	}

}
