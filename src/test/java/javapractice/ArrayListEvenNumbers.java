package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListEvenNumbers {

    public static void main(String[] args) {
        
        // Create an empty ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the size of the ArrayList
        System.out.print("Enter the size of the ArrayList: ");
        int size = input.nextInt();
        
        // Prompt the user to enter the values for the ArrayList
        System.out.print("Enter " + size + " values: ");
        
        // Loop through user input until the ArrayList is full
        for (int i = 0; i < size; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }
        
        List<Integer> evennumber = numbers.stream()
        		.filter(n -> n%2==0)
        		.collect(Collectors.toList());
        
        System.out.println("even numbers: " + evennumber);
        // Print out the result
        System.out.println("Number of even numbers: " + evennumber.size());
    }

}
