package tests;

import environment.EnvironmentManager;
import environment.RunEnvironment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo() {
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("https://translate.google.com/");
        String homeUrl = driver.findElement(By.cssSelector("#gb > div.gb_1d.gb_je.gb_ae.gb_9d > div.gb_2c.gb_9c.gb_ad > div.gb_vc > div > a")).getAttribute("title");
        assertEquals(homeUrl, "Google Translate");
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
}