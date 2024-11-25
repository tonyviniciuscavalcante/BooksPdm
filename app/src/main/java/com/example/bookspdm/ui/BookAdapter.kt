package com.example.bookspdm.ui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.bookspdm.R
import com.example.bookspdm.model.Book

class BookAdapter(context: Context, private val bookList: MutableList<Book>): ArrayAdapter<Book>(context, R.layout.tile_book, bookList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

}