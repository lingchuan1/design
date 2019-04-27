package adapter;

/**
 * 需要被适配的类
 */
public class Adaptee {
    public void superReqest(){
        System.out.println("客户发起了特殊的请求");
    }
}
