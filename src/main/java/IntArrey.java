/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paul
 */
public class IntArrey {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 1+1 * counter;
        }
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for (int counter = 0; counter < array.length; counter++){
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
    }
    
}
