/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshoppinglist.services;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import myshoppinglist.domain.*;

/**
 *
 * @author Cherie
 */
public class AccountSvcCacheImplTest {
    
    public AccountSvcCacheImplTest() {
    }

    @Test
    public void testCRUD() {
        
        //AccountSvcCacheImpl impl = new AccountSvcCacheImpl();
        AccountSvcCacheImpl impl = AccountSvcCacheImpl.getInstance();
        List<Account> accounts = impl.retrieveAll();
        assertEquals (accounts.size(),0);
        
        Account account = new Account();
        account.setFirstName ("John");
        account.setLastName ("Doe");
        Login login = new Login ();
        login.setUserName("jdoe");
        login.setPassword ("123456");
        account.setLogin (login);
        //test create
        account = impl.create(account);
        assertNotNull(account);
        assertNotEquals(account.getId(),0);
        //test retrieveAll
        accounts = impl.retrieveAll();
        assertEquals(accounts.size (),1);
        //test update
        account.setFirstName ("Jane");
        account = impl.update(account);
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        assertEquals(account.getFirstName(), "Jane");
        //test delete
        account = impl.delete(account);
        assertEquals(accounts.size(), 0);
        
        Account account1 = new Account();
        account1.setFirstName ("John");
        account1.setLastName ("Doe");
        Login login1 = new Login();
        login1.setUserName ("jdoe");
        login1.setPassword ("123456");
        account1.setLogin (login1);
        account1 = impl.create(account1);
        assertNotNull (account1);
        
        Account account2 = new Account ();
        account2.setFirstName ("Jane");
        account2.setLastName("McDoe");
        Login login2 = new Login ();
        login2.setUserName ("jmcdoee");
        login2.setPassword("7890");
        account2.setLogin(login2);
        account2 = impl.create(account2);
        assertNotNull (account2);
        
        Login login3 = new Login();
        login3.setUserName("blah");
        login3.setPassword("yada");
        Account authenticatedAccount = impl.authenticate (login3);
        assertNull (authenticatedAccount);
        login3.setUserName ("jdoe");
        authenticatedAccount = impl.authenticate (login3);
        login3.setPassword("123456");
        authenticatedAccount = impl.authenticate(login3);
        assertNotNull (authenticatedAccount);
        login3.setUserName("jmcdoee");
        authenticatedAccount = impl.authenticate (login3);
        login3.setPassword("7890");
        authenticatedAccount = impl.authenticate (login3);
        assertNotNull (authenticatedAccount);
        
    }
    
}
