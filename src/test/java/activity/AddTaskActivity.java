package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

public class AddTaskActivity {
    public Button selectTasks;
    public Button createTask;
    public TextBox titleTask;
    public TextBox contentTask;
    public Button guardarTask;
    public TextBox verifyTitleTask;
    public AddTaskActivity(){

        selectTasks = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.TextView[1]"));
        createTask = new Button(By.id("com.appgenix.bizcal:id/main_create"));

        titleTask= new TextBox(By.id("com.appgenix.bizcal:id/editevent_event_title"));
        contentTask= new TextBox(By.id("com.appgenix.bizcal:id/editevent_event_description"));

        guardarTask= new Button(By.id("com.appgenix.bizcal:id/actionbar_done"));
    }
    public boolean verifyTask(String primero){
       // verifyTitleTask = new TextBox();

        return true;
    }



}
