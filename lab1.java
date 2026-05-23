import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = number ;
        System.out.println("The result is: " + result);
        sc.close();
    }
}