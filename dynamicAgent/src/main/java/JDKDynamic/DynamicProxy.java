package JDKDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object subject;
    public DynamicProxy (Object subject){
        this.subject = subject;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ceshi");
        method.invoke(subject,args);

        return null;
    }
}
