package com.msg.pages;

import org.openqa.selenium.support.PageFactory;

import com.msg.utilities.Driver;

public abstract class  BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
