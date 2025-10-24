package com;

public class InsertionSort {
    public static void main(String[] args) {
       
        int[] list = {5, 3, 8, 2, 9, 1, 11, 0, 4};
       
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
               
                if (list[j] < list[j-1]) {
                    int aux = list[j];
                   
                    list[j] = list[j-1];
                    list[j-1] = aux;
                }
            }
        }
       
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
