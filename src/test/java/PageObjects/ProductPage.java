package PageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductName(){
        return productName.getText();
    }

    public void clickAddToCartBtn(){
        addToCartBtn.click();
    }

    public void clickProceedToCheckoutBtn(){
        proceedToCheckoutBtn.click();
    }

}
