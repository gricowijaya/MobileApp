package id.gricowijaya.latihan3.model;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.UnicodeSetIterator;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.activity.LoginPageActivity;
import id.gricowijaya.latihan3.activity.RegistrationFormActivity;

public class LoginModel extends DialogFragment {


    public AlertDialog back(View view, Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

        builder.setMessage(R.string.backConfirmation)
                .setTitle(R.string.backTitle)
                    .setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent goToRegister = new Intent(context, RegistrationFormActivity.class);
                            startActivityForResult(goToRegister, 1);
                        }
                    })

                    .setNegativeButton(R.string.deny, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent goToLogin = new Intent(context, LoginPageActivity.class);
                            startActivityForResult(goToLogin, 1);
                        }
                    })
        .show(); // Agar Dapat berhasil memunculkan dialog tersebut


        AlertDialog dialog = builder.create();

        return dialog;
    }

    public void notification(Context context, EditText name) {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, name.getText(), duration);
        toast.show();
    }
}
