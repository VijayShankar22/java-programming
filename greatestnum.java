import java.util.Scanner;

public class greatestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.print(n1 + " is the greatest");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.print(n2 + " is the greatest");
        } else {
            System.out.print(n3 + " is the greatest");
        }
        sc.close();
    }
}
