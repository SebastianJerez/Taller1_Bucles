/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuartoPunto;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PalabraInvertidaWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String palabra = "";
        
        System.out.println("Invertir palabras (Usando WHILE)");
        System.out.println("Ingrese una palabra: ");
        palabra = entrada.next();
        System.out.println("");
        
        System.out.print("la palabra invertida es: ");
        int i=palabra.length();
        while(i>0){
            System.out.print(palabra.charAt(i-1));
            i--;
        }
        System.out.println("");
    }
    
}
