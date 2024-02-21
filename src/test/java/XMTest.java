import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XMTest extends BaseTest{

    @Test
    public void norwayStocks(){
        ModalWindow modalWindow = new ModalWindow(driver);
        modalWindow.clickOnAcceptAllButton();
        HomePage homePage = new HomePage(driver);
        homePage.memberLoginButtonIsDisplayed();
        homePage.helpCenterButtonIsDisplayed();
        homePage.openAnAccountButtonIsDisplayed();
        homePage.languageDropdownIsDisplayed();
        homePage.followTheTradingLink();
        TradingPage tradingPage = new TradingPage(driver);
        tradingPage.textDescriptionIsDisplayed();
        tradingPage.followTheStocksLink();
        StocksPage stocksPage = new StocksPage(driver);
        assertEquals("STOCKS",stocksPage.headerText());
        stocksPage.chooseFilterNorway();
        stocksPage.inputSearchText("ORK.OL");
        String minSpreadValueFromStocksPage = stocksPage.getMinSpreadValue();
        String minMaxTradeSizeFromStocksPage = stocksPage.getMinMaxTradeSize();
        String marginRequirementFromStockPage = stocksPage.getMarginRequirement();
        String swapLongFromStockPage = stocksPage.getSwapLong();
        String swapShortFromStockPage = stocksPage.getSwapShort();
        String limitStopLevelFromStockPage = stocksPage.getLimitStopLevel();
        stocksPage.clickOnReadMoreOrklaButton();
        OrklaPage orklaPage = new OrklaPage(driver);
        assertEquals(marginRequirementFromStockPage, orklaPage.getMarginRequirementValue());
        assertEquals(minSpreadValueFromStocksPage, orklaPage.getMinSpreadValue());
        assertEquals(minMaxTradeSizeFromStocksPage, orklaPage.getMinMaxTradeSize());
        assertEquals(swapLongFromStockPage, orklaPage.getSwapLong());
        assertEquals(swapShortFromStockPage,orklaPage.getSwapShort());
        assertEquals(limitStopLevelFromStockPage, orklaPage.getLimitStopLevel());











    }
}
