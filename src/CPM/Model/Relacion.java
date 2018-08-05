/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPM.Model;


/**
 *
 * @author david
 */
public class Relacion {
    private String sucesor;
    private Actividad act;

    public Relacion(String sucesor, Actividad act) {
        this.sucesor = sucesor;
        this.act = act;
    }

    public String getSucesor() {
        return sucesor;
    }

    public void setSucesor(String sucesor) {
        this.sucesor = sucesor;
    }

    public Actividad getAct() {
        return act;
    }

    public void setAct(Actividad act) {
        this.act = act;
    }
    
}
