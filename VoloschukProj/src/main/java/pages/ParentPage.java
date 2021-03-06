package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String expectedUrl;
    final String baseUrl = "http://v3.test.itpmgroup.com";


    public ParentPage(WebDriver webdriver, String expectedUrl) {
        this.webDriver = webdriver;
        this.expectedUrl = baseUrl + expectedUrl;
    }

    //return actual url of opened page
    public  String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }

    public void checkCurrentUrl(){
        try {
            Assert.assertEquals("Url is not expected", expectedUrl, getCurrentUrl());
        } catch (Exception e){
            logger.error("Cannot work with Url");
            Assert.fail("Cannot work with Url");
        }

    }
}
