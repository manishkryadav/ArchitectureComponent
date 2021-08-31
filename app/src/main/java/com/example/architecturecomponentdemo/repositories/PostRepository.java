package com.example.architecturecomponentdemo.repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.architecturecomponentdemo.api.Apis;

import com.example.architecturecomponentdemo.api.ConfigreBody;
import com.example.architecturecomponentdemo.api.RetrofitClient;
import com.example.architecturecomponentdemo.model.ConfigurationModel;
import com.example.architecturecomponentdemo.model.Post;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostRepository {
    private RetrofitClient configurationapi;
    private MutableLiveData<ConfigurationModel> configurationResponseLiveData;


    public PostRepository() {
        configurationResponseLiveData = new MutableLiveData<>();
        configurationapi= RetrofitClient.getInstance();
    }



    public void getConfiguration(String app_type, String app_version) {
//        new ConfigreBody(app_type,app_version);

        configurationapi.getApi().savePost("title", "body jh jj ihh;;j yf", 1).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Log.i("**",""+response.body());
                if (response.body() != null) {
//                          configurationResponseLiveData.postValue(response.body());
                       }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {

            }
        });

//        Log.i("***",""+ configurationapi.getApi().getConfiguartion(app_type,app_version).request().url());

//        configurationapi.getApi().getConfiguartion(app_type,app_version)
//                .enqueue(new Callback<List<ConfigurationModel>>() {
////                    @Override
////                    public void onResponse(Call<List<ConfigurationModel>> call, Response<ConfigurationModel> response) {
////                        Log.i("**",""+response.body());
////                        if (response.body() != null) {
////                            configurationResponseLiveData.postValue(response.body());
////                        }
////                    }
//
//                    @Override
//                    public void onResponse(Call<List<ConfigurationModel>> call, Response<List<ConfigurationModel>> response) {
//                        Log.i("**","aa=> "+response.body());
//                        if (response.body() != null) {
////                            configurationResponseLiveData.postValue(response.body().);
//                        }
//                    }

//                    @Override
//                    public void onFailure(Call<List<ConfigurationModel>> call, Throwable t) {
//                        Log.i("**","error=> "+t.getMessage());
//                        configurationResponseLiveData.postValue(null);
//                    }
//                });
    }


    public LiveData<ConfigurationModel> getVolumesResponseLiveData() {
        return configurationResponseLiveData;
    }
}
