package activity;

import appiumControl.Button;
import org.openqa.selenium.By;
import appiumControl.Label;

import java.net.MalformedURLException;


public class MainActivity {
    public Button optionListButton;
    public Button addEventButton;
    public Label verifyDay;
    public MainActivity() {

        optionListButton = new Button(By.className("android.widget.ImageButton"));
        addEventButton = new Button(By.id("com.appgenix.bizcal:id/main_create"));
        verifyDay = new Label(By.xpath("  /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
    }
}
