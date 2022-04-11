package com.feeditback.pages;

import com.feeditback.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RatingPage extends Utility {


    public RatingPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[5]/div[1]/div[2]/div[1]/*[1]")
    WebElement clickOnGoodSmileyFood;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[5]/div[1]/div[2]/div[1]/*[1]")
    WebElement clickOnNeutralSmiley;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/button[1]/span[2]/span[1]")
    WebElement nextButtonAfterRateFoodDrink;


    @CacheLookup
    @FindBy(xpath = "//div[@class='q-slider__thumb-container q-slider__thumb-container--h absolute non-selectable']")
    WebElement slider;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
    WebElement sliderTrack;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[3]/button[1]/span[2]/span[1]")
    WebElement nextButtonAfterSlider;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")
    WebElement dessertMenu;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[3]/div[1]/div[2]/div[1]/*[1]")
    WebElement churros;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'I loved the taste')]")
    WebElement lovedTaste;

    @CacheLookup
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[2]/span[1]")
    WebElement doneButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row']//span[text()='Save & Continue']")
    WebElement saveAndContinue;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='q-app']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]")
    WebElement mainCourse;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]/div[1]/div[2]/div[1]/*[1]")
    WebElement beefRanDang;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'It was a good price')]")
    WebElement itWasGoodPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row']")
    WebElement nextAfterMenuOption;

    @CacheLookup
    @FindBy(xpath = "//span[@class='block']")
    WebElement skipButtonAfterMenuOption;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Other Single Line Question: What was your favourit')]")
    WebElement singleLineText;

    @CacheLookup
    @FindBy(css = "#f_8613a95a-c9c1-4eaa-8392-c18485c87103")
    WebElement enterSingleLineText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Other Multiline Question: What could we do better?')]")
    WebElement multiLineText;

    @CacheLookup
    //@FindBy(xpath = "//textarea[@id='f_1e5e58df-4630-43ed-bfbc-4e0d13239d43']")
    @FindBy(css = "#f_d44be502-21de-4c9b-8201-a4beb0d7fbfe")
    WebElement enterMultilineText;

    @CacheLookup
    @FindBy(xpath = "//div[@CLASS='q-field__control-container col relative-position row no-wrap q-anchor--skip']")
    WebElement enterText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thanks for your feedback']")
    WebElement verifyThankyou;

    @CacheLookup
    @FindBy(xpath = "//canvas[@class='scratchcard-overlay']")
    WebElement scratchCard;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'No thanks')]")
    WebElement noThanksButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your feedback summary']")


    WebElement feedbackSummary;

    @CacheLookup
    @FindBy(xpath = "//div[@class='photo-upload photo-upload__no-background']")
    WebElement uploadPhotoicon;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/button/span[2]/span")
    WebElement uploadPhotoBlock;


    public void setClickOnGoodSmileyForFood() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000);");
        mouseHoverToElementAndClick(clickOnGoodSmileyFood);


    }

    public void setClickOnNeutralSmiley() {

        mouseHoverToElementAndClick(clickOnNeutralSmiley);
    }

    public void clickOnNextButtonAfterRateFoodDrink() throws InterruptedException {
        clickOnElement(nextButtonAfterRateFoodDrink);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000);");
    }

    public void clickOnSliderTrack() {
        mouseHoverToElementAndClick(sliderTrack);
    }

    public void dragSlider() {
        System.out.println(slider.getLocation());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 250, 0).perform();
        System.out.println(slider.getLocation());
    }

    public void clickOnNextButtonAfterSlider() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(nextButtonAfterSlider);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000);");
    }

    public void clickOnDessertMenuOption() {
        clickOnElement(dessertMenu);
    }

    public void clickOnChurrosGoodSmileys() {
        clickOnElement(churros);
    }

    public void clickOnIlovedTaste() {
        clickOnElement(lovedTaste);
    }

    public void clickOnDoneButtonOfChurros() {
        clickOnElement(doneButton);
    }

    public void clickOnSaveAndContinue() {
        clickOnElement(saveAndContinue);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000);");
    }

    public void clickOnMainCourse() {
        clickOnElement(mainCourse);
    }

    public void clickOnBeefRanDang() {
        clickOnElement(beefRanDang);
    }

    public void clickOnItWasGoodPriceOption() {
        clickOnElement(itWasGoodPrice);
    }

    public void clickOnNextButtonAfterMenuOption() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(nextAfterMenuOption);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000);");
    }

    public void clickOnSkipButtonAfterMenuOption() throws InterruptedException {

        mouseHoverToElementAndClick(skipButtonAfterMenuOption);
    }
//
//    public void selectQuestion(){
//
//        if(enterSingleLineText.isDisplayed()==true) {
//            //mouseHoverToElementAndClick(enterSingleLineText);
//            //enterSingleLineText.sendKeys("Asian", Keys.ENTER);
//            sendTextToElement(enterSingleLineText, "Asian");
//        }else if (enterMultilineText.isDisplayed()==true){
//            //mouseHoverToElementAndClick(enterMultilineText);
//            //enterMultilineText.sendKeys("Everything was Good",Keys.ENTER);
//            sendTextToElement(enterMultilineText,"Everything was Good");
//        }
//        }

    public String verifyThankyouText() {
        return getTextFromElement(verifyThankyou);
    }

    public void clickOnScratchCard() {
        Actions actions = new Actions(driver);
        actions.moveToElement(scratchCard);
        actions.clickAndHold().perform();
        System.out.println(getTextFromElement(scratchCard));

    }

    public void clickOnNoThanksButton() {
        clickOnElement(noThanksButton);
    }

    public String verifyFedBackSummaryText() {
        return getTextFromElement(feedbackSummary);
    }

    public void clickOnUploadPhotoIcon() {
        clickOnElement(uploadPhotoicon);
    }

    public void clickOnUploadPhoto() throws InterruptedException {
        mouseHoverToElementAndClick(uploadPhotoBlock);
        Thread.sleep(1000);
        WebElement frame = driver.switchTo().activeElement();
        frame.sendKeys("Desktop\\pexels-ann-h-11159274.jpg");
    }
}
