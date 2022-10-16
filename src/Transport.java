public class Transport {
    private String brand;
    private String model;
    private double max_load;
    private double max_passenger_count;
    private double max_speed;

    // default constructor
    public Transport()
    {
        brand = "Brand";
        model = "Model";
        max_load = 0.0;
        max_passenger_count = 0.0;
        max_speed = 0.0;
    }

    // constructor with parameters
    public Transport(String brand, String model, double max_load, double max_passenger_count, double max_speed) {
        this.brand = brand;
        this.model = model;
        this.max_load = max_load;
        this.max_passenger_count = max_passenger_count;
        this.max_speed = max_speed;
    }

    // getters and setters
    public String get_brand() {
        return brand;
    }
    public void set_brand(String brand) {
        this.brand = brand;
    }

    public String get_model() {
        return model;
    }
    public void set_model(String model) {
        this.model = model;
    }

    public double get_max_load() {
        return max_load;
    }
    public void set_max_load(double max_load) {
        this.max_load = max_load;
    }

    public double get_max_passenger_count() {
        return max_passenger_count;
    }
    public void set_max_passenger_count(double max_passengerCount) {
        this.max_passenger_count = max_passengerCount;
    }

    public double get_max_speed() { return max_speed; }
    public void set_max_speed(double max_speed) { this.max_speed = max_speed; }
    //---------------------------
}
