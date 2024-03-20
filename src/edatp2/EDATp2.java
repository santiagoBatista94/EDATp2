/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatp2;

/**
 *
 * @author SANTIAGO
 */
public class EDATp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Ordenamiento ordenamiento = new Ordenamiento();

//        // Mostrar el arreglo antes de ordenar
//        System.out.println("Arreglo antes de ordenar:");
//        ordenamiento.carga();
//        ordenamiento.muestra();
//
//        // Ordenar el arreglo con Bubble Sort
//        System.out.println("Arreglo después de ordenar con bubble sort:");
//        ordenamiento.bubbleSort();
//        ordenamiento.muestra();
//
//        // Restablecer el arreglo
//        ordenamiento.carga();
//
//        // Ordenar el arreglo con Insertion Sort
//        System.out.println("Arreglo después de ordenar con insertion sort:");
//        ordenamiento.insertionSort();
//        ordenamiento.muestra();
//
//        // Restablecer el arreglo
//        ordenamiento.carga();
//
//        // Ordenar el arreglo con Shell Sort
//        System.out.println("Arreglo después de ordenar con shell sort:");
//        ordenamiento.shellSort();
//        ordenamiento.muestra();
//    }
//
//    
//}
// Medir el tiempo de ejecución del Bubble Sort
        long startTimeBubbleSort = System.currentTimeMillis(); // Tiempo inicial
        ordenamiento.bubbleSort(); // Ordena el arreglo con Bubble Sort
        long endTimeBubbleSort = System.currentTimeMillis(); // Tiempo final
        long totalTimeBubbleSort = endTimeBubbleSort - startTimeBubbleSort; // Tiempo total en milisegundos
        System.out.println("Tiempo de ejecución de Bubble Sort: " + totalTimeBubbleSort + " ms");

        // Restablecer el arreglo
        ordenamiento.carga(); // Vuelve a cargar el arreglo con números aleatorios

        // Medir el tiempo de ejecución del Insertion Sort
        long startTimeInsertionSort = System.currentTimeMillis(); // Tiempo inicial
        ordenamiento.insertionSort(); // Ordena el arreglo con Insertion Sort
        long endTimeInsertionSort = System.currentTimeMillis(); // Tiempo final
        long totalTimeInsertionSort = endTimeInsertionSort - startTimeInsertionSort; // Tiempo total en milisegundos
        System.out.println("Tiempo de ejecución de Insertion Sort: " + totalTimeInsertionSort + " ms");

        // Restablecer el arreglo
        ordenamiento.carga(); // Vuelve a cargar el arreglo con números aleatorios

        // Medir el tiempo de ejecución del Shell Sort
        long startTimeShellSort = System.currentTimeMillis(); // Tiempo inicial
        ordenamiento.shellSort(); // Ordena el arreglo con Shell Sort
        long endTimeShellSort = System.currentTimeMillis(); // Tiempo final
        long totalTimeShellSort = endTimeShellSort - startTimeShellSort; // Tiempo total en milisegundos
        System.out.println("Tiempo de ejecución de Shell Sort: " + totalTimeShellSort + " ms");
    }
}