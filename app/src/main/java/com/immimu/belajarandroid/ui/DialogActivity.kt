package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        confirmButton.setOnClickListener { showConfirmDialog() }

        inputButton.setOnClickListener { showInputDialog() }

    }

    private fun showInputDialog() {
        MaterialDialog(this).show {
            input(hint = getString(R.string.hint_name)) { _, text ->
                bindText(text)
            }
            title(text = getString(R.string.title_input_your_name))
            positiveButton(text = getString(R.string.button_submit))

        }
    }

    private fun bindText(text: CharSequence) {
        nameTextView.text = text.toString()
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