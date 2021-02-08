package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;


public class MainActivity {
    public TextBox registerNumber;
    public TextBox registerPin1;
    public TextBox registerPin2;
    public TextBox registerPin3;
    public TextBox registerPin4;

    public Button registerClick;
    public Label verifyDay;

    public MainActivity() {
        registerNumber = new TextBox(By.id("com.bcp.bo.wallet:id/editTextPhoneNumber"));

        registerPin1 = new TextBox(By.id("com.bcp.bo.wallet:id/editTextPin1"));
        registerPin2 = new TextBox(By.id("com.bcp.bo.wallet:id/editTextPin2"));
        registerPin3 = new TextBox(By.id("com.bcp.bo.wallet:id/editTextPin3"));
        registerPin4 = new TextBox(By.id("com.bcp.bo.wallet:id/editTextPin4"));

        registerClick = new Button(By.id("com.bcp.bo.wallet:id/buttonLogin"));

        verifyDay = new Label(By.id("com.bcp.bo.wallet:id/textViewBalance"));
    }
}
