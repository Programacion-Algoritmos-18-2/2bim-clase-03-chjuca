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
public class main {

    public static void main(String[] args) {

        LeerArchivoTexto1 archivo = new LeerArchivoTexto1();        // Creamos un objeto de tipo LeerArchivoTexto1
        OperacionData oD= new OperacionData();                      // Creamos un objeto de tipo OperacionData
        
        archivo.abrirArchivo();                                     // llamamos a la funcion abrirArchivo
        oD.agregarInformacion(archivo.leerRegistros());             // llamamos a la funcion agregar informacio que recibe como parametro el ArrayLista que devulve la funcion leer registros
        System.out.printf("El promedo es: %.2f",oD.PromedioCapacidad());    // Presentamos el proedio
        archivo.cerrarArchivo();                                    // Crerramos el archivo
    }
}
