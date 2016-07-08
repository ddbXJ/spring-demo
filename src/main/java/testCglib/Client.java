package testCglib;

/**
 * Created by lxj on 2016/7/8.
 */
public class Client {
    public static void main(String[] args){
        BookServiceBean bookServiceBean = BookServiceFactory.getInstance();
        doMethod(bookServiceBean);
    }

    public static void doMethod(BookServiceBean service) {
        service.create();
        service.query();
        service.update();
        service.delete();
    }
}
