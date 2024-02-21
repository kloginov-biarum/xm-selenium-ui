import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[contains(@href,\"www.xm.com/goto/members\")])[1]")
    private WebElement memberLoginButton;

   // @FindBy(xpath = "(//a[contains(@href,\"xm.com/goto/profile\")])[1]")
    @FindBy(css = ".block [href=\"https://www.xm.com/goto/profile/en\"]")
    private WebElement openAnAccountButton;

    @FindBy(xpath = "(//a[contains(@href,\"xm.com/help-center/home\")])[1]")
    private WebElement helpCenterButton;

    @FindBy(id = "dropdownMenu1")
    private WebElement languageDropdown;

    @FindBy(className = "main_nav_trading")
    private WebElement tradingLink;

    @FindBy(css = "[href=\"#tradingMenu\"]")
    private WebElement tradingLinkFromLeftNavMenu;

    @FindBy(className = "toggleLeftNav")
    private WebElement leftNavMenuButton;

    public void memberLoginButtonIsDisplayed(){
        elementIsDisplayed(memberLoginButton, 10);
    }

    public void openAnAccountButtonIsDisplayed(){
        elementIsDisplayed(openAnAccountButton, 10);
    }

    public void helpCenterButtonIsDisplayed(){
        elementIsDisplayed(helpCenterButton, 10);
    }

    public void languageDropdownIsDisplayed(){
        elementIsDisplayed(languageDropdown, 10);
    }

    public void followTheTradingLink() {
        try {
            clickOnTheElement(tradingLink);
        } catch (TimeoutException e) {
            clickOnTheElement(leftNavMenuButton);
            clickOnTheElement(tradingLinkFromLeftNavMenu);
        }
    }
}
