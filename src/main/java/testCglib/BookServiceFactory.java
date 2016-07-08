package testCglib;

/**
 * Created by lxj on 2016/7/8.
 */
public class BookServiceFactory {
    private static BookServiceBean bookServiceBean = new BookServiceBean();
    private BookServiceFactory(){}
    public static BookServiceBean getInstance() {
        return bookServiceBean;
    }
}
