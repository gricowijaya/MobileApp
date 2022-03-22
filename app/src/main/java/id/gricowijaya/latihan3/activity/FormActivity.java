package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import id.gricowijaya.latihan3.R;
import id.gricowijaya.latihan3.model.MenuMakanan;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button simpanButton = (Button) findViewById(R.id.simpan_button);
        EditText namaMenu = (EditText) findViewById(R.id.input_nama_menu);
        EditText hargaMenu = (EditText) findViewById(R.id.input_harga_menu);

        MenuMakanan menu = new MenuMakanan();
        LinearLayout layout = (LinearLayout) findViewById(R.id.hasil_simpan_menu);
        int background = ContextCompat.getColor(getBaseContext(), R.color.xanandu);

        simpanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.createButton(getApplicationContext(), namaMenu, hargaMenu, layout, background);
            }
        });
    }
}
