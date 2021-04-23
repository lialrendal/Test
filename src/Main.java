import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int factorial(int num_factorial)  {
        // Factorial calculator

        int result = 1;

        for (int i = 1; i <= num_factorial; i++) {
            result = result * i;
        }

        return result;
    }

    public static List<Integer> primeNumber(int trial) {

        // Prime number checker

        int e;
        List<Integer> primeList = new ArrayList<Integer>();
        boolean invalid = false;
        for (e = 1; e <= trial; e++) {
            for (int j = 2; j < e; j++) {
                if (e % j == 0)  {
                    invalid = true;
                }
            }
            if (!invalid) {
                System.out.println(e + " is a prime number.");
                primeList.add(e);
            }
            invalid = false;
        }
        return primeList;
    }

    public static StringBuilder reverseString(String sb)  {
        //Reverse string (+ palindrome)

        StringBuilder str = new StringBuilder(sb);
        System.out.println(str);
        StringBuilder rev = new StringBuilder(str).reverse();
        if (str == rev) {
            System.out.println("This word is a palindrome.");
        }
        return rev;
    }


    public static void switchCase(Character c) {
        Character b = Character.toLowerCase(c);

        switch (b)  {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println( "This character is a vowel.");
                break;
            default:
                System.out.println( "This character is a consonant.");
        }
    }

    public static List<Integer> fibonacci(int limit)  {


        int x = 0;
        int w = 1;
        List<Integer> fibonacci_list = new ArrayList<Integer>();

        fibonacci_list.add(x);
        fibonacci_list.add(w);

        for (int h = 1; h <= limit-2; h++) {
            if (x <= w)  {
                x = x + w;
                fibonacci_list.add(x);
            }
            else {
                w = x + w;
                fibonacci_list.add(w);

            }
        }
        return fibonacci_list;
    }


    public static void main(String[] args) {

        //Even-Odd Check

        int X = 75;
        if (X%2 == 0)  {
            System.out.println("This number is even.");
        }
        else {
            System.out.println(X + " is an odd number");
        }

        System.out.println(factorial(9));


        // Prime number calculator

        primeNumber(304);

        // Switch case

        reverseString("Croissant");

        // Switch case

        switchCase('M');

        // Fibonacci

        fibonacci(15);


    }
}
