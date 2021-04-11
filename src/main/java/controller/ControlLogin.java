/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Gabriel
 */
public class ControlLogin {
    
    public boolean verificaLoginAcesso(String senha,String password,String senhaDigitada,String passworddigitado){
        
        if(senha.equalsIgnoreCase(senhaDigitada ) &&
                password.equalsIgnoreCase(passworddigitado)){
            return true;
            
        }else{
            return false;
        }
        
    }
    
    
    
}
