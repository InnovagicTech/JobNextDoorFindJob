package com.example.jobnextdoorfindjob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.jobnextdoorfindjob.JobSeekerSide.Activities.DashBoard;
import com.example.jobnextdoorfindjob.JobSeekerSide.Activities.SecondActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class LoginActivity extends AppCompatActivity {
    private static final int RC_SIGN_IN = 1000;
    GoogleSignInOptions gso;
    GoogleSignInClient gcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        gcs = GoogleSignIn.getClient(this, gso);



    }

    public void googlesignin(View view) {
        Intent signInIntent = gcs.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                navigatetoNextActivity();
            } catch (ApiException e) {
                //showToast("Something Want Wrong");
            }
        }
    }

    private void navigatetoNextActivity() {

        Intent intent=new Intent(LoginActivity.this, DashBoard.class);
        startActivity(intent);

    }
}
