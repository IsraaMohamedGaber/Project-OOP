/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

/**
 *
 * @author HP
 */
  public class Books {
 
  protected int Id;
  protected double Price; 
  protected String name_of_book;
  public Books (){}

    public Books( int Id, double Price, String name_of_book) {
       
        this.Id = Id;
        this.Price = Price;
        this.name_of_book = name_of_book;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }
   @Override
    public String toString(){ 
    return"name of book"+name_of_book+"\tId of Book:"+Id+"\tPrice"+Price+"\n";
    }
    
}
