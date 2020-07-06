/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lisseth
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio() {
    }

    public ControladorDirectorio(String ruta) {
        ruta = this.ruta;
    }

    //LISTO
    public List<String> listarArchivos(String nombre) {

        List<String> archivosL = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File componente : archivos) {
            if (!componente.isHidden() && componente.isDirectory()) {
                File[] subc = componente.listFiles();
                for (File subco : subc) {
                archivosL.add(subco.getName());
                }
        }else{
                archivosL.add(componente.getName());
            }
        }
        return archivosL;
    }

    //LISTO
    public List<String> listarDirectorios(String ruta) {
        List<String> Directorios = new ArrayList<>();
       // List<String> subDirec = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File componente : archivos) {
            if (!componente.isHidden() && componente.isDirectory()) {
                Directorios.add(componente.getName());
            }
        }
        return Directorios;
    }

    //LISTO
    public List<String> listarArchivosOcultos(String nombre) {
        List<String> archivosOcultos = new ArrayList<>();
        archivo = new File(nombre);
        archivos = archivo.listFiles();

        for (File componente : archivos) {
            if (componente.isHidden() && !componente.isDirectory()) {
                File[] subc = componente.listFiles();
                archivosOcultos.add(componente.getName());
                for (File subco : subc) {
                archivosOcultos.add(subco.getName());
                }
            }else if (componente.isHidden()) {
                archivosOcultos.add(componente.getName());
            }
        }
        return archivosOcultos;
    }

    //LISTO
    public List<String> listarDirectoriosOcultos(String ruta) {
        List<String> directoriosOcultos = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File componente : archivos) {
            if (componente.isHidden() && componente.isDirectory()) {
                directoriosOcultos.add(componente.getName());
            }
        }
        return directoriosOcultos;
    }

    //LISTO
    public void crearDirectorio(String nombre) {

        archivo = new File(nombre);

        if (archivo.exists() == false) {
            archivo.mkdir();
        }

    }
    //LISTO
    public void eliminarDirectorio(String nombre) {
        archivo = new File(nombre);
        File[] elementos = archivo.listFiles();
        try {
            
            if (elementos!=null) {
               for (File ele : elementos) {
                String eliminar = ele.getAbsolutePath();
                eliminarDirectorio(eliminar);
            }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        archivo.delete();

    }

    //LISTO
    public void renombrarDirectorio(String actual, String nuevo) {

        archivo = new File(actual);

        File nuevoArchivo = new File(nuevo);
        archivo.renameTo(nuevoArchivo);
    }

    //LISTO
    public String mostrarInformacion(String nombre) {

        archivo = new File(ruta);
        archivos = archivo.listFiles();

        String informacion = " ";

        for (File componente : archivos) {
            //path 
            String path = " ";
            path = componente.getAbsolutePath();
            informacion = informacion.concat("\n" + path);
            //tamaño
            long tamanio = 0;
            String t = " ";
            tamanio = componente.length();
            String tam = String.valueOf(tamanio);
            t = t.concat(tam + " KB");
            informacion = informacion.concat("\n" + t);
            //Leer
            String leer = " ";
            if (componente.canRead()) {
                leer = leer.concat(" Abierto");
            } else {
                leer = leer.concat(" Cerrado");
            }
            informacion = informacion.concat("\n" + leer);
            //Escribir
            String escribir = " ";
            if (componente.canWrite()) {
                escribir = escribir.concat(" Abierto");
            } else {
                escribir = escribir.concat(" Cerrado");
            }
            informacion = informacion.concat("\n" + escribir);
            //fecha
            long fecha = componente.lastModified();
            String f = " ";
            Date fe = new Date(fecha);
            f = f.concat(" " + fe);
            informacion = informacion.concat("\n" + f);
        }

        return informacion;
    }

}
