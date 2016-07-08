package taskText;

import org.springframework.core.task.TaskExecutor;

/**
 * Created by lxj on 2016/7/1.
 */
public class TaskExecutorExample {

    private class MessagePrinter implements Runnable{
        private String message;

        MessagePrinter(String message){
            this.message = message;
        }

        public void run() {
            System.out.println(message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private TaskExecutor taskExecutor;

    TaskExecutorExample(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void printMessage() {
        for (int i=0; i < 20; i ++) {
            taskExecutor.execute(new MessagePrinter("Message: " + i));
        }
    }
}
