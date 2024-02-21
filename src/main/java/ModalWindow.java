import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalWindow extends BasePage{

    public ModalWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@data-dismiss='modal'])[1]")
    private WebElement acceptAllButton;
    public void clickOnAcceptAllButton(){
        clickOnTheElement(acceptAllButton);
    }
}
