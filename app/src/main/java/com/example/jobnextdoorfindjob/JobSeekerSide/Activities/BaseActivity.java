package com.example.jobnextdoorfindjob.JobSeekerSide.Activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

import com.example.jobnextdoorfindjob.R;

public abstract class BaseActivity extends Activity {
    Context mContext;
    ProgressDialog progressDialog;


    public void showToast(String msg) {
      //  Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();

    }

    public void startIntent(Intent intent) {
        startActivity(intent);

    }

    public void showProgress() {
        progressDialog = ProgressDialog.show(this, null, null, true);
        progressDialog.setContentView(R.layout.layout_progress_bar);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        progressDialog.setCancelable(false);
    }

    public void dismissProgress() {
        progressDialog.dismiss();
    }

    public boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }


}
