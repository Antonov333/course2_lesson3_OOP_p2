package course2_lesson3_OOP_p2;

public class Bicycle extends Vehicle implements VehicleService {

        public Bicycle(String modelName, int wheelsCount) {
            super.setModelName(modelName);
            super.setWheelsCount(wheelsCount);
            super.setVehicleClassName("bicycle");
        }

    public String getModelName() {
        return super.getModelName();
    }

    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку" + " " + getModelName());
    }

    @Override
    public void fixTyre() {
        System.out.println(getModelName() + ": fix bicycle tyre accordingly to manual");
    }

    @Override
    public void suddenTroubleFix() {
        System.out.println("Fix sudden trouble accordingly to customer\'s request");

    }

    @Override
    public void fitTuneUpgrade() {
        System.out.println("Upgrade bicycle accordingly ot customer\'s request");

    }

    @Override
    public void regularService() {
        System.out.println("Provide regular service to bicycle accordingly to season and mileage");

    }

}
