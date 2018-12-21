/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadio;

/**
 *
 * @author Carlos Juca
 */
public class Estadio {                      // creacion de la clase Estadio

    String nombre_estadio;                  // Atributos de la clase Estadio
    double capacidad;
    String tipo_deporte;

    public Estadio() {
        this("", "", 0);
    }

    public Estadio(String n, String t, double c) {      // Contsructor de la clase
        this.nombre_estadio = n;
        this.capacidad = c;
        this.tipo_deporte = t;
    }

    public void setNombreEstadio(String n) {            // Metodos Set para la clase
        this.nombre_estadio = n;
    }

    public void setCapacidad(double c) {
        this.capacidad = c;
    }

    public void setTipoDeporte(String t) {
        this.tipo_deporte = t;
    }

    public String getNombreEstadio() {                  // Metodos Get para la clase
        return this.nombre_estadio;
    }

    public double getCapacidad() {
        return this.capacidad;
    }

    public String getTipoDeporte() {
        return this.tipo_deporte;
    }
    
    @Override
    public String toString(){                           // Metodo toString para presentar la clase
        String cadena="";
        cadena=String.format("%s-%.2f-%s\n", getNombreEstadio(),getCapacidad(),getTipoDeporte());
        return cadena;
    }
}
