package com.feeditback.cucumber.steps;

import com.feeditback.pages.RatingPage;
import com.feeditback.pages.VisitPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {


    @Given("^I am on visit page$")
    public void iAmOnVisitPage() {
        System.out.println("I am on how was your visit page");
    }

    @When("^I click on 'Not got a code\\?' link$")
    public void iClickOnNotGotACodeLink() {
        new VisitPage().clickOnNotGoodCode();

    }

    @And("^I am on location page and I click on 'Food And Drink Branch'$")
    public void iAmOnLocationPageAndIClickOnFoodAndDrinkBranch() {
        new VisitPage().clickOnLocation();
    }

    @And("^I click on yesterday tab$")
    public void iClickOnYesterdayTab() {
        new VisitPage().setClickOnYesterday();
    }

    @And("^I select hour,minutes and am time slot$")
    public void iSelectHourMinutesAndAmTimeSlot() {
        new VisitPage().setClickOnHour();
    }

    @Then("^I click on start button and start my survey$")
    public void iClickOnStartButtonAndStartMySurvey() {
        new VisitPage().setClickOnStart();

    }

    @And("^I click on good smiley for food$")
    public void iClickOnGoodSmileyForFood() throws InterruptedException {
        new RatingPage().setClickOnGoodSmileyForFood();

    }

    @And("^I click on neutral smiley for drinks$")
    public void iClickOnNeutralSmileyForDrinks() {
        new RatingPage().setClickOnNeutralSmiley();
    }

    @And("^I click on Next button after rate food and drinks$")
    public void iClickOnNextButtonafterateFoodAndDrinks() throws InterruptedException {
        new RatingPage().clickOnNextButtonAfterRateFoodDrink();
    }

    @And("^I click on slider Track$")
    public void iClickOnSliderTrack() {
        new RatingPage().clickOnSliderTrack();
    }

    @And("^I drag the slider to change score$")
    public void iDragTheSliderToChangeScore() {
        new RatingPage().dragSlider();
    }


    @And("^I click on Next button after Slider$")
    public void iClickOnNextButtonAfterSlider() throws InterruptedException {
        new RatingPage().clickOnNextButtonAfterSlider();
    }

    @And("^I click on Dessert menu option$")
    public void iClickOnDessertMenuOption() {
        new RatingPage().clickOnDessertMenuOption();
    }

    @And("^I click on Churros Good Smileys$")
    public void iClickOnChurrosGoodSmileys() {
        new RatingPage().clickOnChurrosGoodSmileys();
    }

    @And("^I select I loved the Taste$")
    public void iSelectILovedTheTaste() {
        new RatingPage().clickOnIlovedTaste();
    }

    @And("^I click on Done button$")
    public void iClickOnDoneButton() {
        new RatingPage().clickOnDoneButtonOfChurros();
    }

    @And("^I click on save and Continue button$")
    public void iClickOnSaveAndContinueButton() {
        new RatingPage().clickOnSaveAndContinue();
    }

    @And("^I click on Main Course menu option$")
    public void iClickOnMainCourseMenuOption() {
        new RatingPage().clickOnMainCourse();
    }

    @And("^I click on beefRanDang Good Smiley$")
    public void iClickOnBeefRanDangGoodSmiley() {
        new RatingPage().clickOnBeefRanDang();
    }

    @And("^I select It was a Good Price$")
    public void iSelectItWasAGoodPrice() {
        new RatingPage().clickOnItWasGoodPriceOption();
    }


    @And("^I click on Skip button after menu option$")
    public void iClickOnSkipButtonAfterMenuOption() throws InterruptedException {
        new RatingPage().clickOnSkipButtonAfterMenuOption();
    }

    @And("^I click on Next Button After Menu options$")
    public void iClickOnNextButtonAfterMenuOptions() throws InterruptedException {
        new RatingPage().clickOnNextButtonAfterMenuOption();
    }

    @Then("^I can see \"([^\"]*)\" message$")
    public void iCanSeeMessage(String text)  {
        Assert.assertEquals(text,new RatingPage().verifyThankyouText());

    }

    @And("^I click and scratch on Scratch card$")
    public void iClickAndScratchOnScratchCard() {
        new RatingPage().clickOnScratchCard();
    }

    @When("^I click on No Thanks Button$")
    public void iClickOnNoThanksButton() {
        new RatingPage().clickOnNoThanksButton();
    }

    @Then("^I can see \"([^\"]*)\" Text is displayed$")
    public void iCanSeeTextIsDisplayed(String text)  {
        Assert.assertEquals(text,new RatingPage().verifyFedBackSummaryText());

    }

    @And("^I click on Upload Photo icon$")
    public void iClickOnUploadPhotoIcon() {
        new RatingPage().clickOnUploadPhotoIcon();
    }

    @And("^I click on Upload Photo block$")
    public void iClickOnUploadPhotoBlock() throws InterruptedException {
        new RatingPage().clickOnUploadPhoto();
    }

//    @And("^I enter answer for given questions$")
//    public void iEnterAnswerForGivenQuestions() {
//        new RatingPage().selectQuestion();
//    }
}
