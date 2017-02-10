package tests.tryAshot;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import testMultiplyBrowsers.BrowserFactory;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Alex Astakhov on 30.01.2017.
 */
public class TestAshotKismia extends BrowserFactory {

    private static String RESOURCES_LAYOUT_DIR = "D:/testScreenshots";
    private static String expectedDir = RESOURCES_LAYOUT_DIR+"/expected/";
    private static String actualDir = RESOURCES_LAYOUT_DIR+"/actual/";
    private static String diffDir = RESOURCES_LAYOUT_DIR+"/diff/";
    private static String resultGifs = RESOURCES_LAYOUT_DIR+"/gifs/";

    @Test
    public void mainPageKismia() throws IOException {
        driver().manage().window().setSize(new Dimension(1366, 768));
        driver().get("https://kismia.com");
        createFolder(actualDir);
        createFolder(expectedDir);
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver());
        File expectedFile = new File(expectedDir + "name" + ".png");
        if (! expectedFile.exists()) {
            ImageIO.write(screenshot.getImage(), "png", expectedFile);
        }
        else {
            File actualFile = new File(actualDir + "name" + ".png");
            ImageIO.write(screenshot.getImage(), "png", actualFile);
        }

        

    }

    private static void createFolder(String path){
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
    }


}
