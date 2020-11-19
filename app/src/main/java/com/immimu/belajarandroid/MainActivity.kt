package com.immimu.belajarandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.immimu.belajarandroid.adapter.MenuAdapter
import com.immimu.belajarandroid.entity.MenuItem
import com.immimu.belajarandroid.listener.MenuListener
import com.immimu.belajarandroid.ui.ButtonActivity
import com.immimu.belajarandroid.ui.TextViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MenuListener {

    private val listMenu = mutableListOf<MenuItem>()
    private val menuAdapter = MenuAdapter(listMenu, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listMenu.add(
            MenuItem(
                1,
                getString(R.string.text_textview),
                getString(R.string.text_subtitle_textview)
            )
        )
        listMenu.add(
            MenuItem(
                2,
                getString(R.string.text_button),
                getString(R.string.text_subtitle_button)
            )
        )
        listMenu.add(
            MenuItem(
                3,
                getString(R.string.text_option_menu),
                getString(R.string.text_subtitle_option_menu)
            )
        )

        menuRecyclerView.apply {
            adapter = menuAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


        menuAdapter.notifyDataSetChanged()
    }

    override fun onMenuClicked(menuItem: MenuItem) {
        val intent = when (menuItem.id) {
            1 -> Intent(this, TextViewActivity::class.java)
            2 -> Intent(this, ButtonActivity::class.java)
            else -> Intent(this, TextViewActivity::class.java)
        }
        startActivity(intent)
    }
}