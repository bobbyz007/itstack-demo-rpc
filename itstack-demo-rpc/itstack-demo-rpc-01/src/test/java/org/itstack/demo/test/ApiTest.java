package org.itstack.demo.test;

import org.itstack.demo.rpc.config.spring.bean.ConsumerBean;
import org.itstack.demo.rpc.config.spring.bean.ProviderBean;
import org.itstack.demo.rpc.config.spring.bean.ServerBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * http://www.itstack.org
 * create by fuzhengwei on 2019/5/4
 * 本章节主要介绍如何读取自定义配置xml文件字段信息
 */
public class ApiTest {

    public static void main(String[] args) {
        String[] configs = {"itstack-rpc-consumer.xml", "itstack-rpc-provider.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        ProviderBean providerBean = (ProviderBean) ctx.getBean("provider_helloService");
        ctx.getBean("consumer_helloService");
        ServerBean serverBean = (ServerBean) ctx.getBean("consumer_itstack");
    }

}
