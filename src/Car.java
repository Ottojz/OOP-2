public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void performMaintenance() {
        super.performMaintenance();
        this.checkEngine();
    }
}