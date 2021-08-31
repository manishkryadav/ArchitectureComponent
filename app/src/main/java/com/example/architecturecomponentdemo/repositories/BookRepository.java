package com.example.architecturecomponentdemo.repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.architecturecomponentdemo.api.Apis;
import com.example.architecturecomponentdemo.model.VolumesResponse;

import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

import androidx.lifecycle.LiveData;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookRepository {
    private static final String BOOK_SEARCH_SERVICE_BASE_URL = "https://www.googleapis.com/";

    private Apis bookSearchService;
    private MutableLiveData<VolumesResponse> volumesResponseLiveData;

    public BookRepository() {
        volumesResponseLiveData = new MutableLiveData<>();

//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.level(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        bookSearchService = new retrofit2.Retrofit.Builder()
                .baseUrl(BOOK_SEARCH_SERVICE_BASE_URL)
//                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Apis.class);

    }

    public void searchVolumes(String keyword, String author) {
        bookSearchService.searchVolumes(keyword, author)
                .enqueue(new Callback<VolumesResponse>() {
                    @Override
                    public void onResponse(Call<VolumesResponse> call, Response<VolumesResponse> response) {
                        if (response.body() != null) {
                            volumesResponseLiveData.postValue(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<VolumesResponse> call, Throwable t) {
                        volumesResponseLiveData.postValue(null);
                    }
                });
    }


    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}
