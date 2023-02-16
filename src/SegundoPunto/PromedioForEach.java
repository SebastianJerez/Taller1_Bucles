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
public class PromedioForEach {
    
    public static ArrayList<String> listaModas = new ArrayList<>();
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero = (int)(Math.random()*41+1);
        int[] lista = new int [numero];
        double aux=0,promedio, mediana, moda=0;
        
        
        
        System.out.println("Media, Mediana y Moda (Usando FOR EACH)");
        System.out.println("Numero RAND generado: "+numero+"\n");
        
        System.out.println("Ingrese los numeros de la Lista");
        int h=0;
        for(int i:lista){
            System.out.print((h+1)+": ");
            lista[h] = entrada.nextInt();
            aux += lista[h];
            h++;
        }
        
        //Se calcula la media
        promedio = aux/numero;
        System.out.println("La media de la lista es: "+promedio);
        
        //Se ordena el array y luego se calcula la mediana
        Arrays.sort(lista);
        if(numero%2==0){
            int i = numero/2;
            mediana = (lista[i]+lista[i-1])/2;
        }else{
            int i = (numero-1)/2;
            mediana = lista[i];
        }
        System.out.println("La mediana de la lista es: "+mediana);
        
        //Se inicializa un valor para saber el numero maximo de repeticiones que tiene un numero del array
        int maximoNumRepeticiones= 0;
        int aux2 =0;
        h=0;
        for(int i:lista){
            //Se guardan el numero de repeticiones que tiene un numero y el anterior maximo numero de repeticiones para validar cual se repite mas
            int numRepeticiones= 0;
            int anteriorMaxNumRepeticiones = aux2;
            int k=0;
            
            for(int j:lista){
                //Si el numero coincide con el otro se añade una repeticion
                if(lista[h]==lista[k]){
                    numRepeticiones++;
                }
                //Si las repeticiones del numero i son mayores al maximo numero de repeticiones se define un nuevo numero moda
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= lista[h];
                    maximoNumRepeticiones= numRepeticiones;
                }
                k++;
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
            if(numRepeticiones==maximoNumRepeticiones && !esIgualModa(lista[h])){
                String numModa = String.valueOf(lista[h]);
                listaModas.add(numModa);
            }
            h++;
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
        int h=0;
        for(String i:listaModas){
            if(aux3.equals(listaModas.get(h))){
                r = true;
            }else{
                r=false;
            }
            h++;
        }
        return r;
    }
    
}
