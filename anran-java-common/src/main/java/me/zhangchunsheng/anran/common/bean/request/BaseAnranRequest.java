package me.zhangchunsheng.anran.common.bean.request;

import me.zhangchunsheng.anran.common.bean.result.BaseAnranResult;
import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;

public class BaseAnranRequest {
    public static BaseAnranRequest fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, BaseAnranRequest.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
