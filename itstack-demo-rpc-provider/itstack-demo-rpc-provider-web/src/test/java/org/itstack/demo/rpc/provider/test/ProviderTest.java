package org.itstack.demo.rpc.provider.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 注册中心的redis： windows环境下可下载： https://github.com/tporadowski/redis/releases
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class ProviderTest {

    @Test
    public void init() throws InterruptedException {
         while (true){
             Thread.sleep(5000);
         }
    }

}
