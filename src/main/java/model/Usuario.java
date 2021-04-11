/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel
 */
public class Usuario {
    
    //Classe pai todo usuario vai possuir esses atributos
    
    private String login;
    private String password;
    private String tipoUsuario;
    private String nome;
    
    
    private BancaDefesa bancaDefesaProfessor;
    private EventoCientifico eventoCientificoProfessor;

    public Usuario(String login, String password, String tipoUsuario, String nome) {
        this.login = login;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
    }
    
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
