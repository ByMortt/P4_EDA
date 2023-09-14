/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4eje1delacruzoscar;

import java.util.LinkedList;

/**
 *
 * @author edaII06alu10
 */
public class BusquedaBinaria {
    //método que devuelve verdadero si la clave se encuentra en la lista y falso en caso contrario.
    public static boolean busquedaBinaria(LinkedList<Integer> lista, int clave) {
        int izq = 0;
        int der = lista.size() - 1;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            if (lista.get(medio) == clave) {
                return true;
            } else if (lista.get(medio) < clave) {
                izq = medio + 1;
            }   else {
                der = medio - 1;
            }
        }
        return false;
    }
    //método que devuelve el número de veces que la clave se encuentra en la lista
    public static int contarAparicionesBusquedaBinaria(LinkedList<Integer> lista, int clave) {
        int contador = 0;
        int izq = 0;
        int der = lista.size() - 1;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            if (lista.get(medio) == clave) {
                contador++;
            // Busca en la mitad izquierda de la lista para contar apariciones adicionales
                for (int i = medio - 1; i >= izq; i--) {
                    if (lista.get(i) == clave) {
                        contador++;
                    } else {
                        break;
                    }
                }
            // Busca en la mitad derecha de la lista para contar apariciones adicionales
                for (int i = medio + 1; i <= der; i++) {
                    if (lista.get(i) == clave) {
                        contador++;
                    } else {
                        break;
                    }
                }
                return contador;
            } else if (lista.get(medio) < clave) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        return contador;
    }
}
