/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPM.Model;


import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Actividad {
    private String id;
    private int duracion;
    private List<Relacion> relaciones;

    public Actividad(String id, int duracion) {
        this.id = id;
        this.duracion = duracion;
        this.relaciones = new ArrayList<Relacion>();
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Relacion> getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(List<Relacion> listaRelacion) {
        this.relaciones = listaRelacion;
        
    }

    
}
