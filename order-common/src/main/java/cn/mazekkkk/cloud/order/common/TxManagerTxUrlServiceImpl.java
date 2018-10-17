package cn.mazekkkk.cloud.order.common;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 事务控制实现类
 *
 * @author maze
 * @createTime 18/10/15
 */
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

    @Value("${tm.manager.url}")
    private String url;

    @Override
    public String getTxUrl() {
        return url;
    }
}
