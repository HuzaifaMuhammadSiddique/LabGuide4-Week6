import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a four-digit binary string: ");
        int binaryNumber = input.nextInt(); // 1010
        int original = binaryNumber;
        
        int decimalNumber = 0;
        int remainder;
                
        for(int i=0; i<4; i++){
            remainder = binaryNumber % 10; // 0  // 1  // 0 // 1
            decimalNumber += remainder * (int)(Math.pow(2,i));
            binaryNumber = binaryNumber / 10; // 101 // 10 // 1 // 0
            
        }
        
        System.out.println("The decimal number for " + original + " is " + decimalNumber);

      
    }
    
}
