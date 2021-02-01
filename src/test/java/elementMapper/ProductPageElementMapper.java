package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {

    @FindBy(css = ".pb-center-column > h1:nth-child(1)")
    public WebElement productName;
}
