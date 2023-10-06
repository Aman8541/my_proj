package applicationutility;

import org.openqa.selenium.WebElement;

public interface Application_utility {
	public void DoubleClick(WebElement dc);
	public void RightClick(WebElement rc);
	public void mouseover(WebElement ele);
	public void mouseover_click(WebElement ele,String Linktext);
	public void handleWindows(int tabno);
	public void uplodefile(String path);
	public void selectByVisibleText(WebElement ele,String text);
	public void selectByvalue(WebElement ele,String value);
	public void selectByindex(WebElement ele,int index);
		
}
