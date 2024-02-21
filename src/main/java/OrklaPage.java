import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrklaPage extends BasePage{
    public OrklaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-xm-qa-name=\"margin_requirement__value\"]")
    private WebElement marginRequirement;

    @FindBy(xpath = "(//td[@data-xm-qa-name=\"spreads_as_low_as__value\"])[2]")
    private WebElement minSpreadValue;

    @FindBy(css = "[data-xm-qa-name=\"min_max_trade_size__value\"]")
    private WebElement minMaxTradeSize;

    @FindBy(css = "[data-xm-qa-name=\"swap_value_in_margin_currency_long__value\"]")
    private WebElement swapLong;

    @FindBy(css = "[data-xm-qa-name=\"swap_value_in_margin_currency_short__value\"]")
    private WebElement swapShort;

    @FindBy(css = "[data-xm-qa-name=\"limit_and_stop_levels__title\"].ltr")
    private WebElement limitStopLevel;
    public String getMarginRequirementValue(){
        return getTextOfElement(marginRequirement);
    }

    public String getMinSpreadValue(){
        return getTextOfElement(minSpreadValue);
    }

    public String getMinMaxTradeSize(){
        return getTextOfElement(minMaxTradeSize);
    }


    public String getSwapLong(){
        return getTextOfElement(swapLong);
    }
    public String getSwapShort(){
        return getTextOfElement(swapShort);
    }

    public String getLimitStopLevel(){
        return getTextOfElement(limitStopLevel);
    }
}
