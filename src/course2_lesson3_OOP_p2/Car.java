package course2_lesson3_OOP_p2;

public class Car extends Vehicle implements VehicleService {

    public Car(String modelName, int wheelsCount) {
        super.setModelName(modelName);
        super.setWheelsCount(wheelsCount);
        super.setVehicleClassName("car");
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkBody() {
        System.out.println("check car body");
    }

    public void fixTyre() {
        System.out.print(getModelName() + ": fix tyre");
        updateTyre();
    }

    public void suddenTroubleFix() {
        System.out.println(getModelName() + ": fix sudden trouble");
    }

    public void fitTuneUpgrade() {
        System.out.println(getModelName() + ": fit, tune, upgrade accordingly to customer\'s requst");
    }


    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    public void regularService() {
        System.out.println(getModelName() + ": regular service");
        System.out.println("Wheels\n------");
        for (int i = 1; i <= super.getWheelsCount(); i++) {
            System.out.print("Wheel No." + i + ": ");
            updateTyre();
        }
        System.out.println("Engine\n------");
        checkEngine();
    }

}
