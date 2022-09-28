package com.example.jobnextdoorfindjob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jobnextdoorfindjob.JobSeekerSide.Activities.FirstProfileJobSeeker
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)


        findJobCard.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@DashBoard, FirstProfileJobSeeker::class.java)
            startActivity(intent)
        })
    }
}