package decorator;

public class FlycarDecorator extends CarDecorator {
    public FlycarDecorator(Car car) {
        super(car);
    }

    public void fly(){
        System.out.println("可以飞");
    }

    public void show(){
        this.getCar().show();
        this.fly();
    }
}
