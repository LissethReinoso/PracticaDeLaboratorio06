/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.List;

/**
 *
 * @author Lisseth
 */
public class ControladorDirectorio {
    
    private String ruta;
    private File archivo;
    private File archivos[];
    
    
    
    
    public ControladorDirectorio(String ruta){
        ruta=this.ruta;
    }
    
    public List<String> listarArchivos(){
        return null;
    }
    
    
    public List<String> listarDirectorios(){
        return null;
    }
    
    public List <String> listarArchivosOcultos(){
        return null;
    }
    
    
    public void crearDirectorio(String nombre){
        
    }
    
    public void eliminarDirectorio(String nombre){
        
    }
    
    public void  renombrarDIrectorio(String actual, String nuevo){
        
    }
    
    public String mostrarInformacion(String nombre){
        return null;
    }
    
    
    
}
