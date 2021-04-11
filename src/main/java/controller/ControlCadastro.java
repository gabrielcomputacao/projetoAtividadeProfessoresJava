/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;

/**
 *
 * @author Gabriel
 */
public class ControlCadastro {
    
   private  Usuario user;
    
    //instancia o objeto Usuario para ser usado em outras telas do sistema
    public void instanciaUsuario(String nome,String login,String password,String tipoUsuario){
        
         user = new Usuario(login, password, tipoUsuario, nome);  
    }
    
   

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
       this.user = user;
    }
    
    
    
    
}
