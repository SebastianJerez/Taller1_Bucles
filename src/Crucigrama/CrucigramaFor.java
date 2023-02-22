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
public class CrucigramaFor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] palabra = new String [5];
        boolean cruce;
        
        System.out.println("Crucigrama (Usando FOR");
        System.out.println("Ingrese 5 palabras para cruzar: ");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+":");
            palabra[i] = entrada.next();
        }
        
        //Este for alterna entre todas las palabras para convertirlas en palabras raiz
        for(int h=0;h<5;h++){
        
            //Validador para saber si la letra ya esta ocupada o no
            int [] validador = new int [palabra[h].length()];
            //Este for lo uso para colocar todos los espacios en 0, al empezar una nueva palabra raiz
            for(int i=0;i<palabra[h].length();i++){
                validador[i]=0;
            }
            System.out.println("Palabra Raiz: "+palabra[h]);
            
            //Este for recorre cada palabra para hacer match
            for(int i=0;i<5;i++){
                
                //Este condicional evita que la palabra raiz se haga match con ella misma
                if(h==i){
                    i++;
                }
                //Este condicional evita que por obra del anterior codicional el vector salga de rango
                if(i==5){
                    break;
                }
                //Este for recorre los espacios de la palabra raiz para hacer match
                for(int j=0;j<palabra[h].length();j++){

                    //Booleano para saber si la palabra cruzo o no;
                    cruce=false;

                    //Este for recorre los espacios de la palabra a comparar
                    for(int k=0;k<palabra[i].length();k++){

                        //Si la letra de la palabra raiz hace match con la letra de la palabra a comparar y si el validador es diferente de 1 osea, esta libre; hace match
                        if(palabra[i].charAt(k)==palabra[h].charAt(j)&&validador[j]!=1){

                            System.out.println("Match: "+palabra[i].charAt(k)+" y "+palabra[h].charAt(j)+" de las palabras "+ palabra[h].toUpperCase() +" y " + palabra[i].toUpperCase());
                            cruce=true;
                            break;
                        }
                    }
                    //Si la palabra cruzó, el espacio de la letra de la palabra raiz pasara a estar ocupado, osea el validador en ese espacio contara como ocupado.
                    if(cruce){
                        validador[j]=1;
                        break;
                    }
                }
            }
        }
    }
}
