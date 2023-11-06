import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of a shelf: ");
        int shelfSize = input.nextInt();

        System.out.print("Enter total number of books: ");
        int totalBooks = input.nextInt();

        System.out.print("Enter total number of bookstands: ");
        int totalBookstands = input.nextInt();

        int totalShelfSpace = totalBookstands * 3 * shelfSize;
        
        if(totalBooks == totalShelfSpace){
            System.out.println("There is/are enough bookstand(s) to store " + totalBooks + " books ");
        } else if(totalBooks < totalShelfSpace){
            System.out.println("Bookstand can be store " + (totalShelfSpace - totalBooks) + " more book(s)");
        } else{
            double remainingBooks = ((double)totalBooks - (double)totalShelfSpace) / (3 * (double)shelfSize);
            int result = (int)(remainingBooks);
            if(remainingBooks >(totalBooks - totalShelfSpace) / (3 * shelfSize)){
                result = result + 1;
            }
            System.out.println("There is/are " + result + " bookstand(s) is/are needed");
        }

        input.close();
    }
}

