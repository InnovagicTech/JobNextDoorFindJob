package com.example.jobnextdoorfindjob.JobSeekerSide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.jobnextdoorfindjob.R;
import com.example.jobnextdoorfindjob.databinding.ActivityEmployerPostApplyBinding;

public class EmployerPostApply extends AppCompatActivity {

 ActivityEmployerPostApplyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_employer_post_apply);
    }
}