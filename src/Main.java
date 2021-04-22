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
        List<Integer> primeList = null;
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

    public static void reverseString(String sb)  {
        //Reverse string (+ palindrome)

        StringBuilder str = new StringBuilder(sb);
        System.out.println(str);
        StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println(rev);
        if (str == rev) {
            System.out.println("This word is a palindrome.");
        }
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


        primeNumber(304);


        reverseString("Croissant");




        // Switch case

        Character c = 'A';
        Character b = Character.toLowerCase(c);

        switch (b)  {
            case 'a':
                System.out.println( "This character is a vowel.");
                break;
            case 'e':
                System.out.println( "This character is a vowel.");
                break;
            case 'i':
                System.out.println( "This character is a vowel.");
                break;
            case 'o':
                System.out.println( "This character is a vowel.");
                break;
            case 'u':
                System.out.println( "This character is a vowel.");
                break;
            default:
                System.out.println( "This character is a consonant.");
        }


        // Fibonacci

        int x = 0;
        int w = 1;

        System.out.println(w);

        for (int h = 1; h <= 9; h++) {
            if (x <= w)  {
                x = x + w;
                System.out.println(x);

            }
            else {
                w = x + w;
                System.out.println(w);

            }
        }



    }
}
