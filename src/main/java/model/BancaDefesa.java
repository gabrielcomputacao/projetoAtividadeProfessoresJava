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
public class BancaDefesa {
    
    private String topicoBancaDefesa;
    private String tipoBancaDefesa;
    private String local;
    private String data;
    private String hora;

    public BancaDefesa(String topicoBancaDefesa, String tipoBancaDefesa, String local, String data, String hora) {
        this.topicoBancaDefesa = topicoBancaDefesa;
        this.tipoBancaDefesa = tipoBancaDefesa;
        this.local = local;
        this.data = data;
        this.hora = hora;
    }

    public String getTopicoBancaDefesa() {
        return topicoBancaDefesa;
    }

    public void setTopicoBancaDefesa(String topicoBancaDefesa) {
        this.topicoBancaDefesa = topicoBancaDefesa;
    }

    public String getTipoBancaDefesa() {
        return tipoBancaDefesa;
    }

    public void setTipoBancaDefesa(String tipoBancaDefesa) {
        this.tipoBancaDefesa = tipoBancaDefesa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
