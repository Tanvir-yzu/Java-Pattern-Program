public class PrintEmptySquare {
    // This is the main method that starts the execution of the program
    public static void main(String[] args) {
        // Set the size of the empty square
        int n = 5;
        // Loop over the rows of the empty square
        for (int i = 0; i < n; i++) {
            // Loop over the columns of the empty square
            for (int j = 0; j < n; j++) {
                // If the cell is at the edge of the square, print an asterisk
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    // Otherwise, print a space
                    System.out.print(" ");
                }
            }
            // Move to the next line after the row is printed
            System.out.println();
        }
    }
}

//*****
//*   *
//*   *
//*   *
//*****