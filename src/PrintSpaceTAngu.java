public class PrintSpaceTAngu {
    public static void main(String[] args) {
        // Set the value of n (number of rows in the triangle)
        int n = 5;

        // Outer loop to iterate over the rows
        for(int i = 0; i < n; i++) {
            // Inner loop to print spaces before the asterisks
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Inner loop to print asterisks
            for(int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
//    *
//   ***
//  *****
// *******
//*********
