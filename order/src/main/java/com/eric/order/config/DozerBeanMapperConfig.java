package com.eric.order.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wang.js
 * @date 2018/11/5
 * @copyright yougou.com
 */
@Configuration
public class DozerBeanMapperConfig {

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper;
    }
}
