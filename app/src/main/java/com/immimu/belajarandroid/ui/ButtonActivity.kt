package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        button1.setOnClickListener { showToast("General Button clicked") }

        outlineButton.setOnClickListener { showToast("Outline Button clicked") }

        textButton.setOnClickListener { showToast("Text Button clicked") }

        iconButton.setOnClickListener { showToast("Icon Button clicked") }
    }

    private fun showToast(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}