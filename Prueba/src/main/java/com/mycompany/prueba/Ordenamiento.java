/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author hp
 */
public class Ordenamiento {

    public void insercion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int aux = a[i]; // Guardar el valor actual a ser insertado
            int j = i - 1;
            // Mover elementos que son mayores que aux a una posición adelante
            while (j >= 0 && a[j] > aux) {
                a[j + 1] = a[j];
                j--;
            }
            // Insertar el valor en la posición correcta
            a[j + 1] = aux;
        }
    }
}



