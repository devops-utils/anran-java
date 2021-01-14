package com.github.zhangchunsheng.anranenergy.service;

import com.github.zhangchunsheng.anranenergy.bean.result.common.QueryReportInfoResult;
import me.zhangchunsheng.anran.common.exception.AnranException;
import me.zhangchunsheng.anran.common.service.AnranService;

import java.util.Map;

/**
 * <pre>
 * 基础信息
 * Created by Chunsheng Zhang on 2020/7/18.
 *
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public interface BaseDataService extends AnranService {

    public QueryReportInfoResult queryReportInfo(String csrfToken, String startDate, String endData) throws AnranException;
}
