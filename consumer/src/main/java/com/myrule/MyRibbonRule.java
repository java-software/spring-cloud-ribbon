package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/11/5
 * @description
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
