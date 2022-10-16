public class Motocycle extends Transport {
    private String type;
    private String equipment;

    // default constructor
    public Motocycle() {
        type = "sport";
        equipment = "full";
    }

    // constructor with parameters
    public Motocycle(String type, String equipment)
    {
        this.type = type;
        this.equipment = equipment;
    }

    // getters and setters
    public String get_type() { return type; }
    public void set_type(String type) { this.type = type; }

    public String get_equipment() { return equipment; }
    public void set_equipment(String equipment) { this.equipment = equipment; }
    //---------------------------
}