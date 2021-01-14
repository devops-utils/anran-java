package me.zhangchunsheng.anran.common.bean.request;

import lombok.Data;
import me.zhangchunsheng.anran.common.bean.result.BaseAnranResult;
import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;

@Data
public class BaseAnranRequest {
    private static final long serialVersionUID = 2020652152614850904L;

    public static BaseAnranRequest fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, BaseAnranRequest.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
