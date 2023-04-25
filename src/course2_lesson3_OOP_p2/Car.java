package course2_lesson3_OOP_p2;

public class Car extends Vehicle implements VehicleService {

    public Car(String modelName, int wheelsCount) {
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void fixTyre() {
        System.out.println(getModelName() + ": fix tyre");
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
        System.out.println(getModelName() + ": provided regular service");
        for (int i = 1; i <= super.getWheelsCount(); i++) {
            System.out.println("Wheel No." + i);
            updateTyre();
        }
        checkEngine();
    }

}
