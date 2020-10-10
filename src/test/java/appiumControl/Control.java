package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import ssessionManager.Session;

import java.net.MalformedURLException;

public class Control {

    protected WebElement control;
    //localizador que necesita el webelemnte
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    public void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);

    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return control.getText();
    }

    //parea verifcar si se ve contacto


}
