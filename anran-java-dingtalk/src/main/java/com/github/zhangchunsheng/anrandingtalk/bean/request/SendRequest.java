package com.github.zhangchunsheng.anrandingtalk.bean.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.anran.common.bean.request.BaseAnranRequest;
import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
public class SendRequest extends BaseAnranRequest {
    private static final long serialVersionUID = -1707576158339934210L;

    /**
     * {"msgtype": "text","text": {"content": "我就是我, 是不一样的烟火"}}
     */
    private String     msgtype;
    private Text     text;

    @Data
    public static class Text {
        private String content;
    }

    public static SendRequest fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, SendRequest.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
