public class PrintTrangular {
    public static void main(String[] args) {
        // Iterate from 4 to 1
        for(int i = 5; i > 0; i--) {
            // Print a number of asterisks that is less than or equal to the current row number
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
//* * * * *
//* * * *
//* * *
//* *
//*
