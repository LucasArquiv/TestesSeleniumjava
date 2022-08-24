package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumber.json","html:target/report/"},
        features = "src/test/resources/features",
        tags = {"@Mensagem-com-sucesso"},
        glue = {"Steps"}
)

public class RunCucumberTest extends RunAuxiliar {

    @AfterClass
    public static void stop(){
        driver.quit();
    }

}
