package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import pages.Nested_frame_page;

public class Nasted_frame_test extends BaseLibrary {
	Nested_frame_page  obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Nested_frame_page ();
	}
	@Test(priority = 0)
	public void Click_Alert_windows_frame() {
		obj.Click_Alert_windows_frame();
	}
	@Test(priority = 1)
	public void Click_Frame() {
		obj.Click_nasted_frame();
	}	
	@Test(priority = 2)
	public void Enter_childframe() {
		obj.enter_childframe();
	}
	@Test(priority = 3)
	public void Enter_inner_parrentframe() {
		obj.enter_inner_parrentframe();
	}
	

}
