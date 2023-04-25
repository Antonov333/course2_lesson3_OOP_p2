package course2_lesson3_OOP_p2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Shelby", 4);
        Car car2 = new Car("Corvette", 4);

        Truck truck = new Truck("Mack", 10);
        Truck truck2 = new Truck("Scania", 12);

        Bicycle mtb = new Bicycle("MTB", 2);
        Bicycle gravel = new Bicycle("Gravel", 2);

        ServiceStation station = new ServiceStation();

        station.service(gravel);
        station.service(mtb);

        station.service(car);
        station.service(car2);

        station.service(truck);
        station.service(truck2);

    }
}
