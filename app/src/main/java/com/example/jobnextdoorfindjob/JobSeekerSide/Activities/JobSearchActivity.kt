package com.example.jobnextdoorfindjob.JobSeekerSide.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.example.jobnextdoorfindjob.R
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_job_search.*


class JobSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_search)
        seekRecycler.layoutManager = LinearLayoutManager(this)


        //For search Job
        searchJob.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })

/*        //For Search Location
     searchLocation.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
    }*/
    }
}