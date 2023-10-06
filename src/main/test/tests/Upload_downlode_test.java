package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Upload_downlode_page;

public class Upload_downlode_test extends BaseLibrary {
	Upload_downlode_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void geturl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Upload_downlode_page();
	}
	@Test(priority = 0)
	public void Clickelement() {
		obj.clickElements();
	}
	@Test(priority = 1)
	public void Click_uplode_downlode() {
		obj.clickuplode_downlode();
	}
	@Test(priority = 2)
	public void ClickSelectfile() {
		obj.clickselectfile();
	}
	@Test(priority = 3)
	public void uplodefile() {
		obj.UplodeFile();
	
	}
	

}
