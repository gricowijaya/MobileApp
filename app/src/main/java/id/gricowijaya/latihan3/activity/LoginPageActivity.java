package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.model.LoginModel;

public class LoginPageActivity extends AppCompatActivity {

    Button loginButton;
    Button backButton;
    EditText loginName;
    LoginModel loginModel = new LoginModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.buttonLogin);
        backButton = (Button) findViewById(R.id.buttonBack);
        loginName = (EditText) findViewById(R.id.loginInput);
        super.onCreate(savedInstanceState);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginModel.notification(getApplicationContext(), loginName);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginModel.back(view, getApplicationContext());
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
                Intent goToRegister = new Intent(getApplicationContext(), RegistrationFormActivity.class);
                startActivityForResult(goToRegister, 1);
                return true;
            case R.id.login:
                Intent goToLogin = new Intent(getApplicationContext(), LoginPageActivity.class);
                startActivityForResult(goToLogin, 1);
                return true;
            case R.id.about_us:
                Intent goToAboutUs = new Intent(getApplicationContext(), AboutUsActivity.class);
                startActivityForResult(goToAboutUs, 1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}