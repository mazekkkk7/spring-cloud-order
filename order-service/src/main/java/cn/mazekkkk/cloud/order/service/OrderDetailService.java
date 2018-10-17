package cn.mazekkkk.cloud.order.service;

import cn.mazekkkk.cloud.order.dao.common.OrderDetail;

/**
 * 订单详情服务
 *
 * @author maze
 * @createTime 18/10/16
 */
public interface OrderDetailService {
    /**
     * 查找订单详情根据主键
     *
     * @param id 主键
     * @return
     */
    OrderDetail selectByPrimaryKey(Integer id);
}
