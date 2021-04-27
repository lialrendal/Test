
public class Main {

    public static void ullmanConj (int num) {
        System.out.println(num);
        while (num > 1) {
            if (num % 2 == 0) {
                num = num/2;
            }
            else {
                num = num*3 + 1;
            }
            System.out.println(num);

        }
    }

    public static void main(String[] args) {
        ullmanConj(78);
    }
}
