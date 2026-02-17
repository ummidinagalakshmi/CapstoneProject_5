package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage {

    WebDriver driver;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    By header = By.xpath("//h1[contains(text(),'Get WordPress')]");

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }
}