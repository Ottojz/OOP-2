package transport;

import service.Servicable;

public abstract class Transport implements Servicable {
    private String modelName;
    private int wheelsCount;
//Зачем модификатор final в разборе?
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("\nОбслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}