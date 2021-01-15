package me.zhangchunsheng.anran.common.config;

import lombok.Data;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.URL;
import java.security.KeyStore;

/**
 * 电费配置
 *
 * @author Chunsheng Zhang (https://github.com/zhangchunsheng)
 */
@Data
public class AnranConfig {
    protected static final String DEFAULT_BASE_URL = "http://180.153.49.94:50080";

    /**
     * 电费接口请求地址域名部分.
     */
    private String baseUrl = DEFAULT_BASE_URL;

    /**
     * 电费接口请求地址域名部分.
     */
    private String energyBaseUrl = DEFAULT_BASE_URL;

    /**
     * http请求连接超时时间.
     */
    private int httpConnectionTimeout = 5000;

    /**
     * http请求数据读取等待时间.
     */
    private int httpTimeout = 20000;

    /**
     * 电费csrfToken.
     */
    private String csrfToken;

    /**
     * 电费session.
     */
    private String session;

    /**
     * 是否将接口请求日志信息保存到threadLocal中.
     * 默认不保存
     */
    private boolean ifSaveApiData = false;

    private String httpProxyHost;
    private Integer httpProxyPort;
    private String httpProxyUsername;
    private String httpProxyPassword;

    /**
     * 返回所设置的电费接口请求地址域名.
     *
     * @return 电费接口请求地址域名
     */
    public String getBaseUrl() {
        if (StringUtils.isEmpty(this.baseUrl)) {
            return DEFAULT_BASE_URL;
        }

        return this.baseUrl;
    }

    /**
     * 返回所设置的电费接口请求地址域名.
     *
     * @return 电费接口请求地址域名
     */
    public String getEnergyBaseUrl() {
        if (StringUtils.isEmpty(this.baseUrl)) {
            return DEFAULT_BASE_URL;
        }

        return this.baseUrl;
    }
}
