package com.github.zhangchunsheng.anrandingtalk.service.impl;

import com.github.zhangchunsheng.anrandingtalk.bean.result.SendResult;
import com.github.zhangchunsheng.anrandingtalk.service.RobotService;
import me.zhangchunsheng.anran.common.constant.AnranConstants;
import me.zhangchunsheng.anran.common.exception.AnranException;
import me.zhangchunsheng.anran.common.service.impl.AnranServiceApacheHttpImpl;

/**
 * <pre>
 *  电费接口请求抽象实现类
 *  Created by Chunsheng Zhang on 2020/7/18.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class RobotServiceImpl extends AnranServiceApacheHttpImpl implements RobotService {

    @Override
    public SendResult send(String json) throws AnranException {
        String responseContent = this.postJson(String.format(this.getConfig().getBaseUrl() + AnranConstants.Url.RESOURCE_DINGTALK_ROBOT_SEND, this.getConfig().getAccessToken()), json);
        return SendResult.fromJson(responseContent);
    }
}
