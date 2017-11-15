/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshoppinglist.domain;

/**
 *
 * @author Cherie
 */
public class ShoppingItem {
    private String item = "";
    private int id = 0;
    
     public String getItem () {
        return item;
    }
    public void setItem (String Item){
        this.item = Item;
    }
    public boolean validate (){
        if (item == null || item.equals ("")) return false;
        return true;
    }
    public int getId () {
        return id;
    }
    public void setId(int id) {
       this.id = id;
    }
}
