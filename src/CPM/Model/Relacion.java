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
    private String idActividad;
    private Actividad sucesor;

    public Relacion(String actividad, Actividad sucesor) {
        this.idActividad = actividad;
        this.sucesor = sucesor;
    }

    public Actividad getSucesor() {
        return sucesor;
    }

    public void setSucesor(Actividad sucesor) {
        this.sucesor = sucesor;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String act) {
        this.idActividad = act;
    }
    
}
