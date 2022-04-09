package id.gricowijaya.latihan3.model;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrationActivityModel {

    public void sendToast(View view, Context inputContext, EditText fullName) {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(inputContext, "Terima Kasih Telah Melakukan Input " + fullName.getText(), duration);
        toast.show();
    }
}