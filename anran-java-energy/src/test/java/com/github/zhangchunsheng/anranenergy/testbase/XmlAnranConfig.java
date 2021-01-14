package com.github.zhangchunsheng.anranenergy.testbase;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import me.zhangchunsheng.anran.common.config.AnranConfig;

/**
 * The type Xml anran config.
 */
@XStreamAlias("xml")
public class XmlAnranConfig extends AnranConfig {
    private String csrfToken;
    private String session;

    @Override
    public String getCsrfToken() {
        return csrfToken;
    }

    @Override
    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    @Override
    public String getSession() {
        return session;
    }

    @Override
    public void setSession(String session) {
        this.session = session;
    }

}
