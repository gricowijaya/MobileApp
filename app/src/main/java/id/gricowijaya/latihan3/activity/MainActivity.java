package id.gricowijaya.latihan3.activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.model.CameraModel;
import id.gricowijaya.latihan3.model.CountModel;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button AddButton;
    public Button MinButton;
    public Button ResetButton;
    public Button KirimButton;
    public EditText JudulAktivitas;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButton = (Button) findViewById(R.id.button_tambah);
        MinButton = (Button) findViewById(R.id.button_kurang);
        ResetButton = (Button) findViewById(R.id.button_reset);
        JudulAktivitas = (EditText) findViewById(R.id.judul_aktivitas);
        KirimButton = (Button) findViewById(R.id.kirim_button);

        final CountModel counting = new CountModel();
        final CameraModel camera = new CameraModel();

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counting.addition();
                printResult(counting.getNumber());
            }
        });

        MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counting.subtraction();
                printResult(counting.getNumber());
            }
        });

        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counting.reset();
                printResult(counting.getNumber());
            }
        });

        KirimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(camera.ambilGambar(result, JudulAktivitas, getApplicationContext()));
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
                Intent goToClock = new Intent(getApplicationContext(), RegistrationFormActivity.class);
                startActivityForResult(goToClock, 1);
                return true;
            case R.id.login:
                // showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void printResult(int _result){
        result = (TextView) findViewById(R.id.angka);
        result.setText(Integer.toString(_result));
    }
}