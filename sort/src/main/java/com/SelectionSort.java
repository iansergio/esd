package com;

public class SelectionSort {
    public static void main(String[] args) {

        int[] list = { 25, 20, 22, 11, 8, 18 };
        
        int smallest = list[0];

        for (int i = 1; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[j] < smallest) {
                    smallest = list[j];

                    
                }
            }
        }

        System.out.println(smallest);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}