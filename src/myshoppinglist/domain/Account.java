/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshoppinglist.domain;

import java.util.*;
/**
 *
 * @author Cherie
 */
public class Account {
    
    private List<ShoppingItem> items = new LinkedList<ShoppingItem>();
    private int nextId = 0;
    
    public ShoppingItem add (ShoppingItem item){
        item.setId(++nextId);
        items.add(item);
        return item;
    }
    private String firstName = "";
    private String lastName = "";
    private int id = 0;
    private Login login = null;

    public List<ShoppingItem> getItems(){
        return items;
    }
    public String getFirstName () {
        return firstName;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
     public String getLastName () {
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public int getId () {
        return id;
    }
    public void setId (int id){
        this.id = id;
    }
    public Login getLogin () {
        return login;
    }
    public void setLogin (Login login) {
        this.login = login;
    }
   
    public boolean validate(){
        if (firstName == null || firstName.equals ("")) return false;
        if (lastName == null || lastName.equals ("")) return false;
        if (login == null) return false;
        return true;
    }
  }
