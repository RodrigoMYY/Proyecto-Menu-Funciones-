
package com.mycompany.funciones;

public class Funciones {
   public static void ingresarDatos(int datos[]){
       for (int i = 0; i < datos.length; i++) {
           datos[i]=0;
       }
   }
    
    public static void mostrarDatos(int datos[]){
       for (int i = 0; i < datos.length; i++) {
           System.out.println(datos[i]+ " ");
       }
    }
    
    
    public static void main(String[] args) {
        int datos[]= new int [10];
        ingresarDatos(datos);
        mostrarDatos(datos);
        
    }
}
