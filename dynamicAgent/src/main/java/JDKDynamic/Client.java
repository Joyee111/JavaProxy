package JDKDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main (String args[]){
        SubjectImpl im = new SubjectImpl();

        InvocationHandler handler = new DynamicProxy(im);

        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),im.getClass().getInterfaces(),handler);
        //subject.rent();
        subject.hello("干啥");
    }
}
