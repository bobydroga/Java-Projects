import java.util.Scanner;

public class Main {
    static boolean isPerfectNumber(int num)
    {
        int sum = 1;

        for (int i = 2; i * i <= num; i++)
        {
            if (num % i==0)
            {
                if(i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == num && num != 1)

            return true;

        return false;
    }
    static void triangle(int a,int b,int c)
    {
        boolean valid = false;
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Not valid triangle");
        else
            System.out.println("Valid triangle");
            if (a == b && b == c)
                System.out.println("Equilateral");
            else if (a == b || b == c || a == c)
                System.out.println("Isosceles");
            else
                System.out.println("Versatile");
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("1. Perfect numbers");
        System.out.println("2. Triangle checking");
        System.out.println("3. Fibonacci with recursion");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        int userpref = sc.nextInt();
        switch (userpref){
            case 1:
                System.out.println("Enter range: ");
                int firstnum = sc.nextInt();
                int lastnum = sc.nextInt();
                for (int n = firstnum; n < lastnum; n++){
                    if(isPerfectNumber(n)){
                        System.out.println(n+ " is a perfect number");
                    }
                }
                break;
            case 2:
                System.out.println("Please enter 3 sides of a triangle: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                triangle(a, b , c);
                break;
            case 3:
                System.out.println("Please enter how many Fibonacci numbers you want to see: ");
                int numbers = sc.nextInt();
                for (int i = 1; i <= numbers; i++){
                    System.out.println(fib(i));
                }
                break;
            case 0:
                break;
        }
    }
}