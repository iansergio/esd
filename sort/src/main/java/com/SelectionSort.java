package com;

public class SelectionSort {
    public static void main(String[] args) {
       
        int[] array = {25, 20, 22, 11, 8, 18};
       
        for (int i = 0; i < array.length; i++) {
           
            int indexAux = i;
           
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexAux]) {
                    indexAux = j;
                }
            }
           
            int aux = array[i];
            array[i] = array[indexAux];
            array[indexAux] = aux;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}