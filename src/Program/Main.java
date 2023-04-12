package Program;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Первую машину:", 4);
        Car car2 = new Car("Втору машину:", 4);

        Truck truck = new Truck("Первую грузовую машину:", 6);
        Truck truck2 = new Truck("Вторую грузовую машину:", 8);

        Bicycle bicycle = new Bicycle("Первый велосипед:", 2);
        Bicycle bicycle2 = new Bicycle("Второй велосипед:", 2);

        ServiceStation station = new ServiceStationImpl();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
    }
}