package single;

/**
 * 饿汉式，在类加载的时候就初始化一个实例对象
 */
public class Person {
    private static  Person person = new Person();
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
    private Person(){
    }

    /**
     * 提供一个全局的静态方法
     * @return
     */
    public static Person getPerson(){
        return person;
    }
}
