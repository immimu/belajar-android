package com.immimu.belajarandroid.vh

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.immimu.belajarandroid.entity.MenuItem
import com.immimu.belajarandroid.listener.MenuListener
import kotlinx.android.synthetic.main.menu_item.view.*

/**
 * Created by Miftah Mubarak
 * Visit me on github.com @immimu
 * 18 November 2020
 */
class MenuItemViewHolder(itemView: View, val listener: MenuListener) :
    RecyclerView.ViewHolder(itemView) {

    fun bind(menuItem: MenuItem) {
        itemView.menuContainer.setOnClickListener { listener.onMenuClicked(menuItem) }
        itemView.titleTextView.text = menuItem.title
        itemView.subtitleTextView.text = menuItem.subtitle
    }
}