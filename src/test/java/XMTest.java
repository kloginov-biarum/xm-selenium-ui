import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XMTest extends BaseTest{

    @Test
    public void norwayStocks(){
        ModalWindow modalWindow = new ModalWindow(driver);
        modalWindow.clickOnAcceptAllButton();
        HomePage homePage = new HomePage(driver);
        homePage.openAnAccountButtonIsDisplayed();
        homePage.followTheTradingLink();
        TradingPage tradingPage = new TradingPage(driver);
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
        assertEquals("Margin requirement value doesn't match", marginRequirementFromStockPage, orklaPage.getMarginRequirementValue());
        assertEquals("Minimum spread value doesn't match", minSpreadValueFromStocksPage, orklaPage.getMinSpreadValue());
        assertEquals("Minimum/maximum trade size doesn't match", minMaxTradeSizeFromStocksPage, orklaPage.getMinMaxTradeSize());
        assertEquals("Swap long value doesn't match", swapLongFromStockPage, orklaPage.getSwapLong());
        assertEquals("Swap short value doesn't match", swapShortFromStockPage, orklaPage.getSwapShort());
        assertEquals("Limit/Stop level doesn't match", limitStopLevelFromStockPage, orklaPage.getLimitStopLevel());











    }
}
