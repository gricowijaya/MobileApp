package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import id.gricowijaya.latihan3.R;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
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