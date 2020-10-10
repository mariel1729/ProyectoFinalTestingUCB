package activity;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class SelectDayActivity {

    public Button confButton;
    public Button timeButton;
    public Button weekStartButton;
    public Button StartMondayButton;
    public Button okButton;
    public Button returnButton;
    public Button returnMainButton;
    public SelectDayActivity(){
        confButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.FrameLayout[6]"));
        timeButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        weekStartButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]"));
        StartMondayButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RadioButton"));
        okButton = new Button(By.id("com.appgenix.bizcal:id/dialog_positive_button"));
        returnButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Vuelve\"]"));
        returnMainButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[2]"));

    }

}
