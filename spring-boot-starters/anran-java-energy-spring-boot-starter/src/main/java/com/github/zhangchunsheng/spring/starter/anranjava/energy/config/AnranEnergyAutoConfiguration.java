package com.github.zhangchunsheng.spring.starter.anranjava.energy.config;

import com.github.zhangchunsheng.anranenergy.service.BaseDataService;
import com.github.zhangchunsheng.anranenergy.service.impl.BaseDataServiceImpl;
import com.github.zhangchunsheng.spring.starter.anranjava.energy.properties.AnranEnergyProperties;
import me.zhangchunsheng.anran.common.config.AnranConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *  电费自动配置
 *  Created by Chunsheng Zhang on 2021/01/14.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Configuration
@EnableConfigurationProperties(AnranEnergyProperties.class)
@ConditionalOnClass(BaseDataService.class)
@ConditionalOnProperty(prefix = "anran", value = "enabled", matchIfMissing = true)
public class AnranEnergyAutoConfiguration {
    private AnranEnergyProperties properties;

    @Autowired
    public AnranEnergyAutoConfiguration(AnranEnergyProperties properties) {
        this.properties = properties;
    }

    /**
     * 构造电费地理服务对象.
     *
     * @return 电费地理service
     */
    @Bean
    @ConditionalOnMissingBean(BaseDataService.class)
    public BaseDataService energyService() {
        final BaseDataServiceImpl energyService = new BaseDataServiceImpl();
        AnranConfig anranConfig = new AnranConfig();
        anranConfig.setCsrfToken(StringUtils.trimToNull(this.properties.getCsrfToken()));
        anranConfig.setSession(StringUtils.trimToNull(this.properties.getSession()));

        energyService.setConfig(anranConfig);
        return energyService;
    }
}
