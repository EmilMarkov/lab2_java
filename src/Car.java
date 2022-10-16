public class Car extends Transport {
    private String body_type;
    private String equipment;
    private boolean is_trailer;
    private Trailer trailer = new Trailer();

    // default constructor
    public Car() {
        body_type = "sedan";
        equipment = "full";
        is_trailer = false;
    }

    // constructor with parameters
    public Car(String body_type, String equipment, Trailer... trailer)
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

    public void print_info()
    {
        System.out.println("Информация о транспорт:\n");
        System.out.println("Brand: " + this.get_brand());
        System.out.println("Model: " + this.get_model());
        System.out.println("Max load: " + String.valueOf(this.get_max_load()));
        System.out.println("Max passenger count: " + String.valueOf(this.get_max_passenger_count()));
        System.out.println("Max speed: " + String.valueOf(this.get_max_speed()));
        System.out.println("Body type: " + String.valueOf(this.get_body_type()));
        System.out.println("Equipment: " + String.valueOf(this.get_equipment()));
        System.out.println("Is trailer: " + String.valueOf(this.get_is_trailer()));
        System.out.println("Trailer type: " + this.get_trailer().get_type());
        System.out.println("Trailer max load: " + String.valueOf(this.get_trailer().get_max_load()));
    }
}