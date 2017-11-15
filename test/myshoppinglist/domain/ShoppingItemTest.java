/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshoppinglist.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cherie
 */
public class ShoppingItemTest {
    
    public ShoppingItemTest() {
    }

    @Test
    public void testValidate() {
        ShoppingItem listItem = new ShoppingItem ();
        boolean result = listItem.validate ();
        assertFalse (result);
        listItem.setItem ("soup");
        result = listItem.validate();
        assertTrue (result);
    }
    
}
