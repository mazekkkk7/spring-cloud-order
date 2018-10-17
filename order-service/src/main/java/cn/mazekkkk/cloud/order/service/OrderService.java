package cn.mazekkkk.cloud.order.service;

import cn.mazekkkk.cloud.order.dao.common.Order;

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
}
