package id.gricowijaya.latihan3.model;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import id.gricowijaya.latihan3.R;

public class MenuMakanan {
    public void createButton(Context input, EditText namaMenu, EditText hargaMenu, LinearLayout layout, int color) {
        Button tombolMenuMakanan = new Button(input);
        tombolMenuMakanan.setText(namaMenu.getText() + "\n Rp. " + hargaMenu.getText());
        tombolMenuMakanan.setBackgroundColor(color);
        layout.addView(tombolMenuMakanan);
    }
}