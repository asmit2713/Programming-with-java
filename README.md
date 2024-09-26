Java Programs - Asmit's Collection
Overview
This repository contains four Java programs developed by Asmit, covering various fundamental topics such as:

Finding the largest number among three inputs.
Finding the largest number in an array.
Sorting numbers using Bubble Sort.
Sorting strings using Bubble Sort.
Each program is explained in detail, and instructions are provided to run them.

Program 1: Finding the Largest of Three Numbers
Description:
This program finds the largest number among three user-inputted numbers using simple if-else conditions.

How it Works:
The program accepts three integers as input from the user.
It compares the numbers using conditional statements and outputs the largest one.
Example: bash
Asmit's Program - Finding the Largest of Three Numbers
Enter the first number: 12
Enter the second number: 45
Enter the third number: 30
The largest number is: 45

code: java 

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asmit's Program - Finding the Largest of Three Numbers");
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}

Program 2: Finding the Largest Element in an Array
Description:
This program finds the largest element in an array of user-defined size.

How it Works:
The user specifies the size of the array and inputs the elements.
The program iterates through the array and finds the largest element.
Example:
bash
Copy code
Asmit's Program - Finding the Largest Element in an Array
Enter the number of elements in the array: 5
Enter the elements of the array:
34 21 78 56 90
The largest element in the array is: 90
Code:
java

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asmit's Program - Finding the Largest Element in an Array");
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + largest);
        
        scanner.close();
    }
}

Program 3: Bubble Sort for Numbers
Description:
This program sorts an array of integers in ascending order using the Bubble Sort algorithm.

How it Works:
The user enters the number of elements and the elements of the array.
The program repeatedly compares and swaps adjacent elements to sort the array in ascending order.
Example:
bash

Asmit's Program - Bubble Sort for Numbers
Enter the number of elements: 4
Enter the elements of the array:
45 12 89 30
Sorted array:
12 30 45 89

Code: java

import java.util.Scanner;

public class BubbleSortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asmit's Program - Bubble Sort for Numbers");
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

Program 4: Bubble Sort for Strings
Description:
This program sorts an array of strings lexicographically (alphabetically) using the Bubble Sort algorithm.

How it Works:
The user enters the number of strings and the strings themselves.
The program compares and swaps adjacent strings based on lexicographical order using the compareTo method.
Example:
bash

Asmit's Program - Bubble Sort for Strings
Enter the number of strings: 3
Enter the strings:
banana
apple
grape
Sorted strings:
apple banana grape
Code: java

import java.util.Scanner;

public class BubbleSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asmit's Program - Bubble Sort for Strings");
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        String[] array = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        
        // Bubble Sort Algorithm for Strings
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted strings:");
        for (String str : array) {
            System.out.print(str + " ");
        }
        
        scanner.close();
    }
}
How to Run the Programs
Compile the programs:
Use the following command to compile the Java files:

bash

javac LargestNumber.java
javac LargestInArray.java
javac BubbleSortNumbers.java
javac BubbleSortStrings.java
Run the programs:
Use the following command to run the compiled programs:

bash

java LargestNumber
java LargestInArray
java BubbleSortNumbers
java BubbleSortStrings
License
This collection of Java programs is created by Asmit for educational purposes. Feel free to use, modify, and distribute them as needed.

Let me know if you need any adjustments to the README!












