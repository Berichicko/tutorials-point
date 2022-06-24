import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class SeleniumDemo extends Utils {


    @Test
    public void initDriver() {
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test
    public void verifyTitle() {
        System.out.println("In Verify Title Test Case");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Online Tutorials Library"));
    }

    @Test
    public void verifyHeading() {
        System.out.println("In Verify Heading Text Above Search Test Case");
        String expectedearchHeading = "  Enjoy theory and lab at the same time, right here online  ";
        String actualHeading = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/h2")).getText();
        assertEquals(expectedearchHeading, actualHeading);
    }
}

