package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {

    @FindBy(css = "td.cart_description > p:nth-child(1)")
    public WebElement nameProductSummary;
}
