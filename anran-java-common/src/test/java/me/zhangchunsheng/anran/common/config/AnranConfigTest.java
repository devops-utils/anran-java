package me.zhangchunsheng.anran.common.config;

import org.testng.annotations.Test;

/**
 * <pre>
 *  Created by Chunsheng Zhang on 2021/01/14.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class AnranConfigTest {
    private AnranConfig anranConfig = new AnranConfig();

    @Test
    public void test1() throws Exception {
        anranConfig.setCsrfToken("1");
        anranConfig.setSession("1");
    }
}
