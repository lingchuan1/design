package prototype;


/**
 *用原型模式指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 */
public class Person implements Cloneable{
    private String name;
    private GirlFriend girlFriend;

    public Person(){
        girlFriend = new GirlFriend();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GirlFriend getGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(String name) {
        girlFriend.setName(name);
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public Person deepClone() throws CloneNotSupportedException {
        Person person = new Person();
        person.name = this.name;
        person.girlFriend = this.girlFriend.clone();
        return person;
    }
}
