public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }
    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void performMaintenance() {
        System.out.println("\nОбслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
