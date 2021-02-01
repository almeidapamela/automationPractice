package PageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {
    public CategoryPage (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getCategoryName(){
        return categoryTShirts.getText();
    }

    public boolean isTShirtPage(){
        return getCategoryName().contains("T-SHIRTS");
    }
}
