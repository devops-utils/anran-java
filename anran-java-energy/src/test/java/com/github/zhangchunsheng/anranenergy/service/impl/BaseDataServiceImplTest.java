package com.github.zhangchunsheng.anranenergy.service.impl;

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
        QueryReportInfoResult result = this.baseDataService.queryReportInfo("", "");
        assertEquals(true, result.isSuccess());
    }
}
