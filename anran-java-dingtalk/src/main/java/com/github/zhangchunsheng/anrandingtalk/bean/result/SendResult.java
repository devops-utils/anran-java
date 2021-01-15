package com.github.zhangchunsheng.anrandingtalk.bean.result;

import com.github.zhangchunsheng.anrandingtalk.util.json.AnranGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.anran.common.bean.result.BaseAnranResult;

import java.util.List;

/**
 * <pre>
 * 产品总类结果对象类
 * Created by Chunsheng Zhang on 2020/7/18.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SendResult extends BaseAnranResult {
    private static final long serialVersionUID = -1707576958339934210L;

    public static SendResult fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, SendResult.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }

}
