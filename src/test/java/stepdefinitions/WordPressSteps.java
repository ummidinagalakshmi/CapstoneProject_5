package stepdefinitions;

import org.testng.Assert;
import base.BaseTest;
import pages.*;
import io.cucumber.java.en.*;
import io.cucumber.java.After;

public class WordPressSteps extends BaseTest {

    HomePage home;
    DownloadPage download;
    PhotoDirectoryPage photo;

    @Given("User launches WordPress website")
    public void launch() {
        launchBrowser();
        home = new HomePage(driver);
    }

    @Then("Verify the title of the page")
    public void verifyTitle() {
        Assert.assertTrue(home.getTitle().contains("WordPress"));
    }

    @When("User mouse hover and click Get WordPress")
    public void clickDownload() {
        home.clickDownloadAndGetWordPress();
    }

    @Then("Verify Get WordPress text")
    public void verifyText() {
        download = new DownloadPage(driver);
        Assert.assertTrue(download.getHeaderText().contains("Get WordPress"));
    }

    @When("User clicks Community and Photo Directory")
    public void clickCommunity() {
        home.clickCommunityAndPhotoDirectory();
    }

    @When("User searches photo name {string}")
    public void searchPhoto(String name) {
        photo = new PhotoDirectoryPage(driver);
        photo.searchPhoto(name);
    }

    @Then("Verify pictures are displayed")
    public void verifyImages() {
        Assert.assertTrue(photo.verifyImagesDisplayed());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}