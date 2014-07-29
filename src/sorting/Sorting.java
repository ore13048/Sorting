/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.util.Random;            //para el random


import java.io.BufferedReader;      //para leer archivo de texto
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import java.io.*;       // para escribir archivo de texto


/**
 *
 * @author Casa
 */
public class Sorting {

    public static void main(String[] args) {
        // TODO code application logic here
       // si el .txt existe se debe agregar : FileWriter fichero = new FileWriter("fichero.txt",true);
          FileWriter fichero = null;
          Random rnd = new Random();
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("fichero.txt");
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i <= 200; i++)
                pw.println("Random " + i+": "+rnd.nextInt(10000));
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }             
                
        
    }
      
        
    
    
}
