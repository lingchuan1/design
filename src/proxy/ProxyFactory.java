package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，代理工厂，给多个目标对象生成代理对象
 * 通过 JVM 反射等机制动态生成。代理类和委托类的关系是运行时才确定的
 */
public class ProxyFactory{
    //接收一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),   //目标对象使用的类加载器
                target.getClass().getInterfaces(),    //目标对象实现的所有接口
                new InvocationHandler() {             //执行代理对象方法时触发
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();
                        Object result = null;
                        System.out.println("do sth before request...");
                        result = method.invoke(target,args);
                        System.out.println("do sth after request...");
                        return result;
                    }

                }
        );
        return proxy;
    }
}
