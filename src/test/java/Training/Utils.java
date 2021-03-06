package Training;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Utils extends Base {
    public void capScreenshot(String Screenshot) {
        Screenshot = Screenshot + ".png";
        try {
            TakesScreenshot t = (TakesScreenshot) Base.driver;
            File source = t.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(".Screenshots" + Screenshot));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception" + e.getMessage());
        }
    }
}


