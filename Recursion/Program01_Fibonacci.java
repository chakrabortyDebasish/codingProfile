import java.util.Scanner;

public class Program01_Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("@Author : Debasish Chakraborty");
        System.out.println("Enter the place holder of the number to be printed for the series : ");

        int placeholder = sc.nextInt();

        int result = Fibonacci(placeholder);

        System.out.println("The number present at position " + placeholder + " is : " + result);

        sc.close();
    }

    private static int Fibonacci(int placeholder) {

        if (placeholder == 0)
            return 0;
        else if (placeholder == 1)
            return 1;

        int output = Fibonacci(placeholder - 1) + Fibonacci(placeholder - 2);

        return output;

    }
}