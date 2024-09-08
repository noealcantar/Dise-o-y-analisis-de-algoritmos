/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba;

/**
 *
 * @author hp
 */
public class Prueba {

    public static void main(String[] args) {
        int[] arr = {23, 16, 15, 8, 42, 4};

        // Imprimir números desordenados
        System.out.println("Números Desordenados");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // Nueva línea para separación

        // Crear instancia de la clase Ordenamiento
        Ordenamiento z = new Ordenamiento();
        Ordenar y = new Ordenar();
        // Ordenar el arreglo utilizando el método de inserción
        //z.insercion(arr); // Descomentar si deseas utilizar inserción
        // Ordenar el arreglo utilizando el método de burbuja
        y.burbuja(arr); // Descomentar si deseas utilizar burbuja

        // Imprimir números ordenados
        System.out.println("Números Ordenados");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // Nueva línea para separación
    }
}


