package com;

public class BubbleSort {
    public static void main(String[] args) {
       
        int[] list = {7, 6, 4, 3};        
       
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < (list.length - 1) - i; j++) {
               
                if (list[j+1] < list[j]) {
                    int aux = list[j];
                   
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
        }
       
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}