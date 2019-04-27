package prototype;

public class GirlFriend implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GirlFriend clone() throws CloneNotSupportedException {
        return (GirlFriend) super.clone();
    }
}
