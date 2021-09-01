package com.example.architecturecomponentdemo.repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.architecturecomponentdemo.api.RetrofitClient;
import com.example.architecturecomponentdemo.model.Post;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostRepository {
    private RetrofitClient retrofitClient;
    private MutableLiveData<String> configurationResponseLiveData;


    public PostRepository() {
        configurationResponseLiveData = new MutableLiveData<>();
        retrofitClient= RetrofitClient.getInstance();
    }



    public void getConfiguration() {

        retrofitClient.getApi().savePost("title", "body jh jj ihh;;j yf", 1).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Log.i("**",""+response.body());
                if (response.body() != null) {
                          configurationResponseLiveData.postValue(response.body().getBody());
                       }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {

            }
        });

    }


    public LiveData<String> getVolumesResponseLiveData() {
        return configurationResponseLiveData;
    }
}
