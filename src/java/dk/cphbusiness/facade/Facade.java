/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.facade;

import dk.cphbusiness.exception.BookNotFoundException;
import dk.cphbusiness.entity.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sofus
 */
public class Facade {

    static Map<String, Book> books = new HashMap() {
        {
            put("123456", new Book("123456", "Borte med blæsten", 100f, 15));
            put("1234",new Book("1234","Sigurd fortæller bibelhistorier",10.3f,10));
        }
    };

    public static void createBook(Book book) {
        books.put(book.getISBN(), book);
    }

    public static Collection<Book> getBooks() {
    
        return books.values();
    }

    public static Book getBook(String iSBN) throws BookNotFoundException {
        if(books.containsKey(iSBN))
        return books.get(iSBN);
        else
            throw new BookNotFoundException("No book with that ISBN");
    }

    public static void deleteBook(String iSBN) {
        books.remove(iSBN);
    }

    public static void updateBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            books.put(book.getISBN(), book);
        }
    }
}
