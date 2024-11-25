package com.example.bookspdm.ui

import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.bookspdm.R
import com.example.bookspdm.model.Book

class BookAdapter(context: Context, private val bookList: MutableList<Book>): ArrayAdapter<Book>(context, R.layout.tile_book, bookList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Pegar o livro que vai ser usado para preencher a célula
        val book = bookList[position]

        // Verificando se a célula já foi inclada ou nāo
        var bookTile = convertView
        if (bookTile == null) {
            // Se nāo foi, infla uma nova célula
            bookTile = (context.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.tile_book, parent, false)
        }

        // Preenche os valores das célula com o novo livro
        bookTile?.findViewById<TextView>(R.id.titleTv)?.text = book.title
        bookTile?.findViewById<TextView>(R.id.titleTv)?.text = book.firstAuthor
        bookTile?.findViewById<TextView>(R.id.titleTv)?.text = book.edition.toString()


        // Retorna a célula preenchida
        return bookTile!!
    }

}