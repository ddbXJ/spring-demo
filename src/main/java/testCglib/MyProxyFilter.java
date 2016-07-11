package testCglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 方法过滤器
 * Created by lxj on 2016/7/11.
 */
public class MyProxyFilter implements CallbackFilter {
    public int accept(Method method) {
        if (!"query".equals(method.getName())) {
            return 0;//如果不是查询操作，就返回0，执行代理
        }
        return 1;
    }
}
