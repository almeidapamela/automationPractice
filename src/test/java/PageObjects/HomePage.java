package PageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnLogin(){
        login.click();
    }

    public void clickSearch(){
        search.click();
    }

    public void sendKeysSearch(String product){
        search.sendKeys(product);
    }

    public void clickSubmitSearch (){
        submit_search.click();
    }

    public void doSearch(String product){
        clickSearch();
        sendKeysSearch(product);
        clickSubmitSearch();
    }

    public void clickCategoryTShirt() {
        categoryTShirt.click();
    }
}
