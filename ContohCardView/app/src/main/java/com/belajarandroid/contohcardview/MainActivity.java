package com.belajarandroid.contohcardview;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
//    private static ArrayList<DataModel> data;
//    static View.OnClickListener myOnClickListener;
//    private static ArrayList<Integer> removedItems;

    List<DataModel> lstdatamodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        subambilhistory();

//        lstdatamodel = new ArrayList<DataModelLocal>();
//        for (int i = 0; i < 8; i++) {
//            lstdatamodel.add(new DataModelLocal(
//                    MyData.nameArray[i],
//                    MyData.versionArray[i],
//                    MyData.id_[i],
//                    MyData.drawableArray[i]
//            ));
//        adapter = new CustomAdapter(this, data);
//        recyclerView.setAdapter(adapter);
//
//        }


    }


    private void subambilhistory() {
        //Here we will handle the http request to insert user to mysql db
        //Creating a RestAdapter

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("https://www.kakitujuh.com/") //Setting the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        ModulAPI api = adapter.create(ModulAPI.class);


        //Calling method to get whether report
        api.apiambildatamodel(

                new Callback<CDataModel>()
                {
                    @Override
                    public void success(CDataModel cdatamodel, Response response) {
                        lstdatamodel = new ArrayList<DataModel>();
                        lstdatamodel = cdatamodel.getDataModell();

                        CustomAdapter  customadapter = new CustomAdapter(MainActivity.this, lstdatamodel);
                        recyclerView.setAdapter(customadapter);


                    }




                    @Override
                    public void failure(RetrofitError error) {

                        String merror = error.getMessage();

                        Toast.makeText(MainActivity.this,  " Terjadi Kesalahan Kooneksi Category " + merror, Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

}