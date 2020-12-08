package com.immimu.belajarandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.immimu.belajarandroid.adapter.MenuAdapter
import com.immimu.belajarandroid.entity.MenuItem
import com.immimu.belajarandroid.listener.MenuListener
import com.immimu.belajarandroid.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MenuListener {

    private val listMenu = mutableListOf<MenuItem>()
    private val menuAdapter = MenuAdapter(listMenu, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateMenu()


        menuRecyclerView.apply {
            adapter = menuAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


        menuAdapter.notifyDataSetChanged()
    }

    private fun generateMenu() {
        listMenu.apply {
            add(
                MenuItem(
                    MENU_ID_TEXTVIEW,
                    getString(R.string.text_textview),
                    getString(R.string.text_subtitle_textview)
                )
            )
            add(
                MenuItem(
                    MENU_ID_BUTTON,
                    getString(R.string.text_button),
                    getString(R.string.text_subtitle_button)
                )
            )
            add(
                MenuItem(
                    MENU_ID_MENU,
                    getString(R.string.text_option_menu),
                    getString(R.string.text_subtitle_option_menu)
                )
            )

            add(
                MenuItem(
                    MENU_ID_EDITTEXT,
                    getString(R.string.text_edittext_menu),
                    getString(R.string.text_subtitle_edittext_menu)
                )
            )
            add(
                MenuItem(
                    MENU_ID_DIALOG,
                    getString(R.string.text_dialog_menu),
                    getString(R.string.text_subtitle_dialog_menu)
                )
            )
            add(
                MenuItem(
                    MENU_ID_AUTO_COMPLETE_TEXTVIEW,
                    getString(R.string.text_autocomplete_menu),
                    getString(R.string.text_subtitle_autocomplete_menu)
                )
            )
        }

    }

    override fun onMenuClicked(menuItem: MenuItem) {
        val intent = when (menuItem.id) {
            MENU_ID_TEXTVIEW -> Intent(this, TextViewActivity::class.java)
            MENU_ID_BUTTON -> Intent(this, ButtonActivity::class.java)
            MENU_ID_MENU -> Intent(this, MenuActivity::class.java)
            MENU_ID_EDITTEXT -> Intent(this, EditTextActivity::class.java)
            MENU_ID_DIALOG -> Intent(this, DialogActivity::class.java)
            MENU_ID_AUTO_COMPLETE_TEXTVIEW -> Intent(this, AutoCompleteActivity::class.java)
            else -> null
        }
        startActivity(intent)
    }

    companion object {
        private const val MENU_ID_TEXTVIEW = 1
        private const val MENU_ID_BUTTON = 2
        private const val MENU_ID_MENU = 3
        private const val MENU_ID_EDITTEXT = 4
        private const val MENU_ID_DIALOG = 5
        private const val MENU_ID_AUTO_COMPLETE_TEXTVIEW = 6
    }
}