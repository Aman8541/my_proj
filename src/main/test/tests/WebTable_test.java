package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.TextBox_page;
import pages.WebTable;

public class WebTable_test extends BaseLibrary{
	WebTable  obj1;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj1=new WebTable();
	}
	@Test(priority = 1)
	public void click_element() {
		obj1.clickElement();
	}
	@Test(priority = 2)
	public void clickwebtable() {
		obj1.clickwbTable();
	}
	@Test(priority = 3)
	public void fillDataonWebtable() {
		obj1.fillDataONWebtable();
	}
	@Test(priority = 4)
	public void verifywebtabledata() {
		obj1.verifyWebtableData();
	}
	@Test(priority = 5)
	public void updatewebtable() {
		obj1.updatewebtable();
	}

}
