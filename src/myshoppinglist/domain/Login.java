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
public class Login {
    
    private String username = "";
    private String password = "";
    private int id = 0;
    
      
    public String getUserName () {
        return username;
    }
    public void setUserName (String username){
        this.username = username;
    }
     public String getPassword () {
        return password;
    }
    public void setPassword (String password){
        this.password = password;
    }
     public boolean validate (){
        if (username == null || username.equals ("")) return false;
        if (password == null || password.equals ("")) return false;
        return true;
     }
     @Override
     public boolean equals (Object obj){
         if (obj == null) return false;
         if (! (obj instanceof Login)) return false;
         Login login = (Login)obj;
         if (!this.username.equals(login.getUserName())) return false;
         if (!this.password.equals (login.getPassword())) return false;
         return true;
     }
}
