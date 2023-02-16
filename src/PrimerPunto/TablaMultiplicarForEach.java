/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPunto;

/**
 *
 * @author sebas
 */
public class TablaMultiplicarForEach {
    
    public static void main(String[] args){
        
        int numeroA = (int)(Math.random()*2024);
        //Se coloca 2024 porque la funcion Math.Random toma numeros del0 al numero por el que se multiplique
        //En este caso, del 0 al 2024 excluyendo el 2024 (0-2023)
        int numeroB = (int)(Math.random()*2024);
        
        System.out.println("Tablas de Multiplicar (Usando FOREACH)");
        
        System.out.println("Numeros RAND generados:");
        System.out.println(numeroA+" - "+numeroB+"\n");
        
        //Primero se crea el Array debido a que el ForEach esta hecho exclusivo para funcionar con arrays
        int[] tabla = new int [numeroB+1];
        for(int i=0;i<=numeroB;i++){
            tabla[i]=i;
        }
        
        //Se recorre el array "tabla" para que multiplique por cada uno de los numeros del array "tabla"
        for(int array:tabla){
            System.out.println(numeroA+"x"+array+"="+numeroA*array);
        }
    }
    
}
