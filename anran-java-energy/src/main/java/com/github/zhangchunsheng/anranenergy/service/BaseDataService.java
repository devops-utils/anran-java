package com.github.zhangchunsheng.anranenergy.service;

import com.github.zhangchunsheng.anranenergy.bean.result.GetReportConfigInfoResult;
import com.github.zhangchunsheng.anranenergy.bean.result.QueryReportInfoResult;
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
public interface BaseDataService extends AnranService {

    public QueryReportInfoResult queryReportInfo(String json) throws AnranException;

    public GetReportConfigInfoResult getReportConfigInfo(String json) throws AnranException;
}
