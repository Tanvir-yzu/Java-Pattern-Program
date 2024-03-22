public class PrintSquare {
    public static void main(String[] args){
        // Outer loop for printing each row
        for(int i=0; i<5; i++){
            // Inner loop for printing each column in the current row
            for(int j=0; j<5; j++){
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}

//*****
//*****
//*****
//*****
//*****