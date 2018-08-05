/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPM.Model;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author david
 */
public class Proyecto {
    private Map<String,Actividad> actividades;

    public Proyecto() {
        this.actividades = new HashMap<String, Actividad>();
    }
    
    public void addActividad (String k,Actividad a){
        actividades.put(k, a);
    }
    
    public Actividad buscarActividad(String k){
        Actividad a = actividades.get(k);
        return a;
    }
    
}
