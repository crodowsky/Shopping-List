/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshoppinglist.presentation;

import myshoppinglist.domain.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cherie
 */
public class ContactTableModel extends AbstractTableModel {
    
    private String [] columnNames = {"Shopping Items"};
    
    private List<ShoppingItem> items = new LinkedList<ShoppingItem>();
    
    public void setItems (List<ShoppingItem> items){
        this.items = items;
    }
         
    @Override
    public int getRowCount(){
        return items.size();
    }
    @Override
    public int getColumnCount () {
        return columnNames.length;
    }
    @Override
    public Object getValueAt (int row, int column){
        ShoppingItem item = items.get(row);
        switch (column){
            case 0:
                return item.getItem();
    }
        return "";
    }
    
    @Override
    public String getColumnName (int column){
        return columnNames [column];
    }
    
}
