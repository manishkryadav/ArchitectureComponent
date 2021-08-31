package com.example.architecturecomponentdemo.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.architecturecomponentdemo.model.ConfigurationModel;
import com.example.architecturecomponentdemo.model.VolumesResponse;
import com.example.architecturecomponentdemo.repositories.BookRepository;
import com.example.architecturecomponentdemo.repositories.PostRepository;

import org.jetbrains.annotations.NotNull;

public class PostViewModel extends ViewModel {
    public LiveData<ConfigurationModel> configurationModelMutableLiveData;
    PostRepository postRepository;

    public void init() {
        postRepository = new PostRepository();
        configurationModelMutableLiveData = postRepository.getVolumesResponseLiveData();
    }

    public void getPostData(String apptype,String appversion){

        postRepository.getConfiguration(apptype,appversion);

    };


    public LiveData<ConfigurationModel> getConfigurationResponseLiveData() {
        return configurationModelMutableLiveData;
    }


}
