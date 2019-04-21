import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class openSite {
WebDriver wd;



@BeforeClass
public void setUp()
{
    wd = new ChromeDriver();
}
    @Test
public void openHomePage(){
wd.navigate().to("https://www.ebay.com/");
       String Actual = wd.getCurrentUrl();

        Assert.assertEquals(Actual, "https://www.ebay.com/");
    }
    @AfterClass
    public void tearDown()
    {
wd.quit();
    }
}

