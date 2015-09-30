/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.exception;

/**
 *
 * @author sofus
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(String no_book_with_that_ISBN) {
    super(no_book_with_that_ISBN);
    }
    
}
