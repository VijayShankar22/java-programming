// check weather a given number is prime or not.

import java.util.Scanner;

 public class prime_number {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.err.print("Enter number: ");
         int num = sc.nextInt();

         if(num <= 1){
            System.out.println(num + " is not a prime number.");
            return;
         }

         Boolean a = true;

         for(int i = 2; i*i <= num; i++){
             if(num % i == 0){
                 a = false;
                 break;
             }
         }
         if(a == true){
             System.out.println(num + " is a prime number.");
         }else{
             System.out.println(num + " is not a prime number.");
         }
         sc.close();

     }
 }


// print first n prime number.

class print_prime_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int n = 2; n <= num; n++){
            boolean isprime = true;

            for(int i = 2; i*i <= n; i++){
                if(n%i == 0){
                    isprime = false;
                    break;
                }
            }

            if (isprime == true){
                System.out.println(n);
            }
        }
        sc.close();
    }
}


// print all prime numbers between given two numbers.

class prime_number2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        

        for(int num = n1; num <= n2; num++){

            if(num <= 1){
                continue;
            }

            boolean isprime = true;

            for(int i = 2; i*i <= num; i++){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime == true){
                System.out.println(num);
            }
        }
        sc.close();

    }
}