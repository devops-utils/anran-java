package com.github.zhangchunsheng.anranenergy.bean.result.common;

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

        public String getWU_GX() {
            return WU_GX;
        }

        public void setWU_GX(String WU_GX) {
            this.WU_GX = WU_GX;
        }

        public String getLT_5G_USE_NUM() {
            return LT_5G_USE_NUM;
        }

        public void setLT_5G_USE_NUM(String LT_5G_USE_NUM) {
            this.LT_5G_USE_NUM = LT_5G_USE_NUM;
        }

        public String getFSUID() {
            return FSUID;
        }

        public void setFSUID(String FSUID) {
            this.FSUID = FSUID;
        }

        public String getUSE_NUM() {
            return USE_NUM;
        }

        public void setUSE_NUM(String USE_NUM) {
            this.USE_NUM = USE_NUM;
        }

        public String getUSE_DATE() {
            return USE_DATE;
        }

        public void setUSE_DATE(String USE_DATE) {
            this.USE_DATE = USE_DATE;
        }

        public String getTUO_ZHAN_ELEC() {
            return TUO_ZHAN_ELEC;
        }

        public void setTUO_ZHAN_ELEC(String TUO_ZHAN_ELEC) {
            this.TUO_ZHAN_ELEC = TUO_ZHAN_ELEC;
        }

        public String getDX_5G_USE_NUM() {
            return DX_5G_USE_NUM;
        }

        public void setDX_5G_USE_NUM(String DX_5G_USE_NUM) {
            this.DX_5G_USE_NUM = DX_5G_USE_NUM;
        }

        public String getOPERATORS_NAME() {
            return OPERATORS_NAME;
        }

        public void setOPERATORS_NAME(String OPERATORS_NAME) {
            this.OPERATORS_NAME = OPERATORS_NAME;
        }

        public String getJIAOLIU_USE_ELEC() {
            return JIAOLIU_USE_ELEC;
        }

        public void setJIAOLIU_USE_ELEC(String JIAOLIU_USE_ELEC) {
            this.JIAOLIU_USE_ELEC = JIAOLIU_USE_ELEC;
        }

        public String getIS_HAS_AIR() {
            return IS_HAS_AIR;
        }

        public void setIS_HAS_AIR(String IS_HAS_AIR) {
            this.IS_HAS_AIR = IS_HAS_AIR;
        }

        public String getPOWER_SUPPLY_TYPE() {
            return POWER_SUPPLY_TYPE;
        }

        public void setPOWER_SUPPLY_TYPE(String POWER_SUPPLY_TYPE) {
            this.POWER_SUPPLY_TYPE = POWER_SUPPLY_TYPE;
        }

        public String getHB_STATUS() {
            return HB_STATUS;
        }

        public void setHB_STATUS(String HB_STATUS) {
            this.HB_STATUS = HB_STATUS;
        }

        public String getSHICE_EVN() {
            return SHICE_EVN;
        }

        public void setSHICE_EVN(String SHICE_EVN) {
            this.SHICE_EVN = SHICE_EVN;
        }

        public String getBASE_STATION_CITY_NAME() {
            return BASE_STATION_CITY_NAME;
        }

        public void setBASE_STATION_CITY_NAME(String BASE_STATION_CITY_NAME) {
            this.BASE_STATION_CITY_NAME = BASE_STATION_CITY_NAME;
        }

        public String getEVN_COEFFICIENT() {
            return EVN_COEFFICIENT;
        }

        public void setEVN_COEFFICIENT(String EVN_COEFFICIENT) {
            this.EVN_COEFFICIENT = EVN_COEFFICIENT;
        }

        public String getDATA_INFO() {
            return DATA_INFO;
        }

        public void setDATA_INFO(String DATA_INFO) {
            this.DATA_INFO = DATA_INFO;
        }

        public String getDS() {
            return DS;
        }

        public void setDS(String DS) {
            this.DS = DS;
        }

        public String getYIDONG_USE_NUM() {
            return YIDONG_USE_NUM;
        }

        public void setYIDONG_USE_NUM(String YIDONG_USE_NUM) {
            this.YIDONG_USE_NUM = YIDONG_USE_NUM;
        }

        public String getAIR_USE_ELEC() {
            return AIR_USE_ELEC;
        }

        public void setAIR_USE_ELEC(String AIR_USE_ELEC) {
            this.AIR_USE_ELEC = AIR_USE_ELEC;
        }

        public String getSTATUS() {
            return STATUS;
        }

        public void setSTATUS(String STATUS) {
            this.STATUS = STATUS;
        }

        public String getBASE_STATION_NAME() {
            return BASE_STATION_NAME;
        }

        public void setBASE_STATION_NAME(String BASE_STATION_NAME) {
            this.BASE_STATION_NAME = BASE_STATION_NAME;
        }

        public String getYD_5G_USE_NUM() {
            return YD_5G_USE_NUM;
        }

        public void setYD_5G_USE_NUM(String YD_5G_USE_NUM) {
            this.YD_5G_USE_NUM = YD_5G_USE_NUM;
        }

        public String getROOM_NAME() {
            return ROOM_NAME;
        }

        public void setROOM_NAME(String ROOM_NAME) {
            this.ROOM_NAME = ROOM_NAME;
        }

        public String getPROVINCE_ID() {
            return PROVINCE_ID;
        }

        public void setPROVINCE_ID(String PROVINCE_ID) {
            this.PROVINCE_ID = PROVINCE_ID;
        }

        public String getYD_CK() {
            return YD_CK;
        }

        public void setYD_CK(String YD_CK) {
            this.YD_CK = YD_CK;
        }

        public String getCREATE_TIME() {
            return CREATE_TIME;
        }

        public void setCREATE_TIME(String CREATE_TIME) {
            this.CREATE_TIME = CREATE_TIME;
        }

        public String getJIAO_LIU_SOURCE() {
            return JIAO_LIU_SOURCE;
        }

        public void setJIAO_LIU_SOURCE(String JIAO_LIU_SOURCE) {
            this.JIAO_LIU_SOURCE = JIAO_LIU_SOURCE;
        }

        public String getREASON() {
            return REASON;
        }

        public void setREASON(String REASON) {
            this.REASON = REASON;
        }

        public String getLIANTONG_USE_NUM() {
            return LIANTONG_USE_NUM;
        }

        public void setLIANTONG_USE_NUM(String LIANTONG_USE_NUM) {
            this.LIANTONG_USE_NUM = LIANTONG_USE_NUM;
        }

        public String getNET_TYPE() {
            return NET_TYPE;
        }

        public void setNET_TYPE(String NET_TYPE) {
            this.NET_TYPE = NET_TYPE;
        }

        public String getBASE_STATION_AREA_NAME() {
            return BASE_STATION_AREA_NAME;
        }

        public void setBASE_STATION_AREA_NAME(String BASE_STATION_AREA_NAME) {
            this.BASE_STATION_AREA_NAME = BASE_STATION_AREA_NAME;
        }

        public String getZI_LIU_ZS() {
            return ZI_LIU_ZS;
        }

        public void setZI_LIU_ZS(String ZI_LIU_ZS) {
            this.ZI_LIU_ZS = ZI_LIU_ZS;
        }

        public String getVAL_SOURCE() {
            return VAL_SOURCE;
        }

        public void setVAL_SOURCE(String VAL_SOURCE) {
            this.VAL_SOURCE = VAL_SOURCE;
        }

        public String getROOM_CODE() {
            return ROOM_CODE;
        }

        public void setROOM_CODE(String ROOM_CODE) {
            this.ROOM_CODE = ROOM_CODE;
        }

        public String getWUYE_JIAOFEI_ELEC() {
            return WUYE_JIAOFEI_ELEC;
        }

        public void setWUYE_JIAOFEI_ELEC(String WUYE_JIAOFEI_ELEC) {
            this.WUYE_JIAOFEI_ELEC = WUYE_JIAOFEI_ELEC;
        }

        public String getTYPEIN_ELEC() {
            return TYPEIN_ELEC;
        }

        public void setTYPEIN_ELEC(String TYPEIN_ELEC) {
            this.TYPEIN_ELEC = TYPEIN_ELEC;
        }

        public String getDIANXIN_USE_NUM() {
            return DIANXIN_USE_NUM;
        }

        public void setDIANXIN_USE_NUM(String DIANXIN_USE_NUM) {
            this.DIANXIN_USE_NUM = DIANXIN_USE_NUM;
        }

        public String getCHAO_BIAO_ELEC() {
            return CHAO_BIAO_ELEC;
        }

        public void setCHAO_BIAO_ELEC(String CHAO_BIAO_ELEC) {
            this.CHAO_BIAO_ELEC = CHAO_BIAO_ELEC;
        }

        public String getOPERATOR_ID() {
            return OPERATOR_ID;
        }

        public void setOPERATOR_ID(String OPERATOR_ID) {
            this.OPERATOR_ID = OPERATOR_ID;
        }

        public String getAVG_CURRENT() {
            return AVG_CURRENT;
        }

        public void setAVG_CURRENT(String AVG_CURRENT) {
            this.AVG_CURRENT = AVG_CURRENT;
        }

        public String getBASE_STATION_CODE() {
            return BASE_STATION_CODE;
        }

        public void setBASE_STATION_CODE(String BASE_STATION_CODE) {
            this.BASE_STATION_CODE = BASE_STATION_CODE;
        }

        public String getSTATION_STATUS() {
            return STATION_STATUS;
        }

        public void setSTATION_STATUS(String STATION_STATUS) {
            this.STATION_STATUS = STATION_STATUS;
        }

        public String getDS_INFO() {
            return DS_INFO;
        }

        public void setDS_INFO(String DS_INFO) {
            this.DS_INFO = DS_INFO;
        }

        public String getBASE_STATION_ID() {
            return BASE_STATION_ID;
        }

        public void setBASE_STATION_ID(String BASE_STATION_ID) {
            this.BASE_STATION_ID = BASE_STATION_ID;
        }

        public String getSTATION_TYPE() {
            return STATION_TYPE;
        }

        public void setSTATION_TYPE(String STATION_TYPE) {
            this.STATION_TYPE = STATION_TYPE;
        }

        public String getDATAROWNUM() {
            return DATAROWNUM;
        }

        public void setDATAROWNUM(String DATAROWNUM) {
            this.DATAROWNUM = DATAROWNUM;
        }
    }

    public static QueryReportInfoResult fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, QueryReportInfoResult.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }

}
