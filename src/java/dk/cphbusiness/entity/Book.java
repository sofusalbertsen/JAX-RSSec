/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.entity;

/**
 *
 * @author sofus
 */
public class Book {
    private String iSBN;
    private String title;
    private float price;
    private int quantity;

    public Book() {
    }

    public Book(String iSBN, String title, float price, int quantity) {
        this.iSBN = iSBN;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getISBN() {
        return iSBN;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
