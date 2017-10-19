/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] listaArchivo = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre del archivo:");
        String Nombre = in.next();
        File f = new File(Nombre);
        if(f.exists()){
            if(f.isDirectory()){
                //listaArchivo = f.list();
                //System.out.println("La carpeta tiene " + listaArchivo.length);
                GestionArchivo GA = new GestionArchivo();
                GA.ListarArchivo(Nombre);
            }
            System.out.println("Existe");
        }else{
           try( //f.createNewFile();
                //System.out.println(f.getAbsolutePath());
                        PrintStream salida = new PrintStream(f)) {
                    salida.println("hola");
                    salida.flush();
                }
             catch (FileNotFoundException ex/*IOException ex*/) {
                //Logger.getLogger(JavaApplication45.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No se puede crear el archivo" + ex.getMessage());
                
            }
        }
    }
    
}
