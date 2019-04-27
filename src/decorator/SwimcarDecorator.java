package decorator;

public class SwimcarDecorator extends CarDecorator {
    public SwimcarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void swim(){
        System.out.println("可以游");
    }
}
