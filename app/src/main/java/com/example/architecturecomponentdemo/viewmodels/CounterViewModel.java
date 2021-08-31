package com.example.architecturecomponentdemo.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

public class CounterViewModel extends AndroidViewModel {
    public int count=0;

    public CounterViewModel(@NonNull @NotNull Application application) {
        super(application);
    }

    public int inreaseCounterValue(){
       return count++;
    }

}
