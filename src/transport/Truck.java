package transport;

public class Truck extends EngineTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        this.checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}