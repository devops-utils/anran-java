package me.zhangchunsheng.anran.common.bean.result;

import java.io.Serializable;

import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;
import org.apache.commons.lang3.StringUtils;

import lombok.Data;

/**
 * <pre>
 * 电费结果共用属性类.
 * Created by Chunsheng Zhang on 2021/01/14.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
public abstract class BaseAnranResult implements Serializable {
    private static final long serialVersionUID = 2020652152604850904L;
    protected boolean isSuccess;
    //{"errcode":0,"errmsg":"ok"}
    protected int errcode;
    protected String errmsg;

    /**
     * 请求是否成功.
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    public static BaseAnranResult fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, BaseAnranResult.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
