package cn.mazekkkk.cloud.order.service.impl;

import cn.mazekkkk.cloud.order.dao.common.Order;
import cn.mazekkkk.cloud.order.dao.common.OrderDetail;
import cn.mazekkkk.cloud.order.dao.mapper.OrderDetailMapper;
import cn.mazekkkk.cloud.order.dao.mapper.OrderMapper;
import cn.mazekkkk.cloud.order.service.OrderService;
import cn.mazekkkk.cloud.order.service.command.CreateOrderCommand;
import cn.mazekkkk.cloud.product.dao.common.Product;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单服务实现类
 *
 * @author maze
 * @createTime 18/10/16
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    /**
     * 默认产品数
     */
    public static final Integer PROD_COUNT = 1;
    /**
     * 订单状态 1为未支付 0为作废
     */
    public static final Integer ORDER_PRE_PAY = 1;

    /**
     * 查找订单根据主键
     *
     * @param id 主键
     * @return
     */
    @Override
    public Order selectByPrimaryKey(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    /**
     * 创建订单根据产品列表
     *
     * @param createOrderCommand 创建订单参数
     * @return
     */
    @Override
    @Transactional
    @TxTransaction
    public Boolean createOrder(CreateOrderCommand createOrderCommand) throws RuntimeException {
        Order order = new Order();
        order.setMemberId(createOrderCommand.getMemberId());

        orderMapper.insertSelective(order);
        OrderDetail orderDetail;
        for (Product product : createOrderCommand.getProductList()) {
            orderDetail = new OrderDetail();
            orderDetail.setProductId(product.getId());
            orderDetail.setProductCount(PROD_COUNT);
            orderDetail.setOrderStatus(ORDER_PRE_PAY);
            orderDetail.setProductPrice(product.getPrice());
            orderDetail.setProductName(product.getName());
            orderDetail.setOrderId(order.getId());
            orderDetailMapper.insertSelective(orderDetail);
            order.setName(order.getName() + orderDetail.getProductName());
            order.setPrice(order.getPrice().add(orderDetail.getProductPrice()));
            order.setOrderDescription("信仰充值");
        }

        /**
         * 演示异常
         */
        int x = 1 / 0;

        orderMapper.updateByPrimaryKeySelective(order);

        return true;
    }
}
