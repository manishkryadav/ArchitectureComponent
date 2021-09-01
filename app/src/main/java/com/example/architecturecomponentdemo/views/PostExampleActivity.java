package com.example.architecturecomponentdemo.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import com.example.architecturecomponentdemo.R;
import com.example.architecturecomponentdemo.model.VolumesResponse;
import com.example.architecturecomponentdemo.viewmodels.PostViewModel;

public class PostExampleActivity extends AppCompatActivity {
    PostViewModel postViewModel;
    TextView tv_apidata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_example);

        tv_apidata=findViewById(R.id.tv_apidata);
        postViewModel= ViewModelProviders.of(this).get(PostViewModel.class);


        postViewModel.init();
        postViewModel.getConfigurationResponseLiveData().observe(this,configurationModel -> {
            if (configurationModel != null) {
                tv_apidata.setText(configurationModel);
            }
        });


        findViewById(R.id.btn_api).setOnClickListener(v -> {
            postViewModel.getPostData();
        });
    }
}