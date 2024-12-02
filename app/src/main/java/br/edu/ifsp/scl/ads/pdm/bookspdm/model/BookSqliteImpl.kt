package br.edu.ifsp.scl.ads.pdm.bookspdm.model

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.database.sqlite.SQLiteDatabase

class BookSqliteImpl(context: Context): BookDao {
    companion object {
        private const val BOOK_DATABASE_FILE = "book"
        private const val BOOK_TABLE = "book"
        private const val TITLE_COLUMN = "title"
        private const val ISBN_COLUMN = "isbn"
        private const val FIRST_AUTHOR_COLUMN = "first_author"
        private const val PUBLISHER_COLUMN = "publisher"
        private const val EDITION_COLUMN = "edition"
        private const val PAGES_COLUMN = "pages"

        private const val CREATE_BOOK_TABLE_STATEMENT =
            "CREATE TABLE IF NOT EXISTS $BOOK_TABLE (" +
                "$TITLE_COLUMN TEXT NOT NULL, " +
                "$ISBN_COLUMN TEXT NOT NULL PRIMARY KEY, " +
                "$FIRST_AUTHOR_COLUMN TEXT NOT NULL, " +
                "$PUBLISHER_COLUMN TEXT NOT NULL, " +
                "$EDITION_COLUMN INTEGER NOT NULL, " +
                "$PAGES_COLUMN INTEGER NOT NULL );"
    }

    private val bookDatabase: SQLiteDatabase = context.openOrCreateDatabase(
        BOOK_DATABASE_FILE,
        MODE_PRIVATE,
        null
    )

    override fun createBook(book: Book): Long {
        TODO("Not yet implemented")
    }

    override fun retriveBook(isbn: String): Book {
        TODO("Not yet implemented")
    }

    override fun retriveBooks(): MutableList<Book> {
        TODO("Not yet implemented")
    }

    override fun updateBook(book: Book): Int {
        TODO("Not yet implemented")
    }

    override fun deleteBook(isbn: String): Int {
        TODO("Not yet implemented")
    }
}