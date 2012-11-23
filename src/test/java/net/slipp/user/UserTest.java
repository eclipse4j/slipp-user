package net.slipp.user;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserTest {
    private WebDriver driver; 
    
    @Before
    public void setup() {
        driver = new FirefoxDriver();
    }
     
    @Test
    public void search() throws Exception {
        driver.get("http://localhost:8080");
        assertThat(driver.getTitle(), is("SLiPP"));
    }
     
    @After
    public void teardown() {
        driver.quit();
    }
}