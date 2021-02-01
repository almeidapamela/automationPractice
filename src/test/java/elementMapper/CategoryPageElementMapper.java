package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {
    @FindBy(className = "cat-name")
    public WebElement categoryTShirts;

    @FindBy(className = "product-container")
    public WebElement product;

    @FindBy(css = ".lnk_view > span:nth-child(1)")
    public WebElement moreBtn;

    @FindBy(css = ".right-block > h5:nth-child(1) > a:nth-child(1)")
    public WebElement productNameCategory;
}
