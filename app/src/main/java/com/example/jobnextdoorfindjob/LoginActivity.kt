package com.example.jobnextdoorfindjob

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import android.os.Bundle
import com.google.android.gms.auth.api.signin.GoogleSignIn
import android.content.Intent
import android.view.View
import com.google.android.gms.common.api.ApiException

class LoginActivity : AppCompatActivity() {
    var gso: GoogleSignInOptions? = null
    var gcs: GoogleSignInClient? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        gcs = GoogleSignIn.getClient(this, gso!!)
    }

    fun googlesignin(view: View?) {
 /*       val signInIntent = gcs!!.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)*/
        navigatetoNextActivity()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                task.getResult(ApiException::class.java)
                navigatetoNextActivity()
            } catch (e: ApiException) {
                //showToast("Something Want Wrong");
            }
        }
    }

    private fun navigatetoNextActivity() {
        val intent = Intent(this@LoginActivity, DashBoard::class.java)
        startActivity(intent)
    }

    companion object {
        private const val RC_SIGN_IN = 1000
    }
}