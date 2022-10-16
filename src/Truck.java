public class Truck extends Transport{
    private String body_type;
    private String equipment;
    private boolean is_trailer;
    private Trailer trailer;

    // default constructor
    public Truck() {
        body_type = "open";
        equipment = "full";
        is_trailer = true;
    }

    // constructor with parameters
    public Truck(String body_type, String equipment, Trailer... trailer)
    {
        this.body_type = body_type;
        this.equipment = equipment;
        if (trailer == null)
        {
            this.is_trailer = false;
        }
        else
        {
            this.is_trailer = true;
            this.trailer = trailer[0];
        }
    }

    // getters and setters
    public String get_body_type() { return body_type; }
    public void set_body_type(String body_type) { this.body_type = body_type; }

    public String get_equipment() { return equipment; }
    public void set_equipment(String equipment) { this.equipment = equipment; }

    public boolean get_is_trailer() { return is_trailer; }
    public void set_is_trailer(boolean is_trailer) { this.is_trailer = is_trailer; }

    public Trailer get_trailer() { return trailer; }
    public void set_trailer(Trailer trailer) { this.trailer = trailer; }
    //---------------------------
}