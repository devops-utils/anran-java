package com.github.zhangchunsheng.anrandingtalk.service.impl;

import com.github.zhangchunsheng.anrandingtalk.bean.request.SendRequest;
import com.github.zhangchunsheng.anrandingtalk.bean.result.SendResult;
import com.github.zhangchunsheng.anrandingtalk.service.RobotService;
import com.github.zhangchunsheng.anrandingtalk.service.BaseTest;
import com.github.zhangchunsheng.anrandingtalk.testbase.ApiTestModule;
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
public class RobotServiceImplTest extends BaseTest {

    @Inject
    private RobotService robotService;

    @Test
    public void testSend() throws AnranException {
        SendRequest sendRequest = new SendRequest();
        /*
        * {"msgtype": "text","text": {"content": "我就是我, 是不一样的烟火"}}*/
        sendRequest.setMsgtype("text");
        SendRequest.Text text = new SendRequest.Text();
        text.setContent("铁塔电费采集开始");
        sendRequest.setText(text);
        System.out.println(sendRequest.toString());
        //{"isSuccess":false,"errcode":400201,"errmsg":"miss param : text"}
        SendResult result = this.robotService.send(sendRequest.toString());
        System.out.println(result.toString());
    }
}
