package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Browser_Window_page;


public class Browser_Window_test extends BaseLibrary {
	Browser_Window_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest(groups = "smoke")
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Browser_Window_page();
	}
	@Test(priority = 0,groups = "smoke")
	public void Click_Alert_windows_frame() {
		obj.click_Alert_windows_frame();
	}
	@Test(priority = 1,groups = "sanity")
	public void Click_browser_window() {
		obj.click_browser_window();
	}
	@Test(priority = 2)
	public void Open_new_tab() {
		obj.open_new_tab();
	}
	@Test(priority = 3)
	public void Open_new_window() {
		obj.open_new_window();
	}
	@Test(priority = 4)
	public void New_windows_message() {
		obj.new_windows_message();
	}

}
