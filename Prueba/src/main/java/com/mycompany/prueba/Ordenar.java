/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author hp
 */
public class Ordenar {
    public void burbuja(int[] a) {
    int n = a.length; // Obtener el tamaño del arreglo

    for (int j = 0; j < n - 1; j++) { // Iterar n-1 veces
        for (int i = 0; i < n - 1 - j; i++) { // Iterar hasta el penúltimo elemento sin incluir los elementos ya ordenados
            int aux = 0;
            if (a[i] > a[i + 1]) {
                aux = a[i]; // Intercambiar valores
                a[i] = a[i + 1];
                a[i + 1] = aux;
            }
        }
    }
}
}
