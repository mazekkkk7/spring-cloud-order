package cn.mazekkkk.cloud.order.controller;

import cn.mazekkkk.cloud.order.dao.common.Order;
import cn.mazekkkk.cloud.order.service.OrderService;
import cn.mazekkkk.cloud.order.service.command.CreateOrderCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 订单模块
 *
 * @author maze
 * @createTime 18/10/16
 */
@RestController
@ResponseBody
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 根据主键获取订单
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/order/{id}")
    public Order selectByPrimaryKey(@PathVariable("id") Integer id) throws Exception {
        return orderService.selectByPrimaryKey(id);
    }

    /**
     * 创建订单接口根据产品列表
     *
     * @param createOrderCommand 创建订单参数
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/order/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boolean createOrder(@RequestBody CreateOrderCommand createOrderCommand) {
        return orderService.createOrder(createOrderCommand);
    }


}
