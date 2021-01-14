package com.github.zhangchunsheng.spring.starter.anranjava.energy.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <pre>
 *  电费属性配置类
 *  Created by Chunsheng Zhang on 2021/01/14.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
@ConfigurationProperties(prefix = "anran")
public class AnranEnergyProperties {
  /**
   * 电费csrfToken.
   */
  private String csrfToken;

  private String session;
}
