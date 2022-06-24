import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class SeleniumDemoTest extends WebDriverManager {


    @Test
    public void givenWindowMaxWhenGetThenInitialize() {
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/");
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
        String expectedearchHeading = "  Enjoy theory and lab at the same time, right here online  ";
        String actualHeading = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/h2")).getText();
        assertEquals(expectedearchHeading, actualHeading);
    }
}
