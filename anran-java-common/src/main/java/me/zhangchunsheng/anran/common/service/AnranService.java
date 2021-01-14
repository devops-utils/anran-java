package me.zhangchunsheng.anran.common.service;

import me.zhangchunsheng.anran.common.config.AnranConfig;
import me.zhangchunsheng.anran.common.exception.AnranException;

import java.util.Map;

/**
 * <pre>
 * 电费
 * Created by Chunsheng Zhang on 2021/01/14.
 *
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public interface AnranService {

    /**
     * 获取电费请求url前缀
     *
     * @return the anran base url
     */
    String getBaseUrl();

    /**
     * 获取电费请求url前缀
     *
     * @return the energy base url
     */
    String getEnergyBaseUrl();

    public AnranConfig getConfig();

    public void setConfig(AnranConfig config);

    public byte[] postForBytes(String url, String requestStr) throws AnranException;

    public String post(String url, String requestStr) throws AnranException;

    public String post(String url, Map<String, Object> params) throws AnranException;

    public String get(String url) throws AnranException;

}
