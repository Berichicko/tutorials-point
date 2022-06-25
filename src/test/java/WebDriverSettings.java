import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSettings {

    public WebDriver driver;
    final String urlConnection = "https://www.tutorialspoint.com/";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(urlConnection);
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
