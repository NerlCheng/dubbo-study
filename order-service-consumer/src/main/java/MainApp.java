import com.nerl.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-study
 * @description: 主函数
 * @author: 程金鹏
 * @create: 2019-10-03 15:32
 */
public class MainApp {
    public static void main(String[] args) throws IOException {
//        获取加载配置文件，拿到ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
//     通过接口获取接口实现类
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成....");
        System.in.read();

    }
}
