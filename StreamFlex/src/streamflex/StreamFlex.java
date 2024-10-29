/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */


public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int opcion=0;
        while (opcion!=4){
            System.out.println("****Catalogo*****");
            System.out.println("[1] Suscripcion");
            System.out.println("[2] Peliculas ");
            System.out.println("[3] Series");
            System.out.println("[4] Documentales ");
            System.out.println("[5] Salir ");
            
            opcion= entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un rut ");
                    while (true) {
                        String rut;
                        rut=entrada.nextLine();
                        System.out.println("la suscripcio tiene un valor de 12.000 y aumenta depediedo de los que escogas ");  
                        break;
                    }
                    break;
                case 2: 
                    int opciones=0;
                    System.out.println("Peliculas ");
                    System.out.println("[1] Deadpool ");
                    System.out.println("[2] Mega Mente");
                    System.out.println("[3] Cars 2");
                    opciones=entrada.nextInt();
                    entrada.nextLine();
                    switch (opciones){
                        case 1:
                            System.out.println("las suscripcion mas Deadpool es de 13.200");
                            break;
                        case 2:
                            System.out.println("la suscripcion mas Mega Mente es de 12.000");
                            break;
                        case 3:
                            System.out.println("la suscripcion mas Cars 2  es de 12.000");
                    }
                    break; 
                case 3:
                    int opcione=0;
                    System.out.println("Series");
                    System.out.println("[1] Flash [Finalizada]");
                    System.out.println("[2] Blue Lock[Emision]");
                    System.out.println("[3] EL Padrino[Finalizada]");
                    opcione=entrada.nextInt();
                    entrada.nextLine();
                    switch (opcione){
                        case 1:
                            System.out.println("las suscripcion mas Flash es de 12.960");
                            break;
                        case 2:
                            System.out.println("la suscripcion mas Blue Lock es de 12.000");
                            break;
                        case 3:
                            System.out.println("la suscripcion mas el Padrino  es de 12.960");
                    }  
                    break;
                        case 4:
                    int opcine=0;
                    System.out.println("Series");
                    System.out.println("[1] Animal Planet [- 90 min]");
                    System.out.println("[2] la Galaxias[+ 90 min]");
                    System.out.println("[3] los planetas[+90 min]");
                    opcine=entrada.nextInt();
                    entrada.nextLine();
                    switch (opcine){
                        case 1:
                            System.out.println("las suscripcion mas Animal Planet es de 12.000");
                            break;
                        case 2:
                            System.out.println("la suscripcion mas la via lactia es de 12.600");
                            break;
                        case 3:
                            System.out.println("la suscripcion mas los planetas  es de 12.600");
                    }
                    break;
                case 5:
                    System.out.println("Salir"); 
            break;}   
        break;}
    }
}