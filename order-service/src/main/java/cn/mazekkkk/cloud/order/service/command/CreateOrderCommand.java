package cn.mazekkkk.cloud.order.service.command;

import cn.mazekkkk.cloud.product.dao.common.Product;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 创建订单命令
 *
 * @author maze
 * @createTime 18/10/19
 */
@Data
public class CreateOrderCommand implements Serializable {

    /**
     * 会员id
     */
    @NotNull(message = "会员id不能为空")
    private Integer memberId;
    /**
     * 产品列表
     */
    @NotNull(message = "产品列表不能为空")
    private List<Product> productList;

}
