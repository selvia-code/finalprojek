package com.belajarandroid.contohcardview;



import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;


public interface ModulAPI {

    @GET("/promodel/ambildatamodel.php")
    public void apiambildatamodel(
            Callback<CDataModel> callback);



}