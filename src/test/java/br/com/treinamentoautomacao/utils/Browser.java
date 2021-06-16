package br.com.treinamentoautomacao.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getCurrentDriver() throws MalformedURLException{

        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "C:/temp/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 30);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            
        }
        return driver;
    }

    public static void close() throws MalformedURLException{
        getCurrentDriver().quit();
        driver = null;
    }
    //irar abrir uma pagina
    public static void loadPage(String url) throws MalformedURLException {
        getCurrentDriver().get(url);
    }
    
}
