package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.Normalizer;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.model.RegistrationActivityModel;

public class RegistrationFormActivity extends AppCompatActivity {

    EditText fullName;
    EditText NIM;
    EditText password;
    Spinner major;
    EditText hobby;
    EditText email;
    EditText address;
    EditText spinnerValue;
    CheckBox allowNotification;
    Button resetButton;
    Button sendButton;

    RegistrationActivityModel modelRegistration = new RegistrationActivityModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        fullName = (EditText) findViewById(R.id.fullName);
        NIM = (EditText) findViewById(R.id.NIM);
        password = (EditText) findViewById(R.id.password);
        major = (Spinner) findViewById(R.id.major);
        hobby = (EditText) findViewById(R.id.hobby);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        allowNotification = (CheckBox) findViewById(R.id.allowNotification);
        resetButton = (Button) findViewById(R.id.resetForm);
        sendButton = (Button) findViewById(R.id.sendForm);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelRegistration.sendToast(view, getApplicationContext(), fullName);
                Intent goToClock = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(goToClock, 1);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fullName.getText().clear();
                NIM.getText().clear();
                spinnerValue.getText().clear();
                password.getText().clear();
                hobby.getText().clear();
                email.getText().clear();
                address.getText().clear();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.register:
                Intent goToClock = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(goToClock, 1);
                return true;
            case R.id.login:
                // showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}