package com.immimu.belajarandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.immimu.belajarandroid.R
import com.immimu.belajarandroid.entity.MenuItem
import com.immimu.belajarandroid.listener.MenuListener
import com.immimu.belajarandroid.vh.MenuItemViewHolder

/**
 * Created by Miftah Mubarak
 * Visit me on github.com @immimu
 * 18 November 2020
 */

class MenuAdapter(private val menuList: List<MenuItem>, private val listener: MenuListener) :
    RecyclerView.Adapter<MenuItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return MenuItemViewHolder(view, listener)
    }

    override fun getItemCount(): Int = menuList.size

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(menuList[position])
    }

}