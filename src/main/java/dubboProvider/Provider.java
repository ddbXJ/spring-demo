package dubboProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuejiao on 16/7/22.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }

}
