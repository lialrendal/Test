public class Trabajador {

    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    public static final int CAT_EMPLEADO = 0;
    public static final int CAT_ENCARGADO = 1;
    public static final int CAT_DIRECTIVO = 2;
    public static final int ANT_NOVATO = 0;
    public static final int ANT_MADURO = 1;
    public static final int ANT_EXPERTO = 2;

    public boolean checkerCat (int param)  {
        return param >= CAT_EMPLEADO && param <= CAT_DIRECTIVO;
    }

    public boolean checkerAnt (int param)  {
        return param >= ANT_NOVATO && param <= ANT_EXPERTO;
    }



    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
        if (checkerCat(categoria) && checkerAnt(antiguedad)) {
            this.nombre = nombre;
            this.edad = edad;
            this.categoria = categoria;
            this.antiguedad = antiguedad;
        }
        else {
            throw new IllegalArgumentException("Alguno de los atributos fue incorrecto. Revise la categoría y la antigüedad.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if (checkerCat(categoria)) {
            this.categoria = categoria;
        }
        else {
            throw new IllegalArgumentException("El atributo fue incorrecto. Revise la categoría.");
        }
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        if (checkerAnt(antiguedad)) {
            this.antiguedad = antiguedad;
        }
        else {
            throw new IllegalArgumentException("El atributo fue incorrecto. Revise la antigüedad.");
        }
    }


    public double calcularSueldo() {
        double base = 607;
        switch (this.categoria) {
            case CAT_EMPLEADO:
                base = base * 1.15;
            case CAT_ENCARGADO:
                base = base * 1.35;
            case CAT_DIRECTIVO:
                base = base * 1.60;
        }

        switch (this.antiguedad) {
            case ANT_NOVATO:
                base = base + 150;
            case ANT_MADURO:
                base = base + 300;
            case ANT_EXPERTO:
                base = base + 600;
        }

        return base;
    }

}
