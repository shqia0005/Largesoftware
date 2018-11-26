/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LargeSoftwareDevelopment;

import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class LargeSoftwareDevelopment {

    public static double FindAvg(double userMarks)
    {
        double total = 0;
        double avg;
        for(int i = 0; i < 5; i = i +1)
        {
            total = total + userMarks;
        }
        avg = total/5;
        return avg;
//        System.out.println("The average is: " + avg);
    }
    public static void main(String[] args) {
        double avg;
        double userMarks;
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("Please enter 5 statistics for your favorite athletes");
        
        for(int i = 0; i < 5; i = i + 1)
        {
            userMarks = keyedInput.nextDouble();
        }
        
        
        
    }
    
}
