
public class Main {

    public static StringBuilder cifradoCesar (java.lang.String cadenaACifrar)  {
        int i = 0;
        cadenaACifrar = cadenaACifrar.toLowerCase();
        StringBuilder result = new StringBuilder(cadenaACifrar);
        while (i < cadenaACifrar.length())  {
            char cipher = cadenaACifrar.charAt(i);
            int change = cipher;
            change = change + 3;
            if (change > 122)  {
                change = change - 26;
            }
            result.setCharAt(i, (char) change);
            i = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(cifradoCesar("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

}
