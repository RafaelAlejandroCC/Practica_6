/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_6;

    import java.util.ArrayList;
    import java.util.Scanner;

/**
 *
 * @author Rafael Alejandro
 */
public class Practica_6 {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Telefono tl = new Telefono();
        Computadora cp = new Computadora();
        Scanner lectura = new Scanner (System.in);

        ArrayList<Telefono> al1 = new ArrayList<Telefono>();
        ArrayList<Computadora> al2 = new ArrayList<Computadora>();
        
        al1.add(tl);
        al2.add(cp);
        
        
        for (Telefono o : al1 ){
            System.out.println("Telefono ");
            System.out.println("Ingrese su modelo: ");
            String modelo = lectura.next();
            System.out.println("Ingrese su memoria: ");
            int memoria = lectura.nextInt();
            System.out.println("Ingrese su color: ");
            String color = lectura.next();
            System.out.println("Ingrese su marca: ");
            String marca = lectura.next();
            System.out.println("Telefono ");
            System.out.println("Su modelo es: " + modelo);
            System.out.println("Su memoria es: " + memoria);
            System.out.println("Su color es: " + color);
            System.out.println("Su marca es: " + marca);
            System.out.println("            " );
        
        }
        
        for (Computadora o : al2 ){
            System.out.println("Computadora ");
            System.out.println("Ingrese su modelo: ");
            String modelo = lectura.next();
            System.out.println("Ingrese su memoria: ");
            int memoria = lectura.nextInt();
            System.out.println("Ingrese su color: ");
            String color = lectura.next();
            System.out.println("Ingrese su marca: ");
            String marca = lectura.next();
            System.out.println("Computadora ");
            System.out.println("Su modelo es: " + modelo);
            System.out.println("Su memoria es: " + memoria);
            System.out.println("Su color es: " + color);
            System.out.println("Su marca es: " + marca);
        
        }
        
        
    }
            
}
