import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StocksPage extends BasePage{
    public StocksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement header;
    @FindBy(css = "[data-value=\"Norway\"]")
    private WebElement norwayFilterButton;

    @FindBy(css = "#DataTables_Table_0_filter input")
    private WebElement searchInputField;

    @FindBy(css = "[data-xm-qa-name=\"minSpread\"]")
    private WebElement minSpreadValue;

    @FindBy(css = "[data-xm-qa-name=\"minMaxTradeSize\"]")
    private WebElement minMaxTradeSize;
    @FindBy(css = "[data-xm-qa-name=\"marginRequirement\"]")
    private WebElement marginRequirement;

    @FindBy(css = "[data-xm-qa-name=\"swapLong\"]")
    private WebElement swapLong;

    @FindBy(css = "[data-xm-qa-name=\"swapShort\"]")
    private WebElement swapShort;

    @FindBy(css = "[data-xm-qa-name=\"limitStopLevel\"]")
    private WebElement limitStopLevel;

    @FindBy(css = "[href=\"https://www.xm.com/stocks/orkla\"]")
    private WebElement orklaReadMoreButton;

    @FindBy(css = ".child [href=\"https://www.xm.com/stocks/orkla\"]")
    private WebElement orklaReadMoreSmallDimensionButton;

    @FindBy(css = "[data-xm-qa-name=\"symbolWithDescription\"]")
    private WebElement expandDescriptionArrow;
    public String headerText(){
        return getTextOfElement(header);
    }

    public void chooseFilterNorway(){
        scrollToElement(norwayFilterButton);
        clickOnTheElement(norwayFilterButton);
    }

    public void inputSearchText(String text){
        enterTextToElement(text, searchInputField);
    }

    public String getMinSpreadValue(){
        return getTextOfElement(minSpreadValue);
    }

    public String getMinMaxTradeSize(){
        return getTextOfElement(minMaxTradeSize);
    }
    public String getMarginRequirement(){
        return getTextOfElement(marginRequirement);
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

    public void clickOnReadMoreOrklaButton(){
    try {
        clickOnTheElement(orklaReadMoreButton);
    }catch (TimeoutException e){
        clickOnTheElement(expandDescriptionArrow);
        clickOnTheElement(orklaReadMoreSmallDimensionButton);
    }

    }
}
