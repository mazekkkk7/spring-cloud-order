package cn.mazekkkk.cloud.order.service.impl;

import cn.mazekkkk.cloud.order.dao.common.Order;
import cn.mazekkkk.cloud.order.dao.mapper.OrderMapper;
import cn.mazekkkk.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
