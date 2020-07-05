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
    private File archivos[];

    public ControladorDirectorio() {
    }
    
    
    
    
    public ControladorDirectorio(String ruta){
        ruta=this.ruta;
    }
    
    
    public List<String> listarArchivos(){
        
        List <String> archivosL= new ArrayList<>();
        archivo=new File(ruta);
        archivos= archivo.listFiles();
       
        for (File componente : archivos) {
            if (!componente.isHidden()) {
                archivosL.add(componente.getName());
            }
        }
        return archivosL;
    }
    
    
    
    public List<String> listarDirectorios(){
        List <String> Directorios= new ArrayList<>();
        archivo=new File(ruta);
        archivos=archivo.listFiles();
        
        return Directorios;
    }
    
    public List <String> listarArchivosOcultos(){
         List<String> archivosOcultos = new ArrayList<>();
         for (File componente : archivos) {
            if (componente.isHidden()) {
                archivosOcultos.add(componente.getName());
            }
        }
        return archivosOcultos;
    }
    
    public List <String> listarDirectoriosOcultos(){
        List<String> directoriosOcultos = new ArrayList<>();
        
        return null;
    }
    
    
    public void crearDirectorio(String nombre) throws IOException{
        
        archivo =new File(nombre);
        
        try{
         if(archivo.exists()==false){
          archivo.createNewFile();
         }
        }
        catch(Exception ex){
            ex.printStackTrace();  
        }
        
        
        
        
    }
    
    public void eliminarDirectorio(String nombre){
        
        
        
    }
    
    public void  renombrarDirectorio(String actual, String nuevo){
        
        
        
    }
    
    public String mostrarInformacion(String nombre){
        
        
        
        
        
        return null;
    }
    
    
    
}
