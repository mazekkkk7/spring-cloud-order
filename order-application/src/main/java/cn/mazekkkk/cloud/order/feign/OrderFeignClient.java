package cn.mazekkkk.cloud.order.feign;

import cn.mazekkkk.cloud.order.service.command.CreateOrderCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * OrderFeign接口
 *
 * @author maze
 * @createTime 18/10/17
 */
@FeignClient(name = "spring-cloud-order")
public interface OrderFeignClient {

    /**
     * 创建订单接口根据产品列表
     *
     * @param createOrderCommand 创建订单参数
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/order/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Boolean createOrder(@RequestBody CreateOrderCommand createOrderCommand) throws RuntimeException;
}
