package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_auto_complete.*

class AutoCompleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)


        val androidName = mutableListOf<String>().apply {
            add("Cupcake")
            add("Cuka")
            add("Donut")
            add("Domba")
            add("Eclair")
            add("Edi")
            add("Froyo")
            add("Fanta")
            add("Ginger bread")
            add("Gula")
            add("Honey comb")
            add("Harimau")
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, androidName)
        autoComplete.setAdapter(adapter)
    }
}