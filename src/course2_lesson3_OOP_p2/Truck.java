package course2_lesson3_OOP_p2;

public class Truck extends Vehicle implements VehicleService {

    public Truck(String modelName, int wheelsCount) {
        super.setModelName(modelName);
        super.setWheelsCount(wheelsCount);
    }

    public void fixTyre() {
        System.out.println(getModelName() + ": Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println(getModelName() + ": Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println(getModelName() + ": Проверяем прицеп");
    }

    public void suddenTroubleFix() {
    }

    ;

    public void fitTuneUpgrade() {
    }

    ;

    public void regularService() {
        System.out.println(super.getModelName() + ": regular service");
        for (int i = 1; i <= super.getWheelsCount(); i++) {
            System.out.println("Wheel No." + i);
            fixTyre();
        }
        checkEngine();
        checkTrailer();
    }

    ;;
}
