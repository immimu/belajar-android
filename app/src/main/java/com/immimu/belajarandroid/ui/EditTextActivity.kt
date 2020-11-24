package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        loginButton.setOnClickListener {
            val valueEmail = emailEditText.text.toString()
            val valuePassword = passwordEditText.text.toString()

            Log.i(TAG, "Email : $valueEmail")
            Log.i(TAG, "Password : $valuePassword")
        }
    }

    companion object {
        private const val TAG = "Belajar Android "
    }
}