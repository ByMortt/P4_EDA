/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4eje1delacruzoscar;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Oscar Abraham de la Cruz Lòpez
 */
public class Practica4Eje1delaCruzOscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Integer> lista1 = new LinkedList<>() ;
        lista1.add(15);
        //[Aquí agrega 5 instrucciones más de “add” con los elementos que quieras] lista1.add(80);
        lista1.add(55);
        lista1.add(23);
        lista1.add(33);
        lista1.add(91);
        lista1.add(48);
        
        System.out.println(" Estado 1 "); imprimirLista(lista1); System.out.println(" *** ");
        lista1.add(2,300);
        lista1.add(4,500);
        lista1.add(5,700);
        System.out.println(" Estado 2 "); imprimirLista(lista1); System.out.println(" *** ");
        lista1.set(1, 14);
        lista1.set(2, 16);
        lista1.set(7, 18);
        System.out.println(" Estado 3 "); imprimirLista(lista1); System.out.println(" *** ");
        List<Integer> lista2, lista3;
        lista2 = lista1.subList(2, 4);
        lista3 = lista1.subList(2, 4);
        imprimirLista(lista2);
        System.out.println(" *** ");
        imprimirLista(lista3); System.out.println(lista1.equals(lista2));
        
        //Para borrar un elemento de una lista usando remove
        lista1.remove(1); //borra el elemento 1 de la lista 1(14)
        System.out.println(" Estado 4 "); imprimirLista(lista1); System.out.println("***");
        
        //Para verificar si una lista està vacìa con is empty() y null
        LinkedList<Integer> lista4= new LinkedList<>();
        if (lista4 == null || lista4.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else {
            System.out.println("La lista no esta vacia");
        }
        lista4.add(77);
        if (lista4 == null || lista4.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else {
            System.out.println("La lista no esta vacia y contiene: "); imprimirLista(lista4); System.out.println("***");
        }
        
        //Para buscar elemento de una lista usando index off()
        int elementoABuscar = 15;
        int posicion = lista1.indexOf(elementoABuscar);
        if(posicion>=0){
            System.out.println("El elemento "+elementoABuscar+" existe en la lista y esta en la posicion "+posicion);
        }else{
            System.out.println("El elemento "+elementoABuscar+" No se encuentra en la lista");
        }
        
        System.out.println("**********Busqueda Lineal*********");
        
        //primer metodo de busqueda lineal
        boolean busqueda = BusquedaLineal.busquedaLineal1(lista1, elementoABuscar);
        if (busqueda) {
            System.out.println("El elemento a buscar: " + elementoABuscar + " existe");
        }else{
            System.out.println("El elemento a buscar: " + elementoABuscar + " no se encuentro");
        }
        //segundo método de busqueda lineal
        int indice = BusquedaLineal.buscarIndice(lista1, elementoABuscar);
        if (indice>=0) {
            System.out.println("La clave "+elementoABuscar+" se encuentra en el indice "+indice);
        }
        else{
            System.out.println("La clave "+elementoABuscar+"No se encuentro");    
        }
        //tercer método de búsqueda lineal
        int apariciones = BusquedaLineal.contarApariciones(lista1, elementoABuscar);
        System.out.println("La clave "+elementoABuscar+" aparece "+apariciones+" veces");
        
        System.out.println("**********Busqueda Binaria*********");
        
        //primer método de busqueda binaria
        boolean encontrado = BusquedaBinaria.busquedaBinaria(lista1, elementoABuscar);
        if (encontrado) {
            System.out.println("El elemento a buscar: " + elementoABuscar + " existe");
        }else{
            System.out.println("El elemento a buscar: " + elementoABuscar + " no se encuentro");
        }
        //segundo método de búsqueda binaria
        int aparicionesBinario = BusquedaBinaria.contarAparicionesBusquedaBinaria(lista1, elementoABuscar);
        System.out.println("La clave "+elementoABuscar+" aparece "+aparicionesBinario+" veces");
    }
    
    public static void imprimirLista(List<Integer> listaPrint){ for(Integer var : listaPrint){
            System.out.println(var);
        }
    }
    
}
