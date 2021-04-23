public class Pokemon {
    private String name;
    private int pokedex_number;
    private String primary_type;
    private String secondary_type;
    private int level;
    private int hp;
    private int atk;
    private int def;
    private int spe;
    private int spd;

    public Pokemon(String name, int pokedex_number)  {
        this.name = name;
        this.pokedex_number = pokedex_number;
    }

    public Pokemon(String name, int pokedex_number, String primary_type, String secondary_type) {
        this.name = name;
        this.pokedex_number = pokedex_number;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
    }

    public Pokemon(String name, int pokedex_number, String primary_type, String secondary_type, int level) {
        this.name = name;
        this.pokedex_number = pokedex_number;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
        this.level = level;
    }

    public Pokemon(String name, int pokedex_number, String primary_type, String secondary_type, int hp, int atk, int def, int spe, int spd) {
        this.name = name;
        this.pokedex_number = pokedex_number;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spe = spe;
        this.spd = spd;
    }

    public Pokemon(String name, int pokedex_number, String primary_type, String secondary_type, int level, int hp, int atk, int def, int spe, int spd) {
        this.name = name;
        this.pokedex_number = pokedex_number;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
        this.level = level;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spe = spe;
        this.spd = spd;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", pokedex_number=" + pokedex_number +
                ", primary_type='" + primary_type + '\'' +
                ", secondary_type='" + secondary_type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokedex_number() {
        return pokedex_number;
    }

    public void setPokedex_number(int pokedex_number) {
        this.pokedex_number = pokedex_number;
    }

    public String getPrimary_type() {
        return primary_type;
    }

    public void setPrimary_type(String primary_type) {
        this.primary_type = primary_type;
    }

    public String getSecondary_type() {
        return secondary_type;
    }

    public void setSecondary_type(String secondary_type) {
        this.secondary_type = secondary_type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
