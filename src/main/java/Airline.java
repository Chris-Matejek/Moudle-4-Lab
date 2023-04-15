/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paul
 */
public class Airline {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Airline ticket");
        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10) {
                System.out.printf("%5d: ", 10);
            }
            else {
                System.out.printf("%02d-%02d: ", counter * 1, counter * 1+1);
            }
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            if (counter >= 5) {
                System.out.printf("Ticket is first class");
            }
            else {
                System.out.printf("Tickext is ecconomy class");
            }
            System.out.println();
        }
    }
}
