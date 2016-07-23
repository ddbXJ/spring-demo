package dubboConsumer;

import com.yit.product.api.ProductService;
import com.yit.product.entity.ProductInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuejiao on 16/7/22.
 */
public class ProductConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("product-consumer.xml");
        context.start();

        ProductService productService = (ProductService) context.getBean("productServiceExport");
        ProductInfo productInfo = productService.getProductInfoById();
        System.out.println(productInfo.name);
    }
}
