/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Examen {

    
    public static void main(String[] args) {
       
        
        
        int vector[] = new int [3];
        
        
        System.out.println();
        for (int i = 0; i <vector.length; i++) {
            
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(
            "Introdusca la edad "+(i+1)));
            
        }
        
        JOptionPane.showMessageDialog(null, "El promedio es de: "+promedio(vector));
        mayor(vector);
        JOptionPane.showMessageDialog(null, "La edad menor es de: "+menor(vector));
        
        
        
                
        
    }
    
    public static int promedio(int par[]){
        int suma = 0;
        for (int i = 0; i <par.length; i++) {
            suma+=par[i];
        }
        
        return suma/par.length;
        
    }
    
    static void mayor(int vector[]){
        int mayor = 0;
        for (int i = 0; i <vector.length; i++) {
            if (vector[i]>mayor) {
                mayor=vector[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,"La edad mayor es de: "+mayor);
        
    }
    
    public static int menor(int vector[]){
        int menor = 120;
        for (int i = 0; i <vector.length; i++) {
            if (vector[i]<menor) {
                menor = vector[i];
            }
        }
        
        return menor;
        
    }
    
}
