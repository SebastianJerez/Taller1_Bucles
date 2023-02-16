/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerPunto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class TiendaForEach {
    private static ArrayList<Productos> myProductos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int numero = (int)(Math.random()*5+1);
        //Este vector lista se usa para el primer for each, ya que es necesario para que el primer for each funcione
        int [] lista = new int [numero];
        String aux1, aux2="", aux3="";
        
        System.out.println("Tienda de Productos (Usando FOR)");
        System.out.println("Numero RAND generado: "+numero+"\n");
        
        System.out.println("Ingrese los productos a comprar");
        //Se ingresan cada uno de los productos de la tienda
        int h=0;
        for(int i:lista){
            System.out.println("Producto "+(h+1)+": ");
            System.out.print("Nombre del producto: ");
            aux1 = entrada.next();
            //Aqui se valida que el precio y la cantidad sean datos numericos y no alfabeticos
            //NOTA: En este caso use DoWhile ya que esta es una estructura para validar si el dato ingresado es numerico, es imposible usar un for each para este bucle
            do{
                System.out.print("Cantidad del producto: ");
                aux2 = entrada.next();
            }while(!EsNumero(aux2));
            do{
                System.out.print("Precio del producto: ");
                aux3 = entrada.next();
            }while(!EsNumero(aux3));
            int num1;
            double num2;
            //Se pasan los datos a enteros y dobles
            num1=Integer.parseInt(aux2);
            num2=Double.parseDouble(aux3);
            //Asignamos los datos a una nueva instancia de productos el cual se añade al Arraylist myProductos
            Productos aux4 = new Productos(aux1,num1,num2);
            myProductos.add(aux4);
            h++;
        }
        
        System.out.println("Lista de Productos");
        for(Productos e:myProductos){
            System.out.println(e.getNombre()+"\t\tx"+e.getCantidad()+"\t$$: "+e.getPrecio());            
        }
        
    }
    //Esta funcion valida si el dato que se ingresa es numerico
    public static boolean EsNumero(String text) {
        int n;
        try {
          n=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex) {
           return false;
        }
    }
}
