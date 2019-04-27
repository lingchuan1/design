package observer;

public class Mother implements Observer {
    @Override
    public void update() {
        System.out.println("妈妈：应该好好教育下小明");
    }
}
