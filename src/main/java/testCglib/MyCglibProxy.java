package testCglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

/**
 * 动态代理
 * Created by lxj on 2016/7/8.
 */
public class MyCglibProxy implements MethodInterceptor {

    private Logger LOGGER = Logger.getLogger(MyCglibProxy.class);

    private String name;

    private Enhancer enhancer = new Enhancer();

    MyCglibProxy(String name) {
        this.name = name;
    }

    public Object getDaoBean(Class cls) {
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        LOGGER.info("调用的方法是 " + method.getName());
        if (!"lxj".equals(name)) {
            System.out.println("you don't have the authentic");
            return null;
        }
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
