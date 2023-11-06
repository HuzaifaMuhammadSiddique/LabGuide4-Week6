import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an uppercase letter: ");
        char letter = input.next().charAt(0);
        
        switch(letter){
            case 'a':
            case 'A':
            case 'b':
            case 'B':
            case 'c':
            case 'C':
                System.out.println("The corresponding number is 2");
                break;
            
            case 'd':
            case 'D':
            case 'e':
            case 'E':
            case 'f':
            case 'F':
                System.out.println("The corresponding number is 3");
                break;
                
                
            case 'g':
            case 'G':
            case 'h':
            case 'H':
            case 'i':
            case 'I':
                System.out.println("The corresponding number is 4");
                break;
                
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
                System.out.println("The corresponding number is 5");
                break;
                
            case 'm':
            case 'M':
            case 'n':
            case 'N':
            case 'o':
            case 'O':
                System.out.println("The corresponding number is 6");
                break;

            case 'p':
            case 'P':
            case 'q':
            case 'Q':
            case 'r':
            case 'R':
            case 's':
            case 'S':
                System.out.println("The corresponding number is 7");
                break;
                
            case 't':
            case 'T':
            case 'u':
            case 'U':
            case 'v':
            case 'V':
                System.out.println("The corresponding number is 8");
                break;

            case 'w':
            case 'W':
            case 'x':
            case 'X':
            case 'y':
            case 'Y':
            case 'z':
            case 'Z':
                System.out.println("The corresponding number is 9");
                break;
                
            default:
                System.out.println(letter + " is an invalid input");
            
        }
      
    }
    
}
