//1. write a program to print fibonacci number at given position.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int num = sc.nextInt();

        if(num == 0 || num == 1){
            System.out.print(num);
        }else{
            int a = 0;
            int b = 1;
            for(int i = 2; i <= num; i ++){
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.print(b);
        }
        sc.close();
    }
}

//2. write a program to print all fibonacci numbers upto a given position.

class fibonacci_numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.print(num);
        }else if(num == 1){
            System.out.print("0 1");
        }else{
            int a = 0;
            int b = 1;

            for(int i = 2; i <= num; i++){
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
        sc.close();

    }
}


//3. write code to check weather a number is in fibonacci series or not.

class check_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("YES");
        } else {
            int a = 0;
            int b = 1;
            boolean isFibonacci = false;

            while (b <= num) {
                int c = a + b;
                if (c == num) {
                    isFibonacci = true;
                    break;
                }
                a = b;
                b = c;
            }

            if (isFibonacci == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

//4. write a program to print the position of the fibonacci number. 

class FibonacciPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid input. Number should be non-negative.");
        } else if (num == 0) {
            System.out.println("Position: 0");
        } else if (num == 1) {
            System.out.println("Position: 1 or 2");
        } else {
            int a = 0;
            int b = 1;
            int count = 1;

            while (b < num) {
                int c = a + b;
                a = b;
                b = c;
                count++;
            }

            if (b == num) {
                System.out.println("Position: " + count);
            } else {
                System.out.println("Not a Fibonacci number.");
            }
        }
        sc.close();
    }
}


//5. write a program to print sum of first n fibonacci number.

class fibonacci_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 1;

        if(num == 0 || num == 1){
            System.out.print("sum = " + num);
            sc.close();
            return;
        }else{
            int a = 0;
            int b = 1;

            for(int i = 2; i <= num; i++){
                int c = a+b;
                sum += c;
                a = b;
                b = c;
            }
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}