package com.example.uascucu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;
import android.support.v7.widget.SearchView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class mainHalal extends AppCompatActivity {
    private ListProdukAdapter mAdapter;
    private ArrayList<Produk> mListProduk;
    private SearchView searchView;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_halal);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        searchView = (SearchView)findViewById(R.id.search_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);

        mListProduk = new ArrayList<Produk>();
        mAdapter = new ListProdukAdapter(mListProduk);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, mLayoutManager.getOrientation()));
        recyclerView.setAdapter(mAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                loadData(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    private void loadData(String kw){
        Log.d("KW_DATA", kw);
        try {
            String url = "?menu=nama_produk&query=" +kw;
            ClientAsyncTask task = new ClientAsyncTask(this, url, new ClientAsyncTask.OnPostExecuteListener() {
                @Override
                public void onPostExecute(String result) {
                    Log.d("HalalData", result);
                    try {
                        JSONObject jsonObject = new JSONObject(result);
                        JSONArray jsonArray = jsonObject.getJSONArray("data");

                        mListProduk.clear();
                        for (int i=0; i<jsonArray.length(); i++){
                            JSONObject obj = jsonArray.getJSONObject(i);
                            Produk produk = new Produk();
                            produk.nama = obj.getString("nama_produk");
                            produk.no_sertifikat = obj.getString("nomor_sertifikat");
                            produk.produsen = obj.getString("nama_produsen");
                            produk.berlaku = obj.getString("berlaku_hingga");

                            mListProduk.add(produk);
                        }
                        mAdapter.notifyDataSetChanged();
                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }
            });
            task.setmProgress(this.progressBar);
            task.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}