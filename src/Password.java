import java.util.Random;

public class Password {

    private int longitud;
    private String contrasena;

    private static final int LONG_DEFAULT = 8;

    public Password() {
        this.longitud = LONG_DEFAULT;
        this.contrasena = generarPassword();

    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    public Password(int longitud, String contrasena) {
        this.longitud = longitud;
        this.contrasena = contrasena;
    }

    public String generarPassword() {
        String pWord = "";
        int low = 33;
        int high = 126;
        for (int i = 0; i < this.longitud; i++) {
            Random num = new Random();
            int randomNum = num.nextInt(high-low) + low;
            String temporal = String.valueOf((char) randomNum);
            pWord = pWord + temporal;
        }

        return pWord;
    }

    private boolean upperCaseCheck() {
        int count = 0;
        int upperCount = 0;
        while (count < this.contrasena.length()) {
            if (Character.isUpperCase(this.contrasena.charAt(count))) {
                upperCount += 1;
                if (upperCount >= 2) {
                    count = this.contrasena.length();
                }
            }
            count += 1;
        }
        return (upperCount >= 2);
    }

    private boolean lowerCaseCheck() {
        int count = 0;
        boolean lowerCheck = false;
        while (count < this.contrasena.length()) {
            if (Character.isLowerCase(this.contrasena.charAt(count))) {
                lowerCheck = true;
                count = this.contrasena.length();
            }
            count += 1;
        }
        return lowerCheck;
    }

    private boolean digitCheck() {
        int count = 0;
        int numberCount = 0;
        while (count < this.contrasena.length()) {
            if (Character.isDigit(this.contrasena.charAt(count))) {
                numberCount += 1;
                if (numberCount >= 5) {
                    count = this.contrasena.length();
                }
            }
            count += 1;
        }
        return (numberCount >= 5);
    }


    public boolean esFuerte()  {
        return (upperCaseCheck() && lowerCaseCheck() && digitCheck());
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }
}
