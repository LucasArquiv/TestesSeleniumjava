package Pages;

import Runner.RunCucumberTest;
import Support.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

// Teste de verificação de item, na onde será validado se o item escolhido é mesmo para item de compra
public class ValidacaoPage extends RunCucumberTest {
    //variaveis de id Abstraidas
    private By BTNProduto = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]");

    public void BtnProduto() {
        getDriver().findElement(BTNProduto).click();
    }
    public void Produto(String Produto){
        Utils.waitElementBePresent(By.id("add_to_cart"),5);
        String NomeProduto = getDriver().findElement(By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1")).getText();
        Assert.assertEquals(Produto,NomeProduto);
    }
}
