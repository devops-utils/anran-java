package me.zhangchunsheng.anran.common.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import me.zhangchunsheng.anran.common.bean.AnranApiData;
import me.zhangchunsheng.anran.common.exception.AnranException;
import org.apache.commons.lang3.StringUtils;

import jodd.http.HttpConnectionProvider;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.http.ProxyInfo;
import jodd.http.ProxyInfo.ProxyType;
import jodd.http.net.SocketHttpConnectionProvider;
import jodd.util.Base64;
import org.apache.http.NameValuePair;

/**
 * 电费请求实现类，jodd-http实现.
 * Created by Chunsheng Zhang on 2021/01/14.
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class AnranServiceJoddHttpImpl extends BaseServiceImpl {
    @Override
    public byte[] postForBytes(String url, String requestStr) throws AnranException {
        try {
            HttpRequest request = this.buildHttpRequest(url, requestStr);
            byte[] responseBytes = request.send().bodyBytes();
            final String responseString = Base64.encodeToString(responseBytes);
            this.log.info("\n【请求地址】：{}\n【请求数据】：{}\n【响应数据(Base64编码后)】：{}", url, requestStr, responseString);
            if (this.getConfig().isIfSaveApiData()) {
                anranApiData.set(new AnranApiData(url, requestStr, responseString, null));
            }
            return responseBytes;
        } catch (Exception e) {
            this.log.error("\n【请求地址】：{}\n【请求数据】：{}\n【异常信息】：{}", url, requestStr, e.getMessage());
            anranApiData.set(new AnranApiData(url, requestStr, null, e.getMessage()));
            throw new AnranException(e.getMessage(), e);
        }
    }

    @Override
    public String post(String url, String requestStr) throws AnranException {
        try {
            HttpRequest request = this.buildHttpRequest(url, requestStr);
            String responseString = this.getResponseString(request.send());

            this.log.info("\n【请求地址】：{}\n【请求数据】：{}\n【响应数据】：{}", url, requestStr, responseString);
            if (this.getConfig().isIfSaveApiData()) {
                anranApiData.set(new AnranApiData(url, requestStr, responseString, null));
            }
            return responseString;
        } catch (Exception e) {
            this.log.error("\n【请求地址】：{}\n【请求数据】：{}\n【异常信息】：{}", url, requestStr, e.getMessage());
            anranApiData.set(new AnranApiData(url, requestStr, null, e.getMessage()));
            throw new AnranException(e.getMessage(), e);
        }
    }

    @Override
    public String post(String url, Map<String, Object> params) throws AnranException {
        String requestStr = AnranServiceJoddHttpImpl.getUrlParams(params);
        return this.post(url, requestStr);
    }

    @Override
    public String postJson(String url, String requestStr) throws AnranException {
        try {
            HttpRequest request = this.buildHttpRequest(url, requestStr);
            String responseString = this.getResponseString(request.send());

            this.log.info("\n【请求地址】：{}\n【请求数据】：{}\n【响应数据】：{}", url, requestStr, responseString);
            if (this.getConfig().isIfSaveApiData()) {
                anranApiData.set(new AnranApiData(url, requestStr, responseString, null));
            }
            return responseString;
        } catch (Exception e) {
            this.log.error("\n【请求地址】：{}\n【请求数据】：{}\n【异常信息】：{}", url, requestStr, e.getMessage());
            anranApiData.set(new AnranApiData(url, requestStr, null, e.getMessage()));
            throw new AnranException(e.getMessage(), e);
        }
    }

    @Override
    public String postJson(String url, String csrfToken, String session, String requestStr) throws AnranException {
        try {
            HttpRequest request = this.buildHttpRequest(url, requestStr);
            String responseString = this.getResponseString(request.send());

            this.log.info("\n【请求地址】：{}\n【请求数据】：{}\n【响应数据】：{}", url, requestStr, responseString);
            if (this.getConfig().isIfSaveApiData()) {
                anranApiData.set(new AnranApiData(url, requestStr, responseString, null));
            }
            return responseString;
        } catch (Exception e) {
            this.log.error("\n【请求地址】：{}\n【请求数据】：{}\n【异常信息】：{}", url, requestStr, e.getMessage());
            anranApiData.set(new AnranApiData(url, requestStr, null, e.getMessage()));
            throw new AnranException(e.getMessage(), e);
        }
    }

    @Override
    public String get(String url) throws AnranException {
        try {
            HttpRequest request = this.buildHttpGet(url);
            String responseString = this.getResponseString(request.send());

            this.log.info("\n【请求地址】：{}\n【请求数据】：{}\n【响应数据】：{}", url, "", responseString);
            if (this.getConfig().isIfSaveApiData()) {
                anranApiData.set(new AnranApiData(url, "", responseString, null));
            }
            return responseString;
        } catch (Exception e) {
            this.log.error("\n【请求地址】：{}\n【请求数据】：{}\n【异常信息】：{}", url, "", e.getMessage());
            anranApiData.set(new AnranApiData(url, "", null, e.getMessage()));
            throw new AnranException(e.getMessage(), e);
        }
    }

    private HttpRequest buildHttpRequest(String url, String requestStr) throws AnranException {
        HttpRequest request = HttpRequest
                .post(url)
                .timeout(this.getConfig().getHttpTimeout())
                .connectionTimeout(this.getConfig().getHttpConnectionTimeout())
                .bodyText(requestStr);

        if (StringUtils.isNotBlank(this.getConfig().getHttpProxyHost()) && this.getConfig().getHttpProxyPort() > 0) {
            if (StringUtils.isEmpty(this.getConfig().getHttpProxyUsername())) {
                this.getConfig().setHttpProxyUsername("whatever");
            }

            ProxyInfo httpProxy = new ProxyInfo(ProxyType.HTTP, this.getConfig().getHttpProxyHost(), this.getConfig().getHttpProxyPort(),
                    this.getConfig().getHttpProxyUsername(), this.getConfig().getHttpProxyPassword());
            HttpConnectionProvider provider = request.connectionProvider();
            if (null == provider) {
                provider = new SocketHttpConnectionProvider();
            }
            provider.useProxy(httpProxy);
            request.withConnectionProvider(provider);
        }
        return request;
    }

    private HttpRequest buildHttpGet(String url) throws AnranException {
        HttpRequest request = HttpRequest
                .get(url)
                .timeout(this.getConfig().getHttpTimeout())
                .connectionTimeout(this.getConfig().getHttpConnectionTimeout());

        if (StringUtils.isNotBlank(this.getConfig().getHttpProxyHost()) && this.getConfig().getHttpProxyPort() > 0) {
            if (StringUtils.isEmpty(this.getConfig().getHttpProxyUsername())) {
                this.getConfig().setHttpProxyUsername("whatever");
            }

            ProxyInfo httpProxy = new ProxyInfo(ProxyType.HTTP, this.getConfig().getHttpProxyHost(), this.getConfig().getHttpProxyPort(),
                    this.getConfig().getHttpProxyUsername(), this.getConfig().getHttpProxyPassword());
            HttpConnectionProvider provider = request.connectionProvider();
            if (null == provider) {
                provider = new SocketHttpConnectionProvider();
            }
            provider.useProxy(httpProxy);
            request.withConnectionProvider(provider);
        }
        return request;
    }

    private String getResponseString(HttpResponse response) throws AnranException {
        try {
            this.log.debug("【神州服务器响应头信息】：\n{}", response.toString(false));
        } catch (NullPointerException e) {
            this.log.warn("HttpResponse.toString() 居然抛出空指针异常了", e);
        }

        String responseString = response.bodyText();

        if (StringUtils.isBlank(responseString)) {
            throw new AnranException("响应信息为空");
        }

        if (StringUtils.isBlank(response.charset())) {
            responseString = new String(responseString.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        }

        return responseString;
    }


}
