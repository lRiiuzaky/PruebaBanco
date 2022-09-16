package testing.pruebagit.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverRemoteBrowser {

    public static WebDriver driver;

    public static DriverRemoteBrowser withOptions(){

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars;--no-sandbox;--test-type; --disable-extensions;--disable-translate");
        options.addArguments("--ignore-certificate-errors;--incognito;--disable-gpu;--no-sandbox;--disable-download-notification");
        driver = new ChromeDriver(options);
        return new DriverRemoteBrowser();
    }

    public static WebDriver en(String url){
        driver.get(url);
        return driver;
    }



}
