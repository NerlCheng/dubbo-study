import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-study
 * @description: 主程序
 * @author: 程金鹏
 * @create: 2019-10-03 13:48
 */
public class MainApp {
    public static void main(String[] args) throws IOException {
//       启动方法一：
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}

//报错：
/**
 * 1、Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/core/ErrorCoded
 * 这是因为dubbo的2.6.X版本太高了，应该改成2.6.2,
 */
