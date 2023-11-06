import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String word = input.nextLine();

        System.out.println("The last character is " + word.charAt(word.length()-1));
      
    }
    
}
