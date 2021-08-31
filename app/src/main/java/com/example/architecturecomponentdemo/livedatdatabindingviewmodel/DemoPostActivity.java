package com.example.architecturecomponentdemo.livedatdatabindingviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.architecturecomponentdemo.R;
import com.example.architecturecomponentdemo.databinding.ActivityDemoPostBinding;

public class DemoPostActivity extends AppCompatActivity {
    ActivityDemoPostBinding activityDemoPostBinding;
    DemoPostViewModel demoPostViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDemoPostBinding= DataBindingUtil.setContentView(this,R.layout.activity_demo_post);
        demoPostViewModel= ViewModelProviders.of(this).get(DemoPostViewModel.class);

        activityDemoPostBinding.tvValue.setText(demoPostViewModel.quote_data.toString());


        demoPostViewModel.quote_data.observe(this,s -> {
            activityDemoPostBinding.tvValue.setText(s);
        });

        activityDemoPostBinding.btnUpdate.setOnClickListener(v -> {
            demoPostViewModel.updateData();
        });
    }
}