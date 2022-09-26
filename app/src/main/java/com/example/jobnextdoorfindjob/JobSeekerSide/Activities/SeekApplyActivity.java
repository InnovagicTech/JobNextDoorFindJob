package com.example.jobnextdoorfindjob.JobSeekerSide.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jobnextdoorfindjob.R;
import com.example.jobnextdoorfindjob.databinding.ActivitySeekApplyBinding;

public class SeekApplyActivity extends AppCompatActivity {

    ActivitySeekApplyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_seek_apply);

    }
}