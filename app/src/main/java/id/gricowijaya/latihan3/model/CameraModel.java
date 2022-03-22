package id.gricowijaya.latihan3.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.EditText;
import android.widget.TextView;

import id.gricowijaya.latihan3.activity.CameraActivity;
import id.gricowijaya.latihan3.activity.MainActivity;

public class CameraModel {
    static final int REQUEST_IMAGE_CAPTURE = 1;

    public Intent ambilGambar(TextView angka, EditText inputText, Context inputContext) {
         String nilai = angka.getText().toString();
         String aktifitas = inputText.getText().toString();
         Intent passData = new Intent( inputContext, CameraActivity.class);
         passData.putExtra(CameraActivity.EXTRA_AKTIFITAS, aktifitas);
         passData.putExtra(CameraActivity.EXTRA_COUNTER, angka.getText().toString());
         return passData;
    }
}