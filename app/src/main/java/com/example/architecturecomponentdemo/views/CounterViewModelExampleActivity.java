package com.example.architecturecomponentdemo.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import com.example.architecturecomponentdemo.R;
import com.example.architecturecomponentdemo.databinding.ActivityCounterViewModelExampleBinding;
import com.example.architecturecomponentdemo.livedatdatabindingviewmodel.DemoPostActivity;
import com.example.architecturecomponentdemo.viewmodels.CounterViewModel;

public class CounterViewModelExampleActivity extends AppCompatActivity {
    CounterViewModel counterViewModel;
   ActivityCounterViewModelExampleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         binding = DataBindingUtil.setContentView(this, R.layout.activity_counter_view_model_example);
         counterViewModel= ViewModelProviders.of(this).get(CounterViewModel.class);



      binding.btnNext.setOnClickListener(v -> {
         counterViewModel.inreaseCounterValue();
         setText();
       });

      setText();

      binding.btnPost.setOnClickListener(v -> {
          startActivity(new Intent(this, DemoPostActivity.class));
      });


    }

    private void setText() {
        binding.tvData.setText(""+counterViewModel.count);
    }
}