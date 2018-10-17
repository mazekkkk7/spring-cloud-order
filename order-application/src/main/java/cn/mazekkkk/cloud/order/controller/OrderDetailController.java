package cn.mazekkkk.cloud.order.controller;

import cn.mazekkkk.cloud.order.dao.common.OrderDetail;
import cn.mazekkkk.cloud.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单详情模块
 *
 * @author maze
 * @createTime 18/10/16
 */
@RestController
@ResponseBody
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 根据主键获取订单详情
     *
     * @param id 主键
     * @return
     */
    @PostMapping("/order_detail/{id}")
    public OrderDetail selectByPrimaryKey(@PathVariable("id") Integer id) throws Exception {
        return orderDetailService.selectByPrimaryKey(id);
    }

}
