package com.github.zhangchunsheng.anranenergy.service.impl;

import com.github.zhangchunsheng.anranenergy.bean.request.QueryReportInfoRequest;
import com.github.zhangchunsheng.anranenergy.bean.result.QueryReportInfoResult;
import com.github.zhangchunsheng.anranenergy.service.BaseDataService;
import com.github.zhangchunsheng.anranenergy.service.BaseTest;
import com.github.zhangchunsheng.anranenergy.testbase.ApiTestModule;
import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import me.zhangchunsheng.anran.common.exception.AnranException;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

/**
 * 测试相关接口
 * Created by Chunsheng Zhang on 2020/7/18.
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Slf4j
@Test
@Guice(modules = ApiTestModule.class)
public class BaseDataServiceImplTest extends BaseTest {

    @Inject
    private BaseDataService baseDataService;

    @Test
    public void testQueryReportInfo() throws AnranException {
        QueryReportInfoRequest queryReportInfoRequest = new QueryReportInfoRequest();
        /*
        * AREA_ID: "1935"
        END_USE_DATE: "2021-01-12"
        IS_SHARE: "3"
        START_USE_DATE: "2021-01-11"
        areaIdHidden: "3"
        *
        areaLevel: "3"
        endRow: 40
        page: 2
        privCode: "A4F3D73225F9F343E0533D801DAC45B9"
        provinceId: "1935"
        *
        provinceIdHidden: "1935"
        reportId: "A4F3D73225F9F343E0533D801DAC45B9"
        reportName: "电量计量"
        startRow: 20*/
        queryReportInfoRequest.setAREA_ID("1935");
        queryReportInfoRequest.setAreaIdHidden("3");
        queryReportInfoRequest.setSTART_USE_DATE("2021-01-10");
        queryReportInfoRequest.setEND_USE_DATE("2021-01-11");
        queryReportInfoRequest.setAreaLevel("3");

        queryReportInfoRequest.setEndRow(20);
        queryReportInfoRequest.setPage(1);
        queryReportInfoRequest.setPrivCode("A4F3D73225F9F343E0533D801DAC45B9");
        queryReportInfoRequest.setProvinceId("1935");
        queryReportInfoRequest.setIS_SHARE("3");

        queryReportInfoRequest.setProvinceIdHidden("1935");
        queryReportInfoRequest.setReportId("A4F3D73225F9F343E0533D801DAC45B9");
        queryReportInfoRequest.setReportName("电量计量");
        queryReportInfoRequest.setStartRow(0);
        System.out.println(queryReportInfoRequest.toString());
        QueryReportInfoResult result = this.baseDataService.queryReportInfo(queryReportInfoRequest.toString());
        assertEquals(true, result.isSuccess());
    }
}
