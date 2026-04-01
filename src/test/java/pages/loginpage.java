package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class loginpage {
	
	private Page page;

	public void test() {
	Locator email = page.locator("id=username");
	email.fill("superadmin");

	Locator password = page.locator("//input[@type='password']");
	password.fill("superadmin");

	page.locator("//span[text()='Sign in']").click();
	
	
	}
	
}
