package course2_lesson3_OOP_p2;

public class Bicycle implements VehicleService {

    private final String modelName;
    private final int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void fixTyre() {
        System.out.println("Fix bicycle tyre accordingly to manual");
    }

    @Override
    public void suddenTroubleFix() {
        System.out.println("Fix sudden trouble accordingly to customer\'s request");

    }

    @Override
    public void upgrade() {
        System.out.println("Upgrade bicycle accordingly ot customer\' request");

    }

    @Override
    public void regularService() {
        System.out.println("Provide regular service to bicycle accordingly to season and mileage");

    }
}
