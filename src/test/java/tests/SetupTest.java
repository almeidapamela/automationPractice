package tests;

import PageObjects.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utils.Browser;
import utils.Utils;

import java.math.MathContext;

import static org.junit.Assert.*;

public class SetupTest extends BaseTests {
    @Test
    public void testOpenBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos navegador e carregamos a URL!");
    }

    @Test
    public void testLogin(){
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage myAccount = new MyAccountPage();

        //CLICAR NO BOTÃO DE LOGIN NA HOME
        home.clickBtnLogin();
        System.out.println("Clique no login na Home");
        /*assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));*/
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("my-account"));


        assertTrue(login.isPageLogin());
        System.out.println("Direcionamento para a página de login");

        //REALIZAR O LOGIN
        login.doLogin("sextou@gmail.com", "123456");
        System.out.println("Realizamos o login");

        //VERIFICAR O DIRECIONAMENTO PARA A PÁGINA MY ACCOUNT
        assertTrue(myAccount.isPageMyAccount());
        System.out.println("Ao realizar o login ocorreu o direcionamento para a página My Account");
        /*assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=my-account")));
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT")); */

    }

    @Test

    public void testSearch(){
        String product = "DRESS";
        String resultCounter = "7";

        //Iniciar página
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Realizar pesquisa
        home.doSearch(product);

        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextProduct().replace("\"",""), product);
        assertThat(search.getTextResultCounter(), CoreMatchers.containsString(resultCounter));
    }

    @Test
    public void testAccessCategoryTShirt(){
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();
        home.clickCategoryTShirt();
        assertTrue(category.isTShirtPage());

    }
}
