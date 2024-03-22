public class PrintTangularNumber {
    public static void main(String[] args) {
        // Set the number of rows
        int row = 5;

        // Initialize the starting number
        int number = 1;

        // Outer loop to iterate over the rows
        for(int i = 1; i <= row; i++) {
            // Inner loop to print the numbers in each row
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15