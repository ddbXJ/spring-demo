package taskText;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lxj on 2016/7/1.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("target/classes/Test.xml");
        TaskExecutorExample taskExecutorExample = (TaskExecutorExample) ac.getBean("taskExecutorExample");
        taskExecutorExample.printMessage();
    }
}
