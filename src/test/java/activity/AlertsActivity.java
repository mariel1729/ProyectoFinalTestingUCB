package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class AlertsActivity {
    public Button firstAlertButton;
    public Button secondAlertButton;
    public Button thirdAlertButton;
    public Button forthlertButton;
    public AlertsActivity(){
        //accion
        firstAlertButton = new Button(By.id("buttonOK"));

        secondAlertButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
        thirdAlertButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
      forthlertButton = new Button(By.id("android:id/button1"));

        //startAppButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]"));


    }
}
