package observer;

import org.omg.CORBA.Object;

public class Father implements Observer {
    @Override
    public void update() {
        System.out.println("爸爸：应该打一顿小明了");
    }
}
