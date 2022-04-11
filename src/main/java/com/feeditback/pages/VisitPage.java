package com.feeditback.pages;

import com.feeditback.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitPage extends Utility{



    public VisitPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Not got a code?')]")
    WebElement clickOnLink;


    @CacheLookup
    ////img[@alt='Food And Drink Branch']
    @FindBy(xpath = "//h3[@class='find-venue__name']\n")
    WebElement clickOnLocation;


    @CacheLookup
    @FindBy(xpath = "//div[@aria-label='Yesterday']//div[@class='q-radio__label q-anchor--skip']")
    WebElement clickOnYesterday;


    @CacheLookup
    @FindBy(xpath = "(//div[@class='q-field__native row items-center'])[1]\n")
    WebElement clickOnHour;


    @CacheLookup
    @FindBy(xpath = "(//div[@class='q-item__label'])[10]")
    WebElement selectHour;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='q-field__native row items-center'])[2]")
    WebElement clicktMin;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/label[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selMin;


    @CacheLookup
    @FindBy(xpath = "(//div[@class='q-field__control relative-position row no-wrap'])[3]")
    WebElement clickOnAMPm;


    @CacheLookup
    @FindBy(css = "body.desktop.no-touch.body--light:nth-child(2) div.q-menu.q-position-engine.scroll:nth-child(6) div.q-virtual-scroll__content:nth-child(2) div.q-item.q-item-type.row.no-wrap.q-item--clickable.q-link.cursor-pointer.q-manual-focusable.q-manual-focusable--focused.q-item--active:nth-child(2) div.q-item__section.column.q-item__section--main.justify-center > div.q-item__label")
    WebElement selectAmPm;


    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[2]/span[1]")
    WebElement clickOnStart;


    public void clickOnNotGoodCode() {
        clickOnElement(clickOnLink);
    }


    public void clickOnLocation() {
        clickOnElement(clickOnLocation);

    }

    public void setClickOnYesterday() {
        clickOnElement(clickOnYesterday);

    }

    public void setClickOnHour() {
        clickOnElement(clickOnHour);
        clickOnElement(selectHour);
        clickOnElement(clicktMin);
        clickOnElement(selMin);
        clickOnElement(clickOnAMPm);


    }

    // stale element error clickOnElement(selectAmPm);
    public void setSelectAmPm() {
        driver.navigate().refresh();
        driver.findElement(By.cssSelector("body.desktop.no-touch.body--light:nth-child(2) div.q-menu.q-position-engine.scroll:nth-child(6) div.q-virtual-scroll__content:nth-child(2) div.q-item.q-item-type.row.no-wrap.q-item--clickable.q-link.cursor-pointer.q-manual-focusable.q-manual-focusable--focused.q-item--active:nth-child(2) div.q-item__section.column.q-item__section--main.justify-center > div.q-item__label"));
        clickOnElement(selectAmPm);
    }

    public void setClickOnStart() {
        clickOnElement(clickOnStart);
    }

}
