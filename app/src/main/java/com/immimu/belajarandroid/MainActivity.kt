package com.immimu.belajarandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.immimu.belajarandroid.adapter.MenuAdapter
import com.immimu.belajarandroid.entity.MenuItem
import com.immimu.belajarandroid.listener.MenuListener
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
                getString(R.string.text_subtitle_textview)
            )
        )
        listMenu.add(
            MenuItem(
                3,
                getString(R.string.text_option_menu),
                getString(R.string.text_subtitle_textview)
            )
        )

        menuRecyclerView.apply {
            adapter = menuAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


        menuAdapter.notifyDataSetChanged()
    }

    override fun onMenuClicked(menuItem: MenuItem) {
        Toast.makeText(this, menuItem.title, Toast.LENGTH_SHORT).show()
    }
}