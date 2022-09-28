package com.example.jobnextdoorfindjob.JobSeekerSide.Activities

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import com.example.jobnextdoorfindjob.R
import android.net.ConnectivityManager

abstract class BaseActivity : Activity() {
    var mContext: Context? = null
    var progressDialog: ProgressDialog? = null
    fun showToast(msg: String?) {
        //  Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    fun startIntent(intent: Intent?) {
        startActivity(intent)
    }

//    fun showProgress() {
//        progressDialog = ProgressDialog.show(this, null, null, true)
//        progressDialog.setContentView(R.layout.layout_progress_bar)
//        progressDialog.getWindow()!!.setBackgroundDrawableResource(android.R.color.transparent)
//        progressDialog.setCancelable(false)
//    }

    fun dismissProgress() {
        progressDialog!!.dismiss()
    }

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo != null && connectivityManager.activeNetworkInfo!!
            .isConnected
    }
}