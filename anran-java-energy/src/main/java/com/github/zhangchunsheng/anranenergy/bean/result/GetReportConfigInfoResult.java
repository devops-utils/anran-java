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
public class GetReportConfigInfoResult extends BaseAnranResult {
    private static final long serialVersionUID = -1707676958339934210L;

    @SerializedName("userInfoMap")
    private UserInfoMap userInfoMap;

    @SerializedName("parInfo")
    private List<ParInfo> parInfo;

    @SerializedName("colInfo")
    private List<ColInfo> colInfo;

    @SerializedName("mainInfo")
    private List<MainInfo> mainInfo;

    @Data
    public static class UserInfoMap {
        private List<UserOrgTreeInfo> userOrgTreeInfo;

        /**
         * "code": "110000",
         *         "orgName": "北京分公司",
         *         "parentOrgId": "17",
         *         "orgCode": "110000",
         *         "pCode": "100000",
         *         "name": "北京分公司",
         *         "areaLevel": "3",
         *         "pId": "17",
         *         "id": "1935",
         *         "provinceId": "",
         *         "orgId": "1935"
         */
        @Data
        public static class UserOrgTreeInfo {
            private String code;
            private String orgName;
            private String parentOrgId;
            private String orgCode;
            private String pCode;
            private String name;
            private String areaLevel;
            private String pId;
            private String id;
            private String provinceId;
            private String orgId;
        }
    }

    /**
     * "DATA_RULE": null,
     *       "SORT_NUM": 1,
     *       "UPDATE_USER_CODE": null,
     *       "IS_MUST_VAL": "1",
     *       "WIDTH": null,
     *       "UPDATE_TIME": null,
     *       "DATA_RULE_SOURCE": "登陆用户组织",
     *       "P_ID": "A4F3D73225F9F343E0533D801DAC45B9",
     *       "PAR_CODE": "AREA_ID",
     *       "PAR_NAME": "区域",
     *       "DEFAULT_VAL": null,
     *       "IS_SHOW": 1,
     *       "CREATE_USER_NAME": "系统",
     *       "IS_MULTIPLE_SELECT": 0,
     *       "ID": "02361e515f544c598751380fe3ce852d",
     *       "CREATE_TIME": "2020-11-20 22:51:46.000",
     *       "UPDATE_USER_NAME": null,
     *       "LINKAGE": null,
     *       "DATA_TYPE": "VARCHAR2",
     *       "REMARK": null,
     *       "CREATE_USER_CODE": "16"
     */
    @Data
    public static class ParInfo {
        private String DATA_RULE;
        private int SORT_NUM;
        private String UPDATE_USER_CODE;
        private String IS_MUST_VAL;
        private String WIDTH;
        private String UPDATE_TIME;
        private String DATA_RULE_SOURCE;
        private String P_ID;
        private String PAR_CODE;
        private String PAR_NAME;
        private String DEFAULT_VAL;
        private int IS_SHOW;
        private String CREATE_USER_NAME;
        private int IS_MULTIPLE_SELECT;
        private String ID;
        private String CREATE_TIME;
        private String UPDATE_USER_NAME;
        private String LINKAGE;
        private String DATA_TYPE;
        private String REMARK;
        private String CREATE_USER_CODE;
    }

    /**
     * "COL_NAME": "站址id",
     *       "DATA_RULE": null,
     *       "SORT_NUM": 2,
     *       "PAGE_PANEL": null,
     *       "UPDATE_USER_CODE": null,
     *       "WIDTH": null,
     *       "DATA_RULE_SOURCE": null,
     *       "P_ID": "A4F3D73225F9F343E0533D801DAC45B9",
     *       "IS_MERGE": 0,
     *       "IS_SHOW": 0,
     *       "IS_EXPORT": 0,
     *       "ID": "82ac08494fb6494184741e51deaf3dcd",
     *       "CREATE_TIME": "2020-11-20 22:51:46.000",
     *       "IS_EDIT": 0,
     *       "DATA_TYPE": "VARCHAR2",
     *       "REMARK": null,
     *       "CREATE_USER_CODE": "16",
     *       "COL_CODE": "BASE_STATION_ID",
     *       "UPDATE_TIME": null,
     *       "DATA_DRILLING": null,
     *       "EDIT_RESULT": null,
     *       "DEFAULT_VAL": null,
     *       "CREATE_USER_NAME": "系统",
     *       "UPDATE_USER_NAME": null,
     *       "LINKAGE": null
     */
    @Data
    public static class ColInfo {
        private String COL_NAME;
        private String DATA_RULE;
        private int SORT_NUM;
        private String PAGE_PANEL;
        private String UPDATE_USER_CODE;
        private String WIDTH;
        private String DATA_RULE_SOURCE;
        private String P_ID;
        private int IS_MERGE;
        private int IS_SHOW;
        private int IS_EXPORT;
        private String ID;
        private String CREATE_TIME;
        private int IS_EDIT;
        private String DATA_TYPE;
        private String REMARK;
        private String CREATE_USER_CODE;
        private String COL_CODE;
        private String UPDATE_TIME;
        private String DATA_DRILLING;
        private String EDIT_RESULT;
        private String DEFAULT_VAL;
        private String CREATE_USER_NAME;
        private String UPDATE_USER_NAME;
        private String LINKAGE;
    }

    /**
     * "REPORT_TYPE": "能耗计量",
     *       "ORG_ID": "17",
     *       "C_ORG_NAME": "",
     *       "PAGE_PANEL": "",
     *       "REPORT_MOREFUNCTION": "{\"reportShowPage\":\"modules/dianLiangJiLiang/views/dianLiangJiLiang.js\",\"setGroupHeaders\":{\"useColSpanStyle\":\"true\",\"groupHeaders\":[{\"startColumnName\":\"VAL_SOURCE\",\"numberOfColumns\":12,\"titleText\":\"直流电量\"},{\"startColumnName\":\"JIAO_LIU_SOURCE\",\"numberOfColumns\":4,\"titleText\":\"交流电量\"}]}}",
     *       "REPORT_CODE": "",
     *       "UPDATE_USER_CODE": "16",
     *       "P_ORG_ID": "",
     *       "STATUS": "1",
     *       "MAIL": "",
     *       "REPORT_NAME": "电量计量(新)",
     *       "ID": "A4F3D73225F9F343E0533D801DAC45B9",
     *       "CREATE_TIME": "2020-05-05 10:51:01",
     *       "REMARK": "    数据状态：\n    1.待校验：能耗默认数据状态是未校验，会根据运监的稽核数据进行更新，如运监无稽核数据，则继续默认待校验。\n    2.换表待回填：当能耗检测运营商电量当日电量超过1000或者小于0时\n    3.故障待补全：同步运监的数据稽核，发现该站被标记为故障时\n    4.待回传：表示当天数据能耗没有获取到，需下次继续同步\n    5.换表已补全：表示系统已自动根据历史数据将“换表待回填”数据补全，补全规则：该站前两日数据状态为“可用”或“待校验”的数据对应字段的平均值\n    6.故障已补全：表示系统已自动根据历史数据将“换表待回填”数据补全，补全规则：该站前两日数据状态为“可用”或“待校验”的数据对应字段的平均值\n    7.可用：通过运监数据稽核。\n    问题原因：\n    1) 电流异常：基站上各开关电源负载电流总和与各分路计量设备（包括三个）租户电流总和误差小于5%或3A，逐点校验每日两个及以上满足校验条件为电流正常，否则判断电流异常。如果省公司标记了无电流校验，则该站址下的分路计量设备不做电流校验，标记为准确。\n    2) 电压异常：分路计量设备直流输出电压（0445107001）值在-42V到-58V，每日50%以上数据点满足要求，判断电压数据正常，否则判断电压数据异常。\n    3) 电量数据异常：分路计量设备各租户电量应正向增长，每日各点数据出现3次及以上电量负增长或大于50A，责判断分路计量电量数据异常。\n    4) 租户判断异常：上报非零电流的租户与CRM系统维护的一致则判断正常。如果省公司标记了无租户校验，则该站址下的分路计量设备不做租户判断异常校验，标为准确。移动/联通/电信租户电流（0445101001）上报电流值大于0，和crm系统维护的一致，则判断正常。三个都正常了则判断正常，否则判断异常。\n注：其中’故障待补全‘需去运监系统’资源管理/数据稽核/分路计量设备‘查看问题原因",
     *       "CREATE_USER_CODE": "16",
     *       "C_ORG_ID": "",
     *       "IS_EXCEL_PUB": "",
     *       "A_ORG_ID": "",
     *       "ORG_NAME": "中国铁塔股份有限公司",
     *       "IS_TIME_USER_SELF_PAR": "",
     *       "DATA_LAST_TIME": "",
     *       "A_ORG_NAME": "",
     *       "IS_TIME": "",
     *       "UPDATE_TIME": "2020-11-20 22:51:45",
     *       "P_ORG_NAME": "",
     *       "SQL_TEXT": "select \nt.USE_DATE,\nt.STATION_ID as BASE_STATION_ID,\nt.PROVINCE_ID,\nt.STATION_NAME as BASE_STATION_NAME,\nt.STATION_CODE as BASE_STATION_CODE,\nt.CITY_NAME as BASE_STATION_CITY_NAME,\nt.AREA_NAME as BASE_STATION_AREA_NAME,\nt.OPERATOR_NAME as OPERATORS_NAME,\nt.OPERATOR_id,\nt.ROOM_CODE ,\nt.ROOM_NAME ,\nt.FSUID as FSUID,\nt.BIAOCHENG_EVN as EVN_COEFFICIENT, \nt.SHICE_EVN,\nt.AVG_CURRENT ,\nt.USE_NUM as USE_NUM,\nt.YD_USE_NUM as YIDONG_USE_NUM,\nt.LT_USE_NUM as LIANTONG_USE_NUM,\nt.DX_USE_NUM as DIANXIN_USE_NUM,\nt.ZI_LIU_ZS,\nt.TYPEIN_ELEC as TYPEIN_ELEC,\nt.TUO_ZHAN_ELEC,\nt.CHAO_BIAO_ELEC ,\nt.WUYE_JIAOFEI_ELEC,\nt.JIAOLIU_USE_ELEC as JIAOLIU_USE_ELEC,\nt.AIR_USE_ELEC as AIR_USE_ELEC,\nt.ROOM_TYPE as NET_TYPE,\nt.IS_HAS_AIR ,\nt.VAL_SOURCE,\nt.DATA_INFO,\nt.CREATE_TIME,\nt.POWER_SUPPLY_TYPE,\nround(nvl(nvl(t.USE_NUM,t.ZI_LIU_ZS),t.TYPEIN_ELEC)*t.BIAOCHENG_EVN,2)as yd_ck,\ncase when t.CHAO_BIAO_ELEC is not null then '抄表平台' when t.JIAOLIU_USE_ELEC is not null then 'FSU采集' else null end as JIAO_LIU_SOURCE,\nt.YD_5G_USE_NUM,t.LT_5G_USE_NUM,t.DX_5G_USE_NUM,t.WU_GX,t.DS,t.DS_INFO,t.HB_STATUS,\nt.status,\nt.STATION_STATUS,\nt.STATION_TYPE,\nt.REASON\nfrom EN_STATION_DAY_SUM t \nwhere 1=1\n <isEqual compareValue=\"2\" property=\"areaLevel\">\n AND (17={AREA_ID})\n </isEqual> \n AND t.PROVINCE_ID=(select org_id from (\nselect org_id,org_type\n from bfm_org\n start with org_id = {AREA_ID}\n connect by prior parent_org_id = org_id) where org_type='3')\n<isNotNull property = \"START_USE_DATE\">\nAND t.USE_DATE >=replace( '{START_USE_DATE} ', '-' , '' )\n</isNotNull>\n<isNotNull property = \"END_USE_DATE\">\nAND t.USE_DATE < replace( '{END_USE_DATE}' , '-' , '' )\n</isNotNull>\n <isEqual compareValue=\"4\" property=\"areaLevel\">\n AND t.CITY_ID={AREA_ID} \n </isEqual>\n <isEqual compareValue=\"5\" property=\"areaLevel\">\n AND t.AREA_ID={AREA_ID} \n </isEqual>\n<isNotNull property = \"STATION_CODE\">\nAND t.STATION_CODE='{STATION_CODE}'\n</isNotNull>\n<isNotNull property = \"STATION_NAME\">\nAND t.STATION_NAME like '%{STATION_NAME}%'\n</isNotNull>\n<isNotNull property = \"NET_TYPE\">\nAND t.ROOM_TYPE='{NET_TYPE}'\n</isNotNull>\n<isNotNull property = \"AIR_CONDITION_CONFIG\">\nAND t.IS_HAS_AIR='{AIR_CONDITION_CONFIG}'\n</isNotNull>\n<isNotNull property = \"USE_NUM1\">\nAND t.USE_NUM >= {USE_NUM1}\n</isNotNull>\n<isNotNull property = \"USE_NUM2\">\nAND t.USE_NUM < {USE_NUM2}\n</isNotNull>\n<isNotNull property = \"JIAOLIU_USE_ELEC1\">\nAND t.JIAOLIU_USE_ELEC >= {JIAOLIU_USE_ELEC1}\n</isNotNull>\n<isNotNull property = \"JIAOLIU_USE_ELEC2\">\nAND t.JIAOLIU_USE_ELEC < {JIAOLIU_USE_ELEC2}\n</isNotNull>\n<isNotNull property = \"SHICE_EVN1\">\nAND t.SHICE_EVN >= {SHICE_EVN1}\n</isNotNull>\n<isNotNull property = \"SHICE_EVN2\">\nAND t.SHICE_EVN < {SHICE_EVN2}\n</isNotNull>\n<isNotNull property = \"POWER_SUPPLY_TYPE\">\nAND t.POWER_SUPPLY_TYPE = {POWER_SUPPLY_TYPE}\n</isNotNull>\n <isNotNull property=\"IS_SHARE\">\n AND (t.site_use_type='{IS_SHARE}' or '{IS_SHARE}'='3')\n </isNotNull>\n<isNotNull property=\"CHAO_BIAO_ELEC1\">\n and t.CHAO_BIAO_ELEC >= {CHAO_BIAO_ELEC1}\n</isNotNull>\n<isNotNull property=\"CHAO_BIAO_ELEC2\">\n and t.CHAO_BIAO_ELEC < {CHAO_BIAO_ELEC2}\n</isNotNull>\n<isNotNull property=\"STATUS\">\n and t.STATUS = {STATUS}\n</isNotNull>\n<isNotNull property=\"5G_ELEC1\">\n and (nvl(t.YD_5G_USE_NUM,0)+nvl(t.LT_5G_USE_NUM,0)+nvl(t.DX_5G_USE_NUM,0)) >= {5G_ELEC1} \n</isNotNull>\n<isNotNull property=\"5G_ELEC2\">\n and (nvl(t.YD_5G_USE_NUM,0)+nvl(t.LT_5G_USE_NUM,0)+nvl(t.DX_5G_USE_NUM,0)) < {5G_ELEC2} \n</isNotNull> \n",
     *       "IS_PAGER": "1",
     *       "CREATE_USER_NAME": "系统",
     *       "UPDATE_USER_NAME": "系统",
     *       "IS_LOAD": "0"
     */
    @Data
    public static class MainInfo {
        private String REPORT_TYPE;
        private String ORG_ID;
        private String C_ORG_NAME;
        private String PAGE_PANEL;
        private String REPORT_MOREFUNCTION;
        private String REPORT_CODE;
        private String UPDATE_USER_CODE;
        private String P_ORG_ID;
        private String STATUS;
        private String MAIL;
        private String REPORT_NAME;
        private String ID;
        private String CREATE_TIME;
        private String REMARK;
        private String CREATE_USER_CODE;
        private String C_ORG_ID;
        private String IS_EXCEL_PUB;
        private String A_ORG_ID;
        private String ORG_NAME;
        private String IS_TIME_USER_SELF_PAR;
        private String DATA_LAST_TIME;
        private String A_ORG_NAME;
        private String IS_TIME;
        private String UPDATE_TIME;
        private String P_ORG_NAME;
        private String SQL_TEXT;
        private String IS_PAGER;
        private String CREATE_USER_NAME;
        private String UPDATE_USER_NAME;
        private String IS_LOAD;
    }

    public static GetReportConfigInfoResult fromJson(String json) {
        return AnranGsonBuilder.create().fromJson(json, GetReportConfigInfoResult.class);
    }

    @Override
    public String toString() {
        return AnranGsonBuilder.create().toJson(this);
    }

}
