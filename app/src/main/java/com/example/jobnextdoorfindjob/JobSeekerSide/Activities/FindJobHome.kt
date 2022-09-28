package com.example.jobnextdoorfindjob.JobSeekerSide.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.jobnextdoorfindjob.R
import kotlinx.android.synthetic.main.activity_find_job_home.*

class FindJobHome : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)
        drawerLayout = findViewById(R.id.my_drawer_layout)
         drawerJob.setOnClickListener(View.OnClickListener {

             actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

             drawerLayout.addDrawerListener(actionBarDrawerToggle)
             actionBarDrawerToggle.syncState()
             drawerLayout.open()
         })
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

}