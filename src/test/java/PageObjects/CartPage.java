package PageObjects;

import elementMapper.CartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getNameProductSummary(){
        return nameProductSummary.getText();
    }
}
