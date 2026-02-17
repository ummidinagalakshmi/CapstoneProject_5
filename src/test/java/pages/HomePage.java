package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By downloadExtend = By.linkText("Extend");
    By getWordPress = By.linkText("Get WordPress");
    By community = By.linkText("Community");
    By photoDirectory = By.linkText("Photo Directory");

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickDownloadAndGetWordPress() {

        Actions act = new Actions(driver);

        WebElement downloadMenu =
                wait.until(ExpectedConditions.visibilityOfElementLocated(downloadExtend));

        act.moveToElement(downloadMenu).perform();

        WebElement getWP =
                wait.until(ExpectedConditions.elementToBeClickable(getWordPress));

        getWP.click();
    }

    public void clickCommunityAndPhotoDirectory() {

        WebElement communityMenu =
                wait.until(ExpectedConditions.elementToBeClickable(community));

        communityMenu.click();

        WebElement photoDir =
                wait.until(ExpectedConditions.elementToBeClickable(photoDirectory));

        photoDir.click();
    }
}