package com.github.zhangchunsheng.anrandingtalk.service;

import com.github.zhangchunsheng.anrandingtalk.bean.result.SendResult;
import me.zhangchunsheng.anran.common.exception.AnranException;
import me.zhangchunsheng.anran.common.service.AnranService;

/**
 * <pre>
 * 基础信息
 * Created by Chunsheng Zhang on 2020/7/18.
 *
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public interface RobotService extends AnranService {

    public SendResult send(String json) throws AnranException;
}
