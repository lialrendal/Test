
public class Main {

    public static void main(String[] args) throws Exception {
        Pokemon rhydon = new Pokemon("Rhydon", 112, "Ground", "Rock", -7 );
        String pokedex = "Alola";
        if (pokedex ==  "Alola" && rhydon.getLevel() > 40)  {
            rhydon.setSecondary_type("Ice");
        }
        if (rhydon.getLevel() < 0) {
            throw new Exception("Error, invalid level");
        }
        System.out.println(rhydon.toString());

    }
}
