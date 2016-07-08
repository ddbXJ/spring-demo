package testCglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 业务类生成工厂
 * Created by lxj on 2016/7/8.
 */
public class BookServiceFactory {
    private static BookServiceBean bookServiceBean = new BookServiceBean();
    private BookServiceFactory(){}
    public static BookServiceBean getInstance() {
        return bookServiceBean;
    }

    public static BookServiceBean getProxyInstance(MyCglibProxy myCglibProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BookServiceBean.class);
        enhancer.setCallback(myCglibProxy);
        return (BookServiceBean) enhancer.create();
    }
}
