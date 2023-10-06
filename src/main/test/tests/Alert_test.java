package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Alert_page;

public class Alert_test extends BaseLibrary {
	Alert_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest(groups = "smoke")
	public void geturl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Alert_page(); 
	}
	@Test(priority = 0,groups = {"smoke","sanity"})
	public void clickAlert_frame_window() {
		obj.Clickalertframewindow();
	}
	@Test(priority = 1,groups = "sanity")
	public void clickAlert() {
		obj.Clickalert();
	}
	@Test(priority = 2)
	public void ClickAlert_WithOk(){
		obj.ClickAlertWithOk();
	}
	@Test(priority = 5)
	public void  clickAlertWithOK_5sec() {
		obj. ClickAlertWithOK_5sec();
	}
	@Test(priority = 4)
	public void  clickAlertWithOK_CANCLE() {
		obj. ClickAlertWithOK_CANCLE();
	}
	@Test(priority = 3)
	public void  clickAlertWithINPUTBOX(){
		obj. ClickAlertWithINPUTBOX();
	}

}
