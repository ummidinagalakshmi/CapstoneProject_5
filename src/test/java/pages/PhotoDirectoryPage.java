package pages;

import java.util.List;
import org.openqa.selenium.*;

public class PhotoDirectoryPage {

    WebDriver driver;

    public PhotoDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("wp-block-search__input-8");
    By images = By.xpath("//img");

    public void searchPhoto(String name) {
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(searchBox).submit();
    }

    public boolean verifyImagesDisplayed() {
        List<WebElement> pics = driver.findElements(images);
        return pics.size() > 0;
    }
}