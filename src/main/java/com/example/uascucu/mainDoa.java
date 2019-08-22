package com.example.uascucu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainDoa extends AppCompatActivity {
    //private Button doaAnginRibut;
    //private Button doaAnjingMenggonggong;
    //private Button doaAyamBerkokok;
    //private Button doaBanguntidur;
    // private Button doaBukaPuasa;
    //private Button doaDalamPerjalanan;
    //private Button doaHalilintar;

    private TextView doaAnginRibut, doaAnjingMengonggong, doaAyamBerkokok,
            doaBangunTidur, doaBukaPuasa, doaDalamPerjalanan, doaHalilintar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        //doaAnginRibut = (Button)findViewById(R.id.btn_doa_angin_ribut);
        //doaAnjingMenggonggong = (Button)findViewById(R.id.btn_doa_anjing_mengonggong);
        //doaAyamBerkokok = (Button)findViewById(R.id.btn_doa_ayam_berkokok);
        //doaBanguntidur = (Button)findViewById(R.id.btn_doa_bangun_tidur);
        //doaBukaPuasa = (Button)findViewById(R.id.btn_doa_buka_puasa);
        //doaDalamPerjalanan = (Button)findViewById(R.id.btn_doa_dalam_perjalanan);
        //doaHalilintar = (Button)findViewById(R.id.btn_doa_halilintar);

        doaAnginRibut = (TextView)findViewById(R.id.doaAnginRibut);
        doaAnjingMengonggong = (TextView)findViewById(R.id.doaAnjingMengonggong);
        doaAyamBerkokok = (TextView)findViewById(R.id.doaAyamBerkokok);
        doaBangunTidur = (TextView)findViewById(R.id.doaBangunTidur);
        doaBukaPuasa= (TextView)findViewById(R.id.doaBukaPuasa);
        doaDalamPerjalanan= (TextView)findViewById(R.id.doaDalamPerjalanan);
        doaHalilintar= (TextView)findViewById(R.id.doaHalilintar);

        //doaAnginRibut.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAnginRibut.class);
        //startActivity(cucu);
        //}
        //});

        //doaAnjingMenggonggong.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAnjingMenggonggong.class);
        //startActivity(cucu);
        //}
        //});

        //doaAyamBerkokok.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAyamBerkokok.class);
        //startActivity(cucu);
        //}
        //});

        //doaBanguntidur.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaBangunTidur.class);
        //startActivity(cucu);
        //}
        //});

        //doaBukaPuasa.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaBukaPuasa.class);
        //startActivity(cucu);
        //}
        //});

        //doaDalamPerjalanan.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaDalamPerjalanan.class);
        //startActivity(cucu);
        //}
        //});

        //doaHalilintar.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaHalilintar.class);
        //startActivity(cucu);
        //}
        //});

        doaAnginRibut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaAnginRibut.class);
                startActivity(intent);
            }
        });

        doaAnjingMengonggong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaAnjingMenggonggong.class);
                startActivity(intent);
            }
        });

        doaAyamBerkokok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaAyamBerkokok.class);
                startActivity(intent);
            }
        });

        doaBangunTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaBangunTidur.class);
                startActivity(intent);
            }
        });

        doaBukaPuasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaBukaPuasa.class);
                startActivity(intent);
            }
        });

        doaDalamPerjalanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaDalamPerjalanan.class);
                startActivity(intent);
            }
        });

        doaHalilintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaHalilintar.class);
                startActivity(intent);
            }
        });

    }
}
