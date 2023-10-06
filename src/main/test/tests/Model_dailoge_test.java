package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import pages.Model_dailoge_page;

public class Model_dailoge_test extends BaseLibrary {
	Model_dailoge_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Model_dailoge_page();
	}
	@Test(priority = 0)
	public void click_Alert_windows_frame() {
		obj.Click_Alert_windows_frame();
	}
	@Test(priority = 1)
	public void click_Model_dailoge() {
		obj.Click_Model_dailoge();
		
	}
	@Test(priority = 2)
	public void read_Small_model() throws InterruptedException {
	    obj.Read_Small_model();	
	}
	@Test(priority = 3)
	public void read_Lage_model() throws InterruptedException {
		obj.Read_Lage_model();
	}

}
