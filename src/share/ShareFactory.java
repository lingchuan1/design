package share;

import java.util.HashMap;

/**
 * 享元工厂类
 */
public class ShareFactory {
    private HashMap<String,ConcreteShare> shares = new HashMap<>();

    public Share getShare(String key){
        if(shares.containsKey(key))
            return shares.get(key);
        else{
            ConcreteShare concreteShare = new ConcreteShare();
            shares.put(key,concreteShare);
            return concreteShare;
        }
    }
}
