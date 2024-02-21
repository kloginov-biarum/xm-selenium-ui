import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Time;

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
    @FindBy(css = "#DataTables_Table_0 tr.child td ul li:first-child span.dtr-data")
    private WebElement swapShortSmallDimension;

    @FindBy(css = "[data-xm-qa-name=\"limitStopLevel\"]")
    private WebElement limitStopLevel;

    @FindBy(css = "#DataTables_Table_0 > tbody > tr.child > td > ul > li:nth-child(2) > span.dtr-data")
    private WebElement limitStopLevelSmallDimension;

    @FindBy(css = "[href=\"https://www.xm.com/stocks/orkla\"]")
    private WebElement orklaReadMoreButton;

    @FindBy(css = ".child [href=\"https://www.xm.com/stocks/orkla\"]")
    private WebElement orklaReadMoreSmallDimensionButton;

    @FindBy(css = "[data-xm-qa-name=\"symbolWithDescription\"]")
    private WebElement expandDescriptionArrow;
    @FindBy(css = "[class=\"sticky-bar active\"] [class=\"fa fa-times\"]")
    private WebElement closeStickyMenuCross;

    public String headerText(){
        return getTextOfElement(header);
    }

    public void chooseFilterNorway(){
        elementIsDisplayed(norwayFilterButton, 40);
        scrollToElement(norwayFilterButton);
       try {
           clickOnTheElement(norwayFilterButton);
       }catch (ElementClickInterceptedException e){
           clickOnTheElement(closeStickyMenuCross);
           clickOnTheElement(norwayFilterButton);
       }
       }


    public void inputSearchText(String text){
        enterTextToElement(text, searchInputField);
    }

    public String getMinSpreadValue(){
        scrollToElement(minSpreadValue);
        return getTextOfElement(minSpreadValue);
    }

    public String getMinMaxTradeSize(){ scrollToElement(minSpreadValue);
        scrollToElement(minMaxTradeSize);
        return getTextOfElement(minMaxTradeSize);
    }
    public String getMarginRequirement(){
        scrollToElement(marginRequirement);
        return getTextOfElement(marginRequirement);
    }

    public String getSwapLong(){
        scrollToElement(swapLong);
        return getTextOfElement(swapLong);
    }

    public String getSwapShort(){
        try {
            return getTextOfElement(swapShort);
        }
        catch (TimeoutException e){
            clickOnTheElement(expandDescriptionArrow);
            return getTextOfElement(swapShortSmallDimension);
        }

    }

    public String getLimitStopLevel(){
        try {
            scrollToElement(limitStopLevel);
            return getTextOfElement(limitStopLevel);
        }
        catch (TimeoutException e){
         return getTextOfElement(limitStopLevelSmallDimension);
        }

    }

    public void clickOnReadMoreOrklaButton(){
    try {
        clickOnTheElement(orklaReadMoreButton);
    }catch (TimeoutException e){
        try {
            clickOnTheElement(expandDescriptionArrow);
            clickOnTheElement(orklaReadMoreSmallDimensionButton);
        }
        catch (TimeoutException ex){
            clickOnTheElement(expandDescriptionArrow);
            clickOnTheElement(orklaReadMoreSmallDimensionButton);
        }
    }

    }
}
