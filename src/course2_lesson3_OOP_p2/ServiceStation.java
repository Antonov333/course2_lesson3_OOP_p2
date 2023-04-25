package course2_lesson3_OOP_p2;

public class ServiceStation {
    public void service(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("No vehicle for service");
            return;
        }
        vehicle.fixTyre();
        vehicle.regularService();
        vehicle.suddenTroubleFix();
        vehicle.fitTuneUpgrade();
    }
}
