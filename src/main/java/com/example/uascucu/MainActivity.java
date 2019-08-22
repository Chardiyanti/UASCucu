package com.example.uascucu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //private Button btn_produk_halal;
    //private Button btn_jadwal_sholat;
    //private Button btn_doa_harian;

    private TextView produkHalal, jadwalSholat, doaHarian;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // btn_produk_halal = (Button)findViewById(R.id.btn_produk_halal );
       // btn_jadwal_sholat = (Button)findViewById(R.id.btn_jadwal_sholat);
       // btn_doa_harian = (Button)findViewById(R.id.btn_doa_harian);

        produkHalal = (TextView)findViewById(R.id.produkHalal);
        jadwalSholat = (TextView)findViewById(R.id.jadwalSholat);
        doaHarian = (TextView)findViewById(R.id.doaHarian);

        //btn_produk_halal.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent intent = new Intent(MainActivity.this, mainHalal.class);
        //startActivity(intent);
        //}
        //});

        //btn_jadwal_sholat.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent intent = new Intent(MainActivity.this, mainSholat.class);
        //startActivity(intent);
        //}
        //});

        //btn_doa_harian.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent intent = new Intent(MainActivity.this, mainDoa.class);
        //startActivity(intent);
        //}
        //});

        produkHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainHalal.class);
                startActivity(intent);
            }
        });

        jadwalSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainSholat.class);
                startActivity(intent);
            }
        });

        doaHarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainDoa.class);
                startActivity(intent);
            }
        });

    }
}

