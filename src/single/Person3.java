package single;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Person3 {
    private static Lock lock = new ReentrantLock();
    private static  Person3 person ;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 创建私有构造器
     */
    private Person3(){
    }

    /**
     * 双重锁定
     * @return
     */
    public static synchronized Person3 getPerson(){
        if(person == null){
            lock.lock();
            if(person == null) {
                person = new Person3();
            }
            lock.unlock();
        }
        return person;
    }
}
