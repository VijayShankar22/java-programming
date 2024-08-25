import java.util.Scanner;

class interest_rate{
    public static void main(String[] args){
        System.out.println("Simple interest calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int p = sc.nextInt();

        System.out.print("Enter interest rate (in percentage): ");
        int r = sc.nextInt();

        System.out.print("Enter time (in years): ");
        int t = sc.nextInt();

        int interest = (p * t * r)/100;
        System.out.println("Simple interest: " + interest);

        sc.close();
    }
}