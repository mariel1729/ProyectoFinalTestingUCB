package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class AlertsActivity {
    public Button firstAlertButton;
    public Button secondAlertButton;
    public Button startAppButton;
    public AlertsActivity(){
        //accion
        firstAlertButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));

        secondAlertButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
        startAppButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]"));


    }
}
