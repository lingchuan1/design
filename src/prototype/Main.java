package prototype;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setName("aaa");
        person1.setGirlFriend("lili");

        //person1和person2指向堆内存的同一个对象
        Person person2 = person1;
        System.out.println(person2.getName());
        System.out.println(person1 == person2);

        //使用克隆，person1和person3指向堆内存的两个对象，person3的值是复制person1的
        Person person3 = person1.clone();
        System.out.println(person3.getName());
        System.out.println(person3 == person1);
        //浅复制，引用类型的字段，复制引用但是不复制引用的对象。person1和person3的girlFriend是同一个
        person3.setGirlFriend("yiyi");
        System.out.println(person1.getGirlFriend().getName());
        System.out.println(person3.getGirlFriend().getName());

        //深复制，把引用的对象的变量指向复制的新对象，而不是原有的被引用的对象。person1和person4的女朋友不是同一个啦
        Person person4 = person1.deepClone();
        person4.setGirlFriend("qiqi");
        System.out.println(person1.getGirlFriend().getName());
        System.out.println(person4.getGirlFriend().getName());
    }
}
