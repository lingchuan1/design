package decorator;

public class RunCar implements Car {

    public void run(){
        System.out.println("可以跑");
    }

    @Override
    public void show() {
       this.run();
    }
}
