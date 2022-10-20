package com.example.kalkulatorbidang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editLebar, editPanjang;
    TextView txtBidang, txtPanjang, txtLebar, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    private void initComponent() {
        editLebar = findViewById(R.id.editLebar);
        editPanjang = findViewById(R.id.editPanjang);
        txtBidang = findViewById(R.id.txtBidang);
        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
    }

    public void hitungPersegiPanjang(View v) {
        float panjang = Float.parseFloat(editPanjang.getText().toString());
        float lebar = Float.parseFloat(editLebar.getText().toString());
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        txtBidang.setText("Nama Bidang : Persegi Panjang");
        txtPanjang.setText("Panjang : " + panjang);
        txtLebar.setText("Lebar : " + lebar);
        txtLuas.setText("Luas : " + luas);
        txtKeliling.setText("Keliling : " + keliling);
    }

    public void hitungSegitiga(View V) {
        float alas = Float.parseFloat(editPanjang.getText().toString());
        float tinggi = Float.parseFloat(editLebar.getText().toString());

        float a2 = (float) Math.pow(tinggi, 2);
        float b2 = (float) Math.pow(alas / 2, 2);
        float hipotenusa = (float) Math.sqrt(a2 + b2);

        double luas = (alas * tinggi) / 2;
        double keliling = alas + hipotenusa * 2;

        txtBidang.setText("Nama Bidang : Segitiga");
        txtPanjang.setText("Panjang : " + alas);
        txtLebar.setText("Lebar : " + tinggi);
        txtLuas.setText("Luas : " + luas);
        txtKeliling.setText("Keliling : " + keliling);
    }

    public void hitungLingkaran(View V) {
        float diameter = Float.parseFloat(editPanjang.getText().toString());
        float jari = diameter / 2;
        double luas = Math.PI * Math.pow(jari, 2);
        double keliling = 2 * Math.PI * jari;

        txtBidang.setText("Nama Bidang : Lingkaran");
        txtPanjang.setText("Diameter : " + diameter);
        txtLebar.setText("Jari-jari : " + jari);
        txtLuas.setText("Luas : " + luas);
        txtKeliling.setText("Keliling : " + keliling);
    }
}