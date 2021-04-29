import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private final String dni;
    private Character sexo;
    private int peso_kg;
    private int altura_cm;


    private static final Character SEX_HOMBRE = 'H';
    private static final Character SEX_MUJER = 'M';
    private static final int WGT_DEFAULT = 0;
    private static final int HGT_DEFAULT = 0;
    private static final int AGE_DEFAULT = 0;
    private static final String NAME_DEFAULT = "";
    public static final int UNDERWEIGHT = -1;
    public static final int IDEAL = 0;
    public static final int OVERWEIGHT = 1;




    private void comprobarSexo (char sexo)  {
        if (sexo != SEX_HOMBRE || sexo != SEX_MUJER) {
            this.sexo = SEX_HOMBRE;
        }
    }


    public Persona() {
        this.dni = generaDNI();
        this.nombre = NAME_DEFAULT;
        this.edad = AGE_DEFAULT;
        this.sexo = SEX_HOMBRE;
        this.altura_cm = HGT_DEFAULT;
        this.peso_kg = WGT_DEFAULT;
    }


    public Persona(String nombre, int edad, Character sexo) {
        comprobarSexo(sexo);
        this.dni = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura_cm = HGT_DEFAULT;
        this.peso_kg = WGT_DEFAULT;
    }


    public Persona(String nombre, int edad, Character sexo, int peso_kg, int altura_cm) {
        comprobarSexo(sexo);
        this.dni = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso_kg = peso_kg;
        this.altura_cm = altura_cm;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }

    public void setAltura_cm(int altura_cm) {
        this.altura_cm = altura_cm;
    }



    public int calcularIMC() {
        int calc = this.peso_kg/(this.altura_cm/100)^2;
        if (calc < 20) {
            return UNDERWEIGHT;
        }
        else if ( calc <= 25) {
            return IDEAL;
        }
        else {
            return OVERWEIGHT;
        }
    }

    public boolean esMayorDeEdad ()  {
        return (this.edad >= 18);
    }


    private String generaDNI() {
        Random num = new Random();
        Integer number = 10000000 + num.nextInt(90000000);
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        char character = tabla.charAt(number%23);
        return number.toString() + character;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso_kg=" + peso_kg +
                ", altura_cm=" + altura_cm +
                '}';
    }
}
