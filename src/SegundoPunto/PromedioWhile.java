/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoPunto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PromedioWhile {
    
    public static ArrayList<String> listaModas = new ArrayList<>();
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero = 4;//(int)(Math.random()*41+1);
        int[] lista = new int [numero];
        double aux=0,promedio, mediana, moda=0;
        
        
        
        System.out.println("Media, Mediana y Moda (Usando WHILE)");
        System.out.println("Numero RAND generado: "+numero+"\n");
        
        System.out.println("Ingrese los numeros de la Lista");
        int i=0;
        while(i<numero){
            System.out.print((i+1)+": ");
            lista[i] = entrada.nextInt();
            aux += lista[i];
            i++;
        }
        //Se calcula la media
        promedio = aux/numero;
        System.out.println("La media de la lista es: "+promedio);
        
        //Se ordena el array y luego se calcula la mediana
        Arrays.sort(lista);
        if(numero%2==0){
            int j = numero/2;
            mediana = (lista[j]+lista[j-1])/2;
        }else{
            int j = (numero-1)/2;
            mediana = lista[j];
        }
        System.out.println("La mediana de la lista es: "+mediana);
        
        //Se inicializa un valor para saber el numero maximo de repeticiones que tiene un numero del array
        int maximoNumRepeticiones= 0;
        int aux2 =0;
        
        i=0;
        while(i<numero){
            //Se guardan el numero de repeticiones que tiene un numero y el anterior maximo numero de repeticiones para validar cual se repite mas
            int numRepeticiones= 0;
            int anteriorMaxNumRepeticiones = aux2;
            int j=0;
            while(j<numero){
                //Si el numero coincide con el otro se añade una repeticion
                if(lista[i]==lista[j]){
                    numRepeticiones++;
                }
                //Si las repeticiones del numero i son mayores al maximo numero de repeticiones se define un nuevo numero moda
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= lista[i];
                    maximoNumRepeticiones= numRepeticiones;
                }
                j++;
            }
            //Si el numero de repeticiones es mayor al aux2 se almacena ese numero en el auxiliar, esto se hace para posteriormente guardar ese valor como el anterior maximo numero de repeticiones
            if(numRepeticiones>aux2){
                aux2 = numRepeticiones;
            }
            //Si el numero de repeticiones es mayor al anterior maximo numero de repeticiones significa que hay un nuevo numero moda, por lo que el Arraylist de numeros moda se vacia para agregar el nuevo numero
            if(numRepeticiones>anteriorMaxNumRepeticiones){
                listaModas.clear();
            }
            //Si el numero de repeticiones es igual al maximo numero de repeticiones existentes y si dicho numero no se repite en la secuencia de numeros del array se adiciones ese numero al arraylist de numeros moda
            if(numRepeticiones==maximoNumRepeticiones && !esIgualModa(lista[i])){
                String numModa = String.valueOf(lista[i]);
                listaModas.add(numModa);
            }
            i++;
        }
        
        if(listaModas.size()==numero){
            System.out.println("Todos los numeros son diferentes y no existe un numero moda");
        }else{
            System.out.print("La moda de la lista es: ");
            for(String modas:listaModas){
                System.out.print(modas+" ");
            }
        }
        
        System.out.println(" ");
        
    }
    //Uso este metodo para validar si ya existe el mismo numero moda que se esta validando en el ciclo, para no repetirlos en el Arraylist
    public static boolean esIgualModa(int moda){
        String aux3 = String.valueOf(moda);
        boolean r = false;
        int i=0;
        while(i<listaModas.size()){
            if(aux3.equals(listaModas.get(i))){
                r = true;
            }else{
                r=false;
            }
            i++;
        }
        return r;
    }
    
}
