public class Trailer{
    private String type;
    private double max_load;

    // default constructor
    public Trailer() {
        type = "close";
        max_load = 0.0;
    }

    // constructor with parameters
    public Trailer(String type, double max_load)
    {
        this.type = type;
        this.max_load = max_load;
    }

    // getters and setters
    public String get_type() { return type; }
    public void set_type(String type) { this.type = type; }

    public double get_max_load() { return max_load; }
    public void set_max_load(double max_load) { this.max_load = max_load; }
    //---------------------------
}