package com;

public class BubbleSort {
    public static void main(String[] args) {
       
        int[] array = {7, 6, 4, 3};        
       
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
               
                if (array[j+1] < array[j]) {
                    int aux = array[j];
                   
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
       
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}