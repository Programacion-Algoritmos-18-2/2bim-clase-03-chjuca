package Estadio;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import lecturaArchivosClase.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {                                // Funcion abrir archivo
        try {
            entrada = new Scanner(new File("estadios.txt"));        // entrada es igual lo leido del archivo estadios.txt
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {       // excepcion por si no se encuentra el archivo
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    // lee registro del archivo
    public ArrayList<Estadio> leerRegistros() {                        // Funcion para leer los Registros del archivo

        ArrayList<Estadio> lista = new ArrayList<>();                   // creaoms un arrayList de tipo estadio 
        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();                                         // saltamos la primera linea del archivo
            while (entrada.hasNext()) {                                 // entrada toma el valor dela linea hasta encontrar un salto
                Estadio e = new Estadio();
                String linea = entrada.nextLine();                      // linea es igual a la linea leida
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));    // dividemos la linea en partes epradas por el ";"
                //System.out.println(linea_partes);
                e.setNombreEstadio(linea_partes.get(0));                // Asignamos valores a los atributos de estadio 
                e.setTipoDeporte(linea_partes.get(1));
                e.setCapacidad(Double.parseDouble(linea_partes.get(2)));
                lista.add(e);                                           // Agregamos l objeto a la lista
                System.out.printf("%s", e);                             // presentamos el objeto

            } // fin de while
            //OperacionData oD= new OperacionData();
            //oD.agregarInformacion(lista);
            //System.out.printf("\nEl promedio de Capacidad de estadios es: %.2f\n",oD.PromedioCapacidad());
        } // fin de try
        catch (NoSuchElementException elementException) {               // excepciones por si el archivo no es compatible
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {                                     // cerramos el archivo
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 * ***********************************************************************
 */
