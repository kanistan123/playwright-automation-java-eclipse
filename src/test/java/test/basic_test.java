package test;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;

import base.basetest;

public class basic_test extends basetest {

	@Test
	public void test1() {

		Locator email = page.locator("id=username");
		email.fill("superadmin");

		Locator password = page.locator("//input[@type='password']");
		password.fill("superadmin");

		page.locator("//span[text()='Sign in']").click();
	}

}
