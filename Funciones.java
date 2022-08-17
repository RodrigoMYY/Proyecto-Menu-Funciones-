
package com.mycompany.tareamenu;


 
import java.util.Scanner;



public class Funciones {
    public static int menu(Scanner sc){

        int opc = 0;
        System.out.println("Ingrese opción");
        System.out.println("0 Salir");
        System.out.println("1 Ingresar Sueldos");
        System.out.println("2 Mostrar Sueldos");
        System.out.println("3 Mostrar Sueldos Dentro De Un Rango");
        System.out.println("4 Reemplazar Sueldos");
        System.out.println("5 Mostrar El Sueldo Mayor");
        System.out.println("6 Mostrar Los Descuentos De Fonasa Y AFP En Los Sueldos");  
        opc = sc.nextInt();
        return opc;
}

public static int IngresarMontos(int sueldos[],Scanner sc){
    int opc=0;
    int monto=0;
    System.out.println("a continuación ingrese los sueldos");
    System.out.println("montos entre 380000 y 680000 solamente");
    for (int i = 0; i < sueldos.length; i++) {
        monto=sc.nextInt();
     if(monto>680000&& monto<380000){
        System.out.println("ingrese un monto entre 380000 y 680000");
     }
   }  
    return opc;
}
public static int ImprimirMontos (int sueldos[]){
    int opc=0;
    System.out.println("");
    for (int i = 0; i < sueldos.length; i++) {
        System.out.println(sueldos[i]);
    }                   
    System.out.println("");
    
    
    
    
     
    return opc;
}

public static int RangoMontos (int sueldos[],int min,int max){  /*cuando se invoca una variable hay que poner el tipo (int,float,etc)*/
    int opc=0;
    
            
    
    
    
    
    
    
    
    
    return opc;
}


public static boolean ReemplazarYMostrarSueldo (int sueldos[],int buscar,int reemplazar){
   return true;
    
    
    
    
    
    
    
    
    
    
    
    
}                   
public static void MostrarSueldoMayor (int sueldos[]){
    int sueldomayor=0;
    System.out.println(sueldomayor);
    

}



public static int DescuentosLegales (int sueldos[]){
    int opc=0;
    float fonasa;
    float afp;
    float sueldoLiquido;
    for (int i = 0; i < sueldos.length; i++) {
        fonasa= (float) (sueldos[i] *0.07);
        afp= (float) (sueldos[i]*0.1);
        sueldoLiquido= sueldos[i]-(fonasa+afp);
        
        System.out.print(sueldos[i]+" "+fonasa+" "+afp+"="+sueldoLiquido);
        System.out.println("");
    }
                
    return opc;
   }
}