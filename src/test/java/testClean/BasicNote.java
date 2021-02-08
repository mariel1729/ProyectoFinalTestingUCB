package testClean;

import activity.AddTaskActivity;
import activity.AlertsActivity;
import activity.MainActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class BasicNote {

    AlertsActivity alertsActivity = new AlertsActivity();

    MainActivity mainActivity = new MainActivity();
    AddTaskActivity addTaskActivity = new AddTaskActivity();
   // SelectDayActivity selectDayActivity = new SelectDayActivity();


    @Test
    public void verifyAddNote() throws MalformedURLException {
        alertsActivity.firstAlertButton.click();
        alertsActivity.secondAlertButton.click();
        alertsActivity.thirdAlertButton.click();
        //Tomar en cuenta que debe estar habilitado el GPS, de otra manera habiltiar la siguiente linea
        // alertsActivity.forthlertButton.click();


        // ****caso de prueba: ingreso a la app
        mainActivity.registerNumber.type("73224549");
        mainActivity.registerPin1.type("7");
        mainActivity.registerPin2.type("7");
        mainActivity.registerPin3.type("6");
        mainActivity.registerPin4.type("1");
        mainActivity.registerClick.click();
        Assert.assertEquals("Saldo", mainActivity.verifyDay.getText());
    }

    @Test
    public void addTask() throws MalformedURLException {
        verifyAddNote();
        // ****caso de prueba: realizar transferencia

       addTaskActivity.selectTasks.click();
       addTaskActivity.selectTransfer.click();
       addTaskActivity.selectBanck.click();

       addTaskActivity.billNumber.type("1501697148");
       addTaskActivity.billName.type("GLAUCIA MARIEL ATAHUICHI");
       addTaskActivity.Continue.click();

        addTaskActivity.registerAmount.type("1");
        addTaskActivity.registerDescription.type("pp4");
        addTaskActivity.nextTask.click();
        addTaskActivity.confirmTask.click();
        addTaskActivity.viewVoucher.click();

        addTaskActivity.returnHome.click();

    Assert.assertEquals("2.00", addTaskActivity.verifyTitleTask.getText());

    }
}
