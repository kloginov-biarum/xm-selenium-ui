import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingPage extends BasePage{
    public TradingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".main_nav_trading .hidden-sm:nth-child(1)")
    private WebElement textDescription;

    @FindBy(css = ".menu-stocks a")
    private WebElement stocksLink;
    public void textDescriptionIsDisplayed(){
        elementIsDisplayed(textDescription, 5);
    }

    public void followTheStocksLink(){
        clickOnTheElement(stocksLink);
    }



}
