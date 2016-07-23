package dubboProvider;

/**
 * Created by lixuejiao on 16/7/22.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
