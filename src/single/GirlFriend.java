package single;

import java.util.HashMap;

/**
 * 多例模式
 * @data 2019/4/17
 * 一个人有固定的几个女朋友
 */
public class GirlFriend {
    private static HashMap GrilFriends = new HashMap();
    private String name;
    private GirlFriend(){}
    private GirlFriend(String name){
        this.name = name;
    }

    private static String[] names = {"huahua","lili","xiaoxiao"};
    static{
        GirlFriend g1 = new GirlFriend(names[0]);
        GrilFriends.put(names[0],g1);
        GirlFriend g2 =new GirlFriend(names[1]);
        GrilFriends.put(names[1],g2);
        GirlFriend g3 =new GirlFriend(names[2]);
        GrilFriends.put(names[2],g3);
    }

    /**
     * 随机获取一个girlfriend
     * @return
     */
    public static GirlFriend getGirlFriend(){
        int random = (int)(Math.random()*3);
        return (GirlFriend) GrilFriends.get(names[random]);
    }
    public void getName(){
        System.out.println("是" + name + "呀！");
    }
}
