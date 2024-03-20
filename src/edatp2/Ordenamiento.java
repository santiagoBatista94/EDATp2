/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatp2;

import java.util.Random;

/**
 *
 * @author SANTIAGO
 */
public class Ordenamiento {

    private int[] datos;

    public Ordenamiento() {
        datos = new int[10000];
    }

    // Método para cargar el arreglo con números aleatorios
    public void carga() {
        Random rand = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = rand.nextInt(1000); // Genera números aleatorios entre 0 y 999
        }
    }

    // Método para mostrar el contenido del arreglo
    public void muestra() {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // Algoritmo de ordenamiento Bubble Sort
    public void bubbleSort() {
        int n = datos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de ordenamiento Insertion Sort
    public void insertionSort() {
        int n = datos.length;
        for (int i = 1; i < n; i++) {
            int key = datos[i];
            int j = i - 1;
            while (j >= 0 && datos[j] > key) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = key;
        }
    }

    // Algoritmo de ordenamiento Shell Sort
    public void shellSort() {
        int n = datos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = datos[i];
                int j = i;
                while (j >= gap && datos[j - gap] > temp) {
                    datos[j] = datos[j - gap];
                    j -= gap;
                }
                datos[j] = temp;
            }
        }
    }
}
