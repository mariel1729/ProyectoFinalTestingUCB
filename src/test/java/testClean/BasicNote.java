package testClean;

import activity.AddTaskActivity;
import activity.AlertsActivity;
import activity.MainActivity;
import activity.SelectDayActivity;
import appiumControl.Button;
import appiumControl.TextBox;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class BasicNote {

    AlertsActivity alertsActivity = new AlertsActivity();

    MainActivity mainActivity = new MainActivity();
    AddTaskActivity addTaskActivity = new AddTaskActivity();
    SelectDayActivity selectDayActivity = new SelectDayActivity();


    @Test
    public void verifyAddNote() throws MalformedURLException {
        alertsActivity.firstAlertButton.click();
        alertsActivity.secondAlertButton.click();
        alertsActivity.startAppButton.click();

        //****caso de prueba: PONER DIA DE INICIO DE SEMANA LUNES
        mainActivity.optionListButton.click();
        selectDayActivity.confButton.click();
        selectDayActivity.timeButton.click();
        selectDayActivity.weekStartButton.click();
        selectDayActivity.StartMondayButton.click();
        selectDayActivity.okButton.click();
        selectDayActivity.returnButton.click();
        selectDayActivity.returnButton.click();
        selectDayActivity.returnMainButton.click();

        Assert.assertEquals("LUN.",  mainActivity.verifyDay.getText());

    }


    @Test
    public void addTask() throws MalformedURLException {
      /*  alertsActivity.firstAlertButton.click();
        alertsActivity.secondAlertButton.click();
        alertsActivity.startAppButton.click();

        String title="primero123";
        mainActivity.optionListButton.click();
        addTaskActivity.selectTasks.click();
       addTaskActivity.createTask.click();
       addTaskActivity.titleTask.type(title);
      // addTaskActivity.scroll();
      // addTaskActivity.contentTask.type("canten1");
       addTaskActivity.guardarTask.click();

        addTaskActivity.createTask.click();
        addTaskActivity.titleTask.type("title");
        addTaskActivity.guardarTask.click();
        boolean result = addTaskActivity.titleTask.isDisplayable();
        Assert.assertTrue("no es igual"+result,result);*/
    }
}
