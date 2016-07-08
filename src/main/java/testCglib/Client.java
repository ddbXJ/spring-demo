package testCglib;

import org.apache.log4j.Logger;

/**
 * 客户端调用业务方法
 * Created by lxj on 2016/7/8.
 */
public class Client {
    public static void main(String[] args){
        BookServiceBean bookServiceBean = BookServiceFactory.getInstance();
        doMethod(bookServiceBean);
        BookServiceBean bookServiceBean1 = BookServiceFactory.getProxyInstance(new MyCglibProxy("lxj"));
        bookServiceBean1.create();
        BookServiceBean bookServiceBean2 = BookServiceFactory.getProxyInstance(new MyCglibProxy("zt"));
        bookServiceBean2.create();
    }

    public static void doMethod(BookServiceBean service) {
        service.create();
        service.query();
        service.update();
        service.delete();
    }
}
