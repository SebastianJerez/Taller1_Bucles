/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPunto;

/**
 *
 * @author sebas
 */
public class TablaMultiplicarWhile {
    
    public static void main(String[] args){
        
        int numeroA = (int)(Math.random()*2024);
        //Se coloca 2024 porque la funcion Math.Random toma numeros del0 al numero por el que se multiplique
        //En este caso, del 0 al 2024 excluyendo el 2024 (0-2023)
        int numeroB = (int)(Math.random()*2024);
        
        System.out.println("Tablas de Multiplicar (Usando While)");
        
        System.out.println("Numeros RAND generados:");
        System.out.println(numeroA+" - "+numeroB+"\n");
        
        int i = 0;
        
        while(i<=numeroB){
            System.out.println(numeroA+"x"+i+"="+numeroA*i);
            i++;
        }
    }
    
}
