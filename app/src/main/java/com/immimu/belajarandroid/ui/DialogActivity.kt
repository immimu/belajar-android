package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        confirmButton.setOnClickListener { showConfirmDialog() }
    }

    private fun showConfirmDialog() {
        MaterialDialog(this).show {
            title(text = getString(R.string.title_delete_confirm))
            message(text = getString(R.string.message_delete_confirmation))
            positiveButton(text = getString(R.string.button_yes)) {
                Log.i(TAG, "item is being deleted")
            }

            negativeButton(text = getString(R.string.button_cancel)) {
                Log.i(TAG, "delete canceled")
            }
        }
    }
}