/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paul
 */
import java.security.SecureRandom;

public class VarriableLength {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[9];
        for (int roll = 1; roll <= 60_000_000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(9)];
        }
        System.out.printf("%s%10s%n" , "Face" ,"Frequency");
        
        for(int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}
