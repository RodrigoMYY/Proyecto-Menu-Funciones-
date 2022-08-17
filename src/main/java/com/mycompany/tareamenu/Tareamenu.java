
package com.mycompany.tareamenu;

import static com.mycompany.tareamenu.Funciones.DescuentosLegales;
import static com.mycompany.tareamenu.Funciones.ImprimirMontos;
import static com.mycompany.tareamenu.Funciones.IngresarMontos;
import static com.mycompany.tareamenu.Funciones.MostrarSueldoMayor;
import static com.mycompany.tareamenu.Funciones.RangoMontos;
import static com.mycompany.tareamenu.Funciones.ReemplazarYMostrarSueldo;
import static com.mycompany.tareamenu.Funciones.menu;
import java.util.Scanner;

public class Tareamenu {


    public static void main(String[] args){   

      int opcion=0;
          Scanner sc = new Scanner(System.in);
      int sueldos []={385000,400000,500000,640000,390000,543000,
                      380000,425000,475000,642000,615000,527000};
      do{
         opcion = menu(sc);
          switch(opcion){
            case 0:
                System.out.println("Hasta pronto");
                break;
            case 1:
                IngresarMontos(sueldos,sc);
                break;
            case 2:
                 ImprimirMontos(sueldos);
                 break;     
            case 3:
                int min; /*se puede poner valor inicial 0 pero no es necesario a no ser de que sumemos esto*/
                int max;
                System.out.println("Ingrese el valor minimo");
                min=sc.nextInt();
                System.out.println("ingrese el valor máximo");
                max=sc.nextInt();
                RangoMontos(sueldos,min,max);
                break;
            case 4: 
                int buscar;
                int reemplazar;
                System.out.println("ingrese el sueldo a buscar");
                buscar=sc.nextInt();
                System.out.println("ingrese el sueldo a reemplazar");
                reemplazar=sc.nextInt();
                ReemplazarYMostrarSueldo(sueldos,buscar,reemplazar);
                break;
            case 5: 
                MostrarSueldoMayor(sueldos);
                break;
            case 6:
                DescuentosLegales(sueldos);
                break;
            default: 
                    System.out.println("opcion no valida");
            }
        }while(opcion!=0);  
    }
}



