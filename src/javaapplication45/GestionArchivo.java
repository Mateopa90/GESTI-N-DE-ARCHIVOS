/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.io.File;

/**
 *
 * @author Estudiante
 */
public class GestionArchivo {
    public void ListarArchivo(String ruta){
        String[] Lista=null;
        File archivo = new File(ruta);
        if(archivo.exists()){
            if(archivo.isFile()){
                System.out.println(archivo.getName());
            }else{
                Lista = archivo.list();
                for (String nombre : Lista  ) {
                    this.ListarArchivo(ruta + "/" + nombre);
                }
            }
        }
    }   
}
