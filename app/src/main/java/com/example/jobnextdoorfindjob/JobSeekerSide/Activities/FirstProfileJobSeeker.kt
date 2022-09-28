package com.example.jobnextdoorfindjob.JobSeekerSide.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jobnextdoorfindjob.R
import kotlinx.android.synthetic.main.activity_findjobfirst_profile.*

class FirstProfileJobSeeker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findjobfirst_profile)
        forwadCardIntrest.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@FirstProfileJobSeeker,FindJobIntrestSkill::class.java)
            startActivity(intent)
        })
    }
}