package com.github.zhangchunsheng.anranenergy.service.impl;

import com.github.zhangchunsheng.anranenergy.bean.result.GetReportConfigInfoResult;
import com.github.zhangchunsheng.anranenergy.bean.result.QueryReportInfoResult;
import com.github.zhangchunsheng.anranenergy.service.BaseDataService;
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
public class BaseDataServiceImpl extends AnranServiceApacheHttpImpl implements BaseDataService {

    @Override
    public QueryReportInfoResult queryReportInfo(String json) throws AnranException {
        String responseContent = this.postJson(this.getConfig().getEnergyBaseUrl() + AnranConstants.Url.RESOURCE_ENERGY_QUERYREPORTINFO, this.getConfig().getCsrfToken(), this.getConfig().getSession(), json);
        return QueryReportInfoResult.fromJson(responseContent);
    }

    @Override
    public GetReportConfigInfoResult getReportConfigInfo(String json) throws AnranException {
        String responseContent = this.postJson(this.getConfig().getEnergyBaseUrl() + AnranConstants.Url.RESOURCE_ENERGY_GETREPORTCONFIGINFO, this.getConfig().getCsrfToken(), this.getConfig().getSession(), json);
        return GetReportConfigInfoResult.fromJson(responseContent);
    }
}
