
public class Main {


    public static int getParteEntera(Double number) {
        String numStr = number.toString();
        String[] array = numStr.split("[.]");
        Integer result = Integer.parseInt(array[0]);
        return result;
    }

    public static int getParteDecimal(Double number) {
        String numStr = number.toString();
        String[] array = numStr.split("[.]");
        Integer result = Integer.parseInt(array[1]);
        return result;
    }



    public static void main(String[] args) {
        System.out.println(getParteEntera(115.2387441));
        System.out.println(getParteDecimal(115.2387441));


    }
}
