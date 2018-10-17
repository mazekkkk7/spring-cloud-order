package cn.mazekkkk.cloud.order.controller;

import cn.mazekkkk.cloud.order.dao.common.Order;
import cn.mazekkkk.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}
