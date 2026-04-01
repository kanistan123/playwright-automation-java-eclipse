package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class basetest {
	
	
	Page page;

	@BeforeAll
	public void setup() {
		Playwright playwright=Playwright.create();
		Browser br=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page=br.newPage();
		page.navigate("https://bms.invictainnovations.com/admin/organization");
	}
	
	
	@AfterAll
	public void teardown() {
		page.close();
	}
	
	

}
