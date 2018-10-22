package cn.mazekkkk.cloud.order.service;

import cn.mazekkkk.cloud.order.dao.common.Order;
import cn.mazekkkk.cloud.order.service.command.CreateOrderCommand;
import org.springframework.validation.annotation.Validated;

/**
 * 订单服务
 *
 * @author maze
 * @createTime 18/10/16
 */
public interface OrderService {
    /**
     * 查找订单根据主键
     *
     * @param id 主键
     * @return
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * 创建订单根据产品列表
     *
     * @param createOrderCommand 创建订单参数
     * @return
     * @throws Exception
     */
    @Validated
    Boolean createOrder(CreateOrderCommand createOrderCommand) throws RuntimeException;
}
