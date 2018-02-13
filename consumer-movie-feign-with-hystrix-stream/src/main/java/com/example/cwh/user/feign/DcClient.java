package com.example.cwh.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cwh
 */
@FeignClient("producer")
public interface DcClient {

    /**
     * 获取eureka的注册服务列表
     *
     * @return
     */
    @GetMapping("/hello?name=feign")
    String consumer();

}
