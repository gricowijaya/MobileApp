package id.gricowijaya.latihan3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.gricowijaya.latihan3.R;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_AKTIFITAS = "extra_aktifitas";
    public static final String EXTRA_COUNTER = "extra_counter";
    private ImageView HasilGambar;
    static final int kodeKamera = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        TextView JudulAktivitas = findViewById(R.id.data1);
        TextView HasilCounter = findViewById(R.id.data2);
        HasilGambar = findViewById(R.id.gambar);

        Button kamera = findViewById(R.id.kamera);
        kamera.setOnClickListener(this);

        String aktifitas = getIntent().getStringExtra(EXTRA_AKTIFITAS);
        String counter = getIntent().getStringExtra(EXTRA_COUNTER);

        JudulAktivitas.setText(aktifitas);
        HasilCounter.setText(counter);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.kamera){
            Intent ambilGambar = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(ambilGambar, kodeKamera);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == kodeKamera && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap bitmap = (Bitmap) extras.get("data");
            HasilGambar.setImageBitmap(bitmap);
        }
    }
}