import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt(); // Get user input for number of rows

        for (int i = rows; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop to print the current row number i times
                System.out.print(i); // Print the current row number
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close(); // Close the scanner
    }
}
