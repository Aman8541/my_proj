package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Select_menu_page;

public class Select_menu_test extends BaseLibrary {
	Select_menu_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Select_menu_page();
	}
	@Test(priority = 0)
	public void Click_Wedgets() {
		obj.click_Wedgets();
	}
	@Test(priority = 1)
	public void click_select_menu() {
		obj.Click_select_menu();
	}
	@Test(priority = 2)
	public void click_select_value() {
		obj.Click_select_value();
	}
	@Test(priority = 3)
	public void click_select_one() {
		obj.Click_select_one();
	}
	@Test(priority = 4)
	public void click_old_style_select_menu() {
		obj.Click_old_style_select_menu();
	}
	@Test(priority = 5)
	public void click_standard_multi_select() {
		obj.Click_standard_multi_select();
	}

}
