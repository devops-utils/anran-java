package com.github.zhangchunsheng.anranenergy.bean.result;

import com.github.zhangchunsheng.anranenergy.util.json.AnranGsonBuilder;
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
public class QueryReportInfoResult extends BaseAnranResult {
    private static final long serialVersionUID = -1707576958339934210L;

    @SerializedName("pageDataListMap")
    private List<PageDataListMap> pageDataListMap;

    private String totalDataRowNum;

    /**
     * private String WU_GX;
     *       private String LT_5G_USE_NUM;
     *       private String FSUID;
     *       private String USE_NUM;
     *       private String USE_DATE;
     *       private String TUO_ZHAN_ELEC;
     *       private String DX_5G_USE_NUM;
     *       private String OPERATORS_NAME;
     *       private String JIAOLIU_USE_ELEC;
     *       private String IS_HAS_AIR;
     *       private String POWER_SUPPLY_TYPE;
     *       private String HB_STATUS;
     *       private String SHICE_EVN;
     *       private String BASE_STATION_CITY_NAME;
     *       private String EVN_COEFFICIENT;
     *       private String DATA_INFO;
     *       private String DS;
     *       private String YIDONG_USE_NUM;
     *       private String AIR_USE_ELEC;
     *       private String STATUS;
     *       private String BASE_STATION_NAME;
     *       private String YD_5G_USE_NUM;
     *       private String ROOM_NAME;
     *       private String PROVINCE_ID;
     *       private String YD_CK;
     *       private String CREATE_TIME;
     *       private String JIAO_LIU_SOURCE;
     *       private String REASON;
     *       private String LIANTONG_USE_NUM;
     *       private String NET_TYPE;
     *       private String BASE_STATION_AREA_NAME;
     *       private String ZI_LIU_ZS;
     *       private String VAL_SOURCE;
     *       private String ROOM_CODE;
     *       private String WUYE_JIAOFEI_ELEC;
     *       private String TYPEIN_ELEC;
     *       private String DIANXIN_USE_NUM;
     *       private String CHAO_BIAO_ELEC;
     *       private String OPERATOR_ID;
     *       private String AVG_CURRENT;
     *       private String BASE_STATION_CODE;
     *       private String STATION_STATUS;
     *       private String DS_INFO;
     *       private String BASE_STATION_ID;
     *       private String STATION_TYPE;
     *       "DATAROWNUM": "1"
     */
    @Data
    public static class PageDataListMap {
        private String WU_GX;
        private String LT_5G_USE_NUM;
        private String FSUID;
        private String USE_NUM;
        private String USE_DATE;
        private String TUO_ZHAN_ELEC;
        private String DX_5G_USE_NUM;
        private String OPERATORS_NAME;
        private String JIAOLIU_USE_ELEC;
        private String IS_HAS_AIR;
        private String POWER_SUPPLY_TYPE;
        private String HB_STATUS;
        private String SHICE_EVN;
        private String BASE_STATION_CITY_NAME;
        private String EVN_COEFFICIENT;
        private String DATA_INFO;
        private String DS;
        private String YIDONG_USE_NUM;
        private String AIR_USE_ELEC;
        private String STATUS;
        private String BASE_STATION_NAME;
        private String YD_5G_USE_NUM;
        private String ROOM_NAME;
        private String PROVINCE_ID;
        private String YD_CK;
        private String CREATE_TIME;
        private String JIAO_LIU_SOURCE;
        private String REASON;
        private String LIANTONG_USE_NUM;
        private String NET_TYPE;
        private String BASE_STATION_AREA_NAME;
        private String ZI_LIU_ZS;
        private String VAL_SOURCE;
        private String ROOM_CODE;
        private String WUYE_JIAOFEI_ELEC;
        private String TYPEIN_ELEC;
        private String DIANXIN_USE_NUM;
        private String CHAO_BIAO_ELEC;
        private String OPERATOR_ID;
        private String AVG_CURRENT;
        private String BASE_STATION_CODE;
        private String STATION_STATUS;
        private String DS_INFO;
        private String BASE_STATION_ID;
        private String STATION_TYPE;
        private String DATAROWNUM;
    }

    public static QueryReportInfoResult fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, QueryReportInfoResult.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }

}
