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
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testValidate() {
        
        Login login = new Login ();
        boolean result = login.validate ();
        assertFalse (result);
        login.setUserName ("johndoe");
        result = login.validate();
        assertFalse (result);
        login.setPassword("123456");
        result = login.validate ();
        assertTrue(result);
    }
    @Test
    public void testEquals(){
        Login login1 = new Login();
        login1.setUserName("johndoe");
        login1.setPassword ("12345");
        
        Login login2 = new Login();
        login2.setUserName("janedoe");
        login2.setPassword("56789");
        
        assertFalse(login1.equals(login2));
        login2.setUserName("johndoe");
        assertFalse(login1.equals (login2));
        login2.setPassword("12345");
        assertTrue (login1.equals(login2));
    }
}
