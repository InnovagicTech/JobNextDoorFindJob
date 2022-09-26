package com.example.jobnextdoorfindjob.JobSeekerSide.Activities;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.jobnextdoorfindjob.R;
import com.example.jobnextdoorfindjob.databinding.ActivityJobSeekerBinding;

public class JobSeekerActivity extends BaseActivity {

    ActivityJobSeekerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_job_seeker);


        binding.seekRecycler.setLayoutManager(new LinearLayoutManager(this));


        //For search Job
        binding.searchJob.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        //For Search Location
        binding.searchLocation.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }
}