/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Estadio> informacion= new ArrayList<Estadio>();        // creamos un arraylist que almacenara objetos tipo estadio    

    public void agregarInformacion(ArrayList<Estadio> info) {       // agregamos informacion al arrayList
        informacion = info;
    }

    public ArrayList<Estadio> obtenerInformacion() {                // Obtenemos informacion del arrayList
        return informacion;
    }

    public double PromedioCapacidad() {                             // Calculamos el promedio de capacidad de los estadios 
        double suma = 0;                                                
        for (int i = 0; i < obtenerInformacion().size(); i++) {     // recorremos el array donde cada posicion almacena un objeto
            suma += obtenerInformacion().get(i).getCapacidad();     // Obtenemos el objeto en la posicion i del cual tomamos capacidad
        }
        double proCapacidad = suma / informacion.size();            // Calculamos el promedio
        return proCapacidad;                                    
    }
}
