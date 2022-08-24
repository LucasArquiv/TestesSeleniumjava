package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Function;

import static Runner.RunAuxiliar.Browser.CHROME;
public class RunAuxiliar {

   static WebDriver driver;

   // Tipos de Browser que será utilizado
   public enum Browser{CHROME, FIREFOX}
    // Métedos sobre escritos
    //Método de verificação de driver utilizados
   public static WebDriver getDriver(){
       // veficando se é null
       if (driver == null){
          return getDriver(Browser.CHROME);
       }else {
           return driver;
       }
   }
    // Método de escolha de BROWSER e iniciação de navegador
    public static WebDriver getDriver(Browser browser){

       if (driver != null) {
           driver.quit();
       }
       switch (browser){
           case CHROME:
               driver = new ChromeDriver();
               break;
           case FIREFOX:
               driver = new FirefoxDriver();
               break;
           default:
               throw new IllegalArgumentException("Passe um navegador válido");
       }
       return driver;
    }
}
