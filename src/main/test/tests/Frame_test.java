package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import pages.Frame_page;

public class Frame_test extends BaseLibrary {
	Frame_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Frame_page();
	}
	@Test(priority = 0)
	public void Click_Alert_windows_frame() {
		obj.click_Alert_windows_frame();
	}
	@Test(priority = 1)
	public void Click_Frame() {
		obj.click_frame();
	}
	@Test(priority = 2)
	public void Read_childframe1_text() {
		obj.read_childframe1_text();
	}
	@Test(priority = 3)
	public void Read_childframe2_text() {
		obj.read_childframe2_text();
	}
	@Test(priority = 4)
	public void Read_parentframe_text() {
		obj.read_parentframe_text();
	}

}
