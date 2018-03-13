package ui.utils;

import org.openqa.selenium.WebDriver;

public class RemoteDriverManager {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
//    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    public static void closeDriver() {
        webDriver.get().quit();
    }
}