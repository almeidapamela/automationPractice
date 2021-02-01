package PageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper {

    public SearchPage (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextNavigationPage(){
        return navigationPage.getText();
    }

    public String getTextProduct(){
        return product.getText();
    }

    public String getTextResultCounter(){
        return resultCounter.getText();
    }

    public boolean isSearchPage (){
        return getTextNavigationPage().equals("Search");
    }
}
