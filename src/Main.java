import service.Servicable;
import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Servicable[] transport = new Transport [6];
        transport[0] = new Car("car1", 4);
        transport[1]= new Car("car2", 4);
        transport[2]= new Truck("truck1", 6);
        transport[3] = new Truck("truck2", 8);
        transport[4] = new Bicycle("bicycle1", 2);
        transport[5] = new Bicycle("bicycle2", 2);

        for (Servicable servicable : transport) {
            serviceStation.check(servicable);
        }
    }
}