package course2_lesson3_OOP_p2;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCourse 2, Lesson 3: OOP, part 2" + "------------------------------");

        Car shelby = new Car("Shelby", 4);
        Car corvette = new Car("Corvette", 4);

        Truck mack = new Truck("Mack", 10);
        Truck scania = new Truck("Scania", 12);

        Bicycle mtb = new Bicycle("MTB", 2);
        Bicycle gravel = new Bicycle("Gravel", 2);

        ServiceStation jd190 = new ServiceStation("JD19.0");

        jd190.service(gravel);
        jd190.service(mtb);

        jd190.service(shelby);
        jd190.service(corvette);

        jd190.service(mack);
        jd190.service(scania);

    }
}
