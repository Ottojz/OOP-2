public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void performMaintenance() {
        super.performMaintenance();
        this.checkEngine();
        System.out.println("Проверяем прицеп");
    }
}