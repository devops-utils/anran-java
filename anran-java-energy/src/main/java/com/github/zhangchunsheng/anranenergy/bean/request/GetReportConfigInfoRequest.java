package com.github.zhangchunsheng.anranenergy.bean.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.anran.common.bean.request.BaseAnranRequest;
import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetReportConfigInfoRequest extends BaseAnranRequest {
    private static final long serialVersionUID = -1707676158339934210L;

    /**
     * reportId: "A4F3D73225F9F343E0533D801DAC45B9"
     */
    private String     reportId;

    public static GetReportConfigInfoRequest fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, GetReportConfigInfoRequest.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
