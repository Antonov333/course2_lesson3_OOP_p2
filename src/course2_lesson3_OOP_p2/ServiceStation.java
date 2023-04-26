package course2_lesson3_OOP_p2;

public class ServiceStation {
    private final String stationName;

    public ServiceStation(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void service(Vehicle vehicle) {

        System.out.println("\n" + stationName + " Tech Service Station provides service to " + vehicle.getModelName()
                + " " + vehicle.getVehicleClassName());

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
