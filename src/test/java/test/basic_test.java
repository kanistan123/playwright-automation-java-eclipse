package test;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class basic_test {

	
	@Test
	public void test1() {
		Playwright playwright = Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://bms.invictainnovations.com/admin/organization");
		
		Locator email=page.locator("id=username");
		email.fill("superadmin");
		
		Locator password=page.locator("//input[@type='password']");
		password.fill("superadmin");
		
		page.locator("//span[text()='Sign in']").click();
		
		page.close();
		
		
		
		
		
	}
	
	
	
	
}
