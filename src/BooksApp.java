import java.util.Scanner;

public class BooksApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of books you want: ");

        System.out.println("Your total cost is $" + (sc.nextDouble()*20.0));


    }
}
