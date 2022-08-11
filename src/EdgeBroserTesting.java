import javafx.beans.property.SetProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class EdgeBroserTesting {

    public static void main(String[] args) {
        EdgeBroserTesting d = new EdgeBroserTesting();
                d.edgetest();
    }
    public void edgetest(){
        String baseurl= "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
      //  driver.close();

    }

}
