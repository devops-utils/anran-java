package me.zhangchunsheng.anran.common.service.impl;

import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import me.zhangchunsheng.anran.common.exception.AnranException;
import me.zhangchunsheng.anran.common.service.AnranService;
import me.zhangchunsheng.anran.common.testbase.ApiTestModule;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

/**
 * 测试GEO相关接口
 * Created by Chunsheng Zhang on 2021/01/14.
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Slf4j
@Test
@Guice(modules = ApiTestModule.class)
public class BaseAnranServiceImplTest {

    @Inject
    private AnranService anranService;

    @Test
    public void testEnergy() throws AnranException {
        String csrfToken = this.anranService.getConfig().getCsrfToken();
        assertNotNull(csrfToken);
    }
}
