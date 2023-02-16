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
public class PalabraInvertidaFor {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String palabra = "";
        
        System.out.println("Invertir palabras (Usando FOR)");
        System.out.println("Ingrese una palabra: ");
        palabra = entrada.next();
        System.out.println("");
        
        System.out.print("la palabra invertida es: ");
        for(int i=palabra.length();i>0;i--){
            System.out.print(palabra.charAt(i-1));
        }
        System.out.println("");
    }
}
