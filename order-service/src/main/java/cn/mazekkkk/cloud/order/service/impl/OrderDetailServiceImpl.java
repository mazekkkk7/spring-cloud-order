package cn.mazekkkk.cloud.order.service.impl;

import cn.mazekkkk.cloud.order.dao.common.OrderDetail;
import cn.mazekkkk.cloud.order.dao.mapper.OrderDetailMapper;
import cn.mazekkkk.cloud.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单详情实现类
 *
 * @author maze
 * @createTime 18/10/16
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    /**
     * 查找订单详情根据主键
     *
     * @param id 主键
     * @return
     */
    @Override
    public OrderDetail selectByPrimaryKey(Integer id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }
}
