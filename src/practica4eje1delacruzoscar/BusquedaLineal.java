/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4eje1delacruzoscar;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edaII06alu10
 */
public class BusquedaLineal {
    //método que devuelve verdadero si un valor(clave) se encuentra en la lista y falso en caso contrario
    public static boolean busquedaLineal1(List<Integer> ListSearch, int elementoABuscar) {
        for (Integer integer : ListSearch) {
            if (integer==elementoABuscar) {
                return true;
            }  
        }
        return false;
    }
    //método que devuelve el índice donde se encuentra la clave
    public static int buscarIndice(LinkedList<Integer> lista, int clave) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == clave) {
                return i;
            }
        }
        return -1; 
    }
    //método que devuelve el número de veces que aparece la clave en la lista
    public static int contarApariciones(LinkedList<Integer> lista, int clave) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == clave) {
                contador++;
            }
        }
        return contador;
    }
}
