package com.example.jobnextdoorfindjob.JobSeekerSide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobnextdoorfindjob.R;
import com.example.jobnextdoorfindjob.databinding.JobSeekDesignBinding;

public class JobSeekAdapter extends RecyclerView.Adapter<JobSeekAdapter.ViewHolder> {
    Context mContext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.job_seek_design, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        JobSeekDesignBinding binding;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            binding = JobSeekDesignBinding.bind(itemView);
        }
    }
}
