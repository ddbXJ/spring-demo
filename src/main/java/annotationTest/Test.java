package annotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lxj on 2016/7/13.
 */
public class Test {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("annotationTest");

        ApplicationContext context = new ClassPathXmlApplicationContext("/annotation-test.xml");
        CarService service = context.getBean(CarService.class);
        service.addCar("Benz");
    }
}
