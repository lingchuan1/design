package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();

        System.out.println("------------------------");

        car = new FlycarDecorator(car);
       car.show();

        System.out.println("------------------------");

        car = new SwimcarDecorator(car);
        car.show();
    }
}
