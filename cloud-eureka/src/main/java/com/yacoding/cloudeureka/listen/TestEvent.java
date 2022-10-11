package com.yacoding.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author yaCoding
 * @create 2022-10-11 下午 9:05
 */
//测试事件
@Component
public class TestEvent {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        // 发邮件 短信
        System.out.println("下线:"+event.getServerId());
    }

}
