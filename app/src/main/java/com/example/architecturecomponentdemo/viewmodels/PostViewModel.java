package com.example.architecturecomponentdemo.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.architecturecomponentdemo.repositories.PostRepository;

public class PostViewModel extends ViewModel {
    public LiveData<String> configurationModelMutableLiveData;
    PostRepository postRepository;

    public void init() {
        postRepository = new PostRepository();
        configurationModelMutableLiveData = postRepository.getVolumesResponseLiveData();
    }

    public void getPostData(){

        postRepository.getConfiguration();

    };


    public LiveData<String> getConfigurationResponseLiveData() {
        return configurationModelMutableLiveData;
    }


}
