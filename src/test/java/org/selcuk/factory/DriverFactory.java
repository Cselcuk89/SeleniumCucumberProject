package org.selcuk.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.selcuk.constants.FrameworkConstants.*;

public class DriverFactory {
    public static WebDriver instantiateDriver(String browser){
        WebDriver driver;
        switch (browser){
            case CHROME_BROWSER: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            }
            case FIREFOX_BROWSER: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            }
            case SAFARI_BROWSER: {
                driver = new SafariDriver();
                break;
            }
            case EDGE_BROWSER: {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            }
            case OPERA_BROWSER: {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            }
            default:
                throw new IllegalStateException("INVALID BROWSER: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
        }
    }

