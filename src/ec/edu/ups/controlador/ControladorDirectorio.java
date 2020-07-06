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
    
    
    
    
    public ControladorDirectorio(String ruta){
        ruta=this.ruta;
    }
    
    //LISTO
    public List<String> listarArchivos(String ruta){
        
        List <String> archivosL= new ArrayList<>();
        archivo=new File(ruta);
        archivos= archivo.listFiles();
       
        for (File componente : archivos) {
            if (!componente.isHidden() && !archivo.isDirectory()) {
                archivosL.add(componente.getName());   
            }
        }
        return archivosL;
    }
    //LISTO
    public List<String> listarDirectorios(){
        List <String> Directorios= new ArrayList<>();
       
        archivo=new File(ruta);
        archivos=archivo.listFiles();
        for (File componente : archivos) {
            if (!componente.isHidden() && archivo.isDirectory()) {
                Directorios.add(componente.getName());   
            }
        }
        return Directorios;
    }
    
    //LISTO
    public List <String> listarArchivosOcultos(String nombre){
         List<String> archivosOcultos = new ArrayList<>();
         archivo = new File(nombre);
         archivos = archivo.listFiles();
         
         for (File componente : archivos) {
            if (componente.isHidden() && !archivo.isDirectory()) {
                archivosOcultos.add(componente.getName());
            }
        }
        return archivosOcultos;
    }
    
    //LISTO
    public List <String> listarDirectoriosOcultos(String ruta){
        List<String> directoriosOcultos = new ArrayList<>();
           archivo = new File(ruta);
          archivos = archivo.listFiles();
          for (File componente : archivos) {
            if (componente.isHidden() && archivo.isDirectory()) {
                directoriosOcultos.add(componente.getName());
            }
        }
        return directoriosOcultos;
    }
    
    //LISTO
    public void crearDirectorio(String nombre) throws IOException{
        
        archivo =new File(nombre);
        
        try{
         if(archivo.exists()==false){
          archivo.createNewFile();
         }
        }
        catch(IOException ex){
            ex.printStackTrace();  
        }
        
    }
    
    
    //LISTO
    public void eliminarDirectorio(String nombre){
         archivo =new File(nombre);
        try{
         if(archivo.exists()==true){
          archivo.delete();
         }
        }
        catch(Exception ex){
            ex.printStackTrace();  
        }
        
    }
    
    
    //LISTO
    public void  renombrarDirectorio(String actual, String nuevo){
        
       archivo=new File(actual);
      
       File nuevoArchivo=new File(nuevo);
        archivo.renameTo(nuevoArchivo);
    }
    
    public String mostrarInformacion(String nombre){
        
        archivo =new File(ruta);
        archivos=archivo.listFiles();
        
        
        
        
        for(File componente: archivos){
            //path 
            String path=" ";
            path= componente.getAbsolutePath();
            
            //tamaño
            double tamanio=0;
            String t=" ";
            tamanio=componente.length();
            String tam= String.valueOf(tamanio);
             t=t.concat(tam+" KB");
            
        }
        
        
        
        return null;
    }
    
    
    
}
