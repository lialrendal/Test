

public class Main {
    public static void main(String[] args) {

        //Even-Odd Check

        int X = 75;
        if (X%2 == 0)  {
            System.out.println("This number is even.");
        }
        else {
            System.out.println(X + " is an odd number");
        }

        // Factorial calculator

        int num_factorial = 7;
        int result = 1;

        for (int i = 1; i <= num_factorial; i++) {
            result = result * i;
        }
        System.out.println(result);


        // Prime number checker

        int e;
        boolean invalid = false;
        for (e = 1; e <= 100; e++) {
            for (int j = 2; j < e; j++) {
                if (e % j == 0)  {
                    invalid = true;
                }
            }
            if (invalid == false) {
                System.out.println(e + " is a prime number.");
            }
            invalid = false;
        }



        //Reverse string (+ palindrome)

        String str = "test";

        // Switch case

        char c = 'a';

        switch (c)  {
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


    }
}
