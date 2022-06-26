import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class SeleniumDemoTest extends WebDriverSettings {


    @Test
    public void givenWindowMaxWhenGetThenInitialize() {
        driver.manage().window().maximize();

    }

    @Test
    public void givenTitleWhenAddThenReturn() {
        System.out.println("In Verify Title Test Case");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Online Tutorials Library"));
    }

    @Test
    public void givenHeaderWhenAddThenReturn() {
        System.out.println("In Verify Heading Text Above Search Test Case");
        String expectedearchHeading = "fingertips";
        String actualHeading = driver.findElement
                (By.xpath("/html/body/main/section[1]/div/div/div[1]/h1/span")).getText();
        assertEquals(expectedearchHeading, actualHeading);
    }
}
