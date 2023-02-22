/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crucigrama;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class CrucigramaWhile {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] palabra = new String [5];
        boolean cruce;
        int i=0, j=0, k=0, h=0;
        System.out.println("Crucigrama (Usando WHILE");
        System.out.println("Ingrese 5 palabras para cruzar: ");
        while(i<5){
            System.out.print((i+1)+":");
            palabra[i] = entrada.next();
            i++;
        }
        
        //Este ciclo alterna entre todas las palabras para convertirlas en palabras raiz
        while(h<5){
        
            //Validador para saber si la letra ya esta ocupada o no
            int [] validador = new int [palabra[h].length()];
            //Este ciclo lo uso para colocar todos los espacios en 0, al empezar una nueva palabra raiz
            i=0;
            while(i<palabra[h].length()){
                validador[i]=0;
                i++;
            }
            System.out.println("Palabra Raiz: "+palabra[h]);
            
            //Este ciclo recorre cada palabra para hacer match
            i=0;
            while(i<5){
                
                //Este condicional evita que la palabra raiz se haga match con ella misma
                if(h==i){
                    i++;
                }
                //Este condicional evita que por obra del anterior codicional el vector salga de rango
                if(i==5){
                    break;
                }
                //Este ciclo recorre los espacios de la palabra raiz para hacer match
                j=0;
                while(j<palabra[h].length()){

                    //Booleano para saber si la palabra cruzo o no;
                    cruce=false;

                    //Este ciclo recorre los espacios de la palabra a comparar
                    k=0;
                    while(k<palabra[i].length()){

                        //Si la letra de la palabra raiz hace match con la letra de la palabra a comparar y si el validador es diferente de 1 osea, esta libre; hace match
                        if(palabra[i].charAt(k)==palabra[h].charAt(j)&&validador[j]!=1){

                            System.out.println("Match: "+palabra[i].charAt(k)+" y "+palabra[h].charAt(j)+" de las palabras "+ palabra[h].toUpperCase() +" y " + palabra[i].toUpperCase());
                            cruce=true;
                            break;
                        }
                        k++;
                    }
                    //Si la palabra cruzó, el espacio de la letra de la palabra raiz pasara a estar ocupado, osea el validador en ese espacio contara como ocupado.
                    if(cruce){
                        validador[j]=1;
                        break;
                    }
                    j++;
                }
                i++;
            }
            h++;
        }
    }
    
}
