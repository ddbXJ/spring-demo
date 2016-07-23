package dubboConsumer;

import dubboProvider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuejiao on 16/7/22.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("lxj"));
    }
}
