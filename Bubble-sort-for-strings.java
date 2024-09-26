import java.util.Scanner;

public class BubbleSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Asmit's Program - Bubble Sort for Strings");
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  
        
        String[] array = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        
        
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
