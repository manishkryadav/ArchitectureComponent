package com.example.architecturecomponentdemo.livedatdatabindingviewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

public class DemoPostViewModel extends AndroidViewModel {
    MutableLiveData<String> quote_data= new MutableLiveData<>("Initial value");

    public DemoPostViewModel(@NonNull @NotNull Application application) {
        super(application);
    }

    public void updateData(){
        quote_data.postValue("updated value");
    }


}
