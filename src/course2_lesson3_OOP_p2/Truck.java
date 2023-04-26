package course2_lesson3_OOP_p2;

public class Truck extends Vehicle implements VehicleService {

    public Truck(String modelName, int wheelsCount) {
        super.setModelName(modelName);
        super.setWheelsCount(wheelsCount);
        super.setVehicleClassName("truck");
    }

    public void fixTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    private void checkEngine() {
        System.out.println(getModelName() + ": Проверяем двигатель грузовика");
    }

    private void checkTrailer() {
        System.out.println(getModelName() + ": Проверяем прицеп грузовика");
    }

    public void suddenTroubleFix() {
        System.out.println(super.getModelName() + ": fix unexpected trouble with truck");
    }

    public void fitTuneUpgrade() {
        System.out.println(super.getModelName() + ": improve truck performance and safety");
    }

    public void regularService() {
        System.out.println(super.getModelName() + ": regular service");
        for (int i = 1; i <= super.getWheelsCount(); i++) {
            System.out.print(super.getModelName() + " wheel No." + i + ". ");
            fixTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
