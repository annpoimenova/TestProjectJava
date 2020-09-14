package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentManager {

    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/anna.poimenova/IdeaProjects/TestProjectJava/src/test/mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }
}
