import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number between 0 and 15: ");
        int decimalNumber = input.nextInt();
        int original = decimalNumber;
        
        String binaryNumber = "";

        for (int i = 8; i >= 1; i = i / 2) {
            if (decimalNumber / i == 1) {
                binaryNumber += "1";
                decimalNumber = decimalNumber - i;
            } else {
                binaryNumber += "0";
            }

        }
        
        System.out.println("The binary number for " + original + " is " + binaryNumber);

    }

}
