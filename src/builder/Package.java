package builder;

import java.util.ArrayList;

/*
产品角色
 */
public class Package {
    ArrayList<String> parts = new ArrayList<>();
    void add(String part){
        parts.add(part);
    }
    void show(){
        for(String part:parts){
            System.out.println(part);
        }
    }
}
