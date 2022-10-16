import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        List<Motocycle> motocycles = new ArrayList<Motocycle>();
        List<Truck> trucks = new ArrayList<Truck>();
        List<Bus> buses = new ArrayList<Bus>();
        List<Trailer> trailers = new ArrayList<Trailer>();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            Car value = new Car();

            System.out.print("\nBrand: ");
            value.set_brand(scanner.next());
            System.out.print("Model: ");
            value.set_model(scanner.next());
            System.out.print("Max load: ");
            value.set_max_load(scanner.nextDouble());
            System.out.print("Max passenger count: ");
            value.set_max_passenger_count(scanner.nextInt());
            System.out.print("Max speed: ");
            value.set_max_speed(scanner.nextDouble());
            System.out.print("Body type: ");
            value.set_body_type(scanner.next());
            System.out.print("Equipment: ");
            value.set_equipment(scanner.next());
            System.out.print("Is trailer? Yes - true, No - false: ");
            value.set_is_trailer(scanner.nextBoolean());

            if (value.get_is_trailer()) {
                System.out.print("Trailer type: ");
                value.get_trailer().set_type(scanner.next());
                System.out.print("Trailer max load: ");
                value.get_trailer().set_max_load(scanner.nextInt());
            }

            cars.add(value);

            for (int i = 0; i < cars.size(); i++)
            {
                cars.get(i).print_info();
            }
        }
    }
}