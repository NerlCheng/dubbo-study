package boot.com.nerl.gmall.controller;

import com.nerl.gmall.bean.UserAddress;
import boot.com.nerl.gmall.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: dubbo-study
 * @description: 获取订单
 * @author: 程金鹏
 * @create: 2019-10-03 17:01
 */
@Controller
public class getOrderController {

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/getorder")
    @ResponseBody
    public List<UserAddress> getOrder() throws InterruptedException {
        return orderService.initOrder("1");
    }
}
