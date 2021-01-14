package com.github.zhangchunsheng.anranenergy.bean.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.anran.common.bean.request.BaseAnranRequest;
import me.zhangchunsheng.anran.common.util.json.AnranGsonBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
public class QueryReportInfoRequest extends BaseAnranRequest {
    private static final long serialVersionUID = -1707576158339934210L;

    /**
     * AREA_ID: "1935"
     * END_USE_DATE: "2021-01-12"
     * IS_SHARE: "3"
     * START_USE_DATE: "2021-01-11"
     * areaIdHidden: "3"
     * areaLevel: "3"
     * endRow: 40
     * page: 2
     * privCode: "A4F3D73225F9F343E0533D801DAC45B9"
     * provinceId: "1935"
     * provinceIdHidden: "1935"
     * reportId: "A4F3D73225F9F343E0533D801DAC45B9"
     * reportName: "电量计量"
     * startRow: 20
     */
    private String     AREA_ID;
    private String     END_USE_DATE;
    private String     IS_SHARE;
    private String     START_USE_DATE;
    private String     areaIdHidden;
    private String     areaLevel;
    private int        endRow;
    private int        page;
    private String     privCode;
    private String     provinceId;
    private String     provinceIdHidden;
    private String     reportId;
    private String     reportName;
    private int        startRow;

    public static QueryReportInfoRequest fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, QueryReportInfoRequest.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }
}
