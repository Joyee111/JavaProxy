package CgLibDynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CustomerCgLib implements MethodInterceptor {

    public Object getProxy(Class clazz){
        //cglib中用于代理无接口的实现类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理类初始化前");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("代理类执行后");
        return result;


    }
}
