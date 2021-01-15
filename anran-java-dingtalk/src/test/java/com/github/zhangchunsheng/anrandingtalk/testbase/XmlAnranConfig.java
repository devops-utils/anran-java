package com.github.zhangchunsheng.anrandingtalk.testbase;

import com.github.zhangchunsheng.anrandingtalk.config.DingtalkConfig;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import me.zhangchunsheng.anran.common.config.AnranConfig;

/**
 * The type Xml anran config.
 */
@XStreamAlias("xml")
public class XmlAnranConfig extends DingtalkConfig {
    private String accessToken;

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
