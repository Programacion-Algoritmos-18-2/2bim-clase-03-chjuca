/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionArchivosClases;

/**
 *
 * @author Carlos Juca
 */
public class main {
    public static void main(String[] args) {
        CrearArchivoTexto archivo= new CrearArchivoTexto();
        archivo.abrirArchivo();
        archivo.agregarRegistros();
    }
}
