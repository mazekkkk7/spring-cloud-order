package cn.mazekkkk.cloud.order.service.impl;

import com.codingapi.tx.netty.service.TxManagerHttpRequestService;
import com.lorne.core.framework.utils.http.HttpUtils;
import org.springframework.stereotype.Service;

/**
 * 管理地址
 *
 * @author maze
 * @createTime 18/10/15
 */
@Service
public class TxManagerHttpRequestServiceImpl implements TxManagerHttpRequestService {


    /**
     * txManager代理Http请求 get
     *
     * @param url 地址
     * @return
     */
    @Override
    public String httpGet(String url) {
        String res = HttpUtils.get(url);
        return res;
    }

    /**
     * txManager代理Http请求Post
     *
     * @param url   地址
     * @param param 参数
     * @return
     */
    @Override
    public String httpPost(String url, String param) {
        String res = HttpUtils.post(url, param);
        return res;
    }
}
