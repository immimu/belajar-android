package com.immimu.belajarandroid.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.immimu.belajarandroid.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        moreButton.setOnClickListener { showMoreMenu() }
    }

    private fun showMoreMenu() {
        val popupMenu = PopupMenu(this, moreButton)
        popupMenu.inflate(R.menu.menu_more_action)
        popupMenu.setOnMenuItemClickListener(this)
        popupMenu.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.actionProfle -> {
                showToast("Menu profile di klik")
                true
            }
            R.id.actionLikes -> {
                showToast("Menu like di klik")
                true
            }
            R.id.actionSearch -> {
                showToast("Menu search di klik")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.actionEdit -> {
                showToast("Menu Edit di klik")
                true
            }
            R.id.actionDelete -> {
                showToast("Menu Delete di klik")
                true
            }
            R.id.actionFavorite -> {
                showToast("Menu Favorite di klik")
                true
            }
            else -> false
        }
    }
}