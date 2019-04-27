package single;

/**
 * 懒汉式
 */
public class Person2{
    private static  Person2 person ;
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
    private Person2(){
    }

    /**
     * 提供一个全局的静态方法
     * 在多线程时不能保证只有一个实例,可以使用synchronized修饰方法
     * @return
     */
    public static synchronized Person2 getPerson(){
        if(person == null){
            person =  new Person2();
        }
        return person;
    }

}
