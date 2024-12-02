package br.edu.ifsp.scl.ads.pdm.bookspdm.model

interface BookDao {
    fun createBook(book: Book): Long
    fun retriveBook(isbn: String): Book
    fun retriveBooks(): MutableList<Book>
    fun updateBook(book: Book): Int
    fun deleteBook(isbn: String): Int
}