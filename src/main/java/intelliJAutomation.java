import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class intelliJAutomation {

    public static WindowsDriver driver;


    public static void main(String[] args) throws Exception {
        Thread.sleep(2000);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.1.2\\bin\\idea64.exe");
        desiredCapabilities.setCapability("platformName", "Windows");
        desiredCapabilities.setCapability("deviceName", "WindowsPC");
        try {
            Thread.sleep(1000);
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
            Thread.sleep(5000);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
            e.printStackTrace();
        }
        finally {
            Thread.sleep(30000);

            Actions actions = new Actions(driver);
            Robot robot = new Robot();
            if(driver.findElementsByName("intellijAuto – intelliJAutomation.java Administrator").size()!=0) {
                robot.mouseMove(53, 10);
                actions.click().build().perform();
                robot.mouseMove(164, 80);
                Thread.sleep(1000);
                robot.mouseMove(365, 80);
                Thread.sleep(1000);
                actions.click().build().perform();
            }
            Thread.sleep(20000);
            robot.mouseMove(1743,40);
            Thread.sleep(1000);
            actions.click().build().perform();
            //driver.quit();


        }



    }
}
