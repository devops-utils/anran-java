package com.github.zhangchunsheng.anranenergy.service.impl;

import com.github.zhangchunsheng.anranenergy.bean.result.common.QueryReportInfoResult;
import com.github.zhangchunsheng.anranenergy.service.BaseDataService;
import me.zhangchunsheng.anran.common.constant.AnranConstants;
import me.zhangchunsheng.anran.common.exception.AnranException;
import me.zhangchunsheng.anran.common.service.impl.AnranServiceApacheHttpImpl;

import java.util.Map;

/**
 * <pre>
 *  电费接口请求抽象实现类
 *  Created by Chunsheng Zhang on 2020/7/18.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class BaseDataServiceImpl extends AnranServiceApacheHttpImpl implements BaseDataService {

    @Override
    public QueryReportInfoResult queryReportInfo(String startDate, String endData) throws AnranException {
        String responseContent = this.post(this.getConfig().getEnergyBaseUrl() + AnranConstants.Url.RESOURCE_ENERGY_QUERYREPORTINFO, "");
        return QueryReportInfoResult.fromJson(responseContent);
    }
}
