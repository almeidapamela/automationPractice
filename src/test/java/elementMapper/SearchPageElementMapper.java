package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {
    @FindBy(className = "navigation_page")
    public WebElement navigationPage;

    @FindBy(className = "lighter")
    public WebElement product;

    @FindBy(className = "heading-counter")
    public WebElement resultCounter;

}
