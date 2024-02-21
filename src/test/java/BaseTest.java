import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    ChromeDriver driver;
    String BASE_URL = "https://www.xm.com/";

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/ergrevegvrg/chromedriver");
        Dimension dimension = new Dimension(1024, 768);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(dimension);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(BASE_URL);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
