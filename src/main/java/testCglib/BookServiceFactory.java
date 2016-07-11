package testCglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

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

    public static BookServiceBean getAuthInstanceByFilter(MyCglibProxy myCglibProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BookServiceBean.class);
        //callbacks里的顺序和CallbackFilter里返回的顺序是一致的，NoOp就是不做任何操作
        enhancer.setCallbacks(new Callback[]{myCglibProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MyProxyFilter());
        return (BookServiceBean) enhancer.create();
    }
}
