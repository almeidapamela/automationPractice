package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {

    @FindBy(css = ".pb-center-column > h1:nth-child(1)")
    public WebElement productName;

    @FindBy(id = "add_to_cart")
    public WebElement addToCartBtn;

    @FindBy(css = "a.btn:nth-child(2)")
    public WebElement proceedToCheckoutBtn;
}
