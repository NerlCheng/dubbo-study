package boot.com.nerl.gmall.impl;

import com.nerl.gmall.bean.UserAddress;
import com.nerl.gmall.service.UserService;

import java.util.List;

/**
 * @program: dubbo-study
 * @description: 测试本地存根
 * @author: 程金鹏
 * @create: 2019-10-03 20:46
 */
/*
* 需求：如果我想在调用userservice接口之前，想记录一下日志，可以通过本地存根的方式来解决。
* 步骤：
*   1、让userServiceStub类 实现userservice接口
*   2、注入userservice,通过有参构造器的方式，让dubbo自动创建本地存根对象
*   3、此时实现getUserAddressList方法，可以先打印日志，在执行查询方法
*   4、在配置文件中，配置本地存根dubbo.consumer.stub=boot.com.nerl.gmall.impl.userServiceStub
* */




public class userServiceStub implements UserService {
    private final UserService userService; //注入userservice

    /**
     * 通过有参构造器的方式，让dubbo自动创建本地存根对象,同时传入userservice的远程代理对象
     * @param userService
     */
    public userServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("本地存根方法执行了------");
        return userService.getUserAddressList(userId);
    }
}
