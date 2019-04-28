/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class Examen2 {

    
    public static void main(String[] args) {
        
        int numeros = 0;
        String cad= "";
        
        numeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea ingresar"));
        
        int vector[] = new int[numeros];
        
        for (int i = 0; i <vector.length; i++) {
      vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
            
        }
        
        for (int i = 0; i <vector.length; i++) {
            cad+=vector[i]+" ";
        }
        
        JOptionPane.showMessageDialog(null,"El vector es: "+cad);
        
        ordenar(vector);
        
        JOptionPane.showMessageDialog(null, "EL número de valores que se repiten es de: "+repeat(vector));
        
        
        
        pares(vector);
        impares(vector);
        
        JOptionPane.showMessageDialog(null, "El vector inverso es: "+inversa(vector));
        
    }
    
    static void ordenar(int vector[]){
        String cad="";
        int aux = 0;
        
        
        for (int i = 0; i <vector.length-1; i++) {
             
            for (int j = 0; j <vector.length-1; j++) {
                if (vector[j]>vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                    
                }
                
            }
           
        }
        
        
        
        
        
        
        for (int i = 0; i <vector.length; i++) {
            cad+=vector[i]+" ";
           
            
        }
        
         JOptionPane.showMessageDialog(null, "El vector ordenado queda así: "+cad);
        
        
    }
    
    public static int repeat(int vector[]){
        int suma = 0;
        
        for (int i = 0; i <vector.length-1; i++) {
            if(vector[i]==vector[i+1]){
                suma++;
            }
        }
        return suma;
    }
    
    static void pares(int vector[]){
        String cad="";
        for (int i = 0; i <vector.length; i++) {
            if(vector[i]%2==0){
                cad+=vector[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, "Los números pares son: "+cad);
    }
    
    static void impares(int vector[]){
        String cad = "";
        for (int i = 0; i <vector.length; i++) {
            if(vector[i]%2!=0){
                cad+=vector[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null,"Los números impares son: "+cad);
    }
    
    public static String inversa(int vector[]){
        String cad = "";
        for (int i = vector.length-1; i>=0; i--) {
            cad+=vector[i]+" ";
        }
        return cad;
    }
    
}
