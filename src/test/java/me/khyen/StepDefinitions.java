package me.khyen;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import java.io.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class StepDefinitions {

	@When("^I run this correctly$")
	public void I_run_this_correctly() {
		System.out.println("test");
	}

	@Given("^Something here$")
	public void Something_here() throws InterruptedException {
		setup();
		System.out.println("something here");
	}

	public void setup() throws InterruptedException {
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		firefoxProfile.setPreference("browser.download.dir", ".");

		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
		firefoxProfile.setPreference("browser.download.useDownloadDir", true);
		firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/excel,application/msword,application/pdf,application/zip,audio/mpeg3,image/jpeg,image/png,text/plain");
		firefoxProfile.setPreference("dom.max_chrome_script_run_time", 300);
		firefoxProfile.setPreference("dom.max_script_run_time", 300);

		WebDriver webDriver = new FirefoxDriver(firefoxProfile);

		webDriver.get("http://www.google.com");

		Thread.sleep(10000);

		webDriver.quit();
	}

}
