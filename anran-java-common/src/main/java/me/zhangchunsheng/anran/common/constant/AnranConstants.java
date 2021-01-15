package me.zhangchunsheng.anran.common.constant;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.Format;
import java.util.List;

/**
 * <pre>
 * 电费常量类
 * Created by Chunsheng Zhang on 2021/01/14.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class AnranConstants {

    public static class Url {
        public static final String RESOURCE_ENERGY_QUERYREPORTINFO = "/energy/reportToolController/queryReportInfo";
        public static final String RESOURCE_DINGTALK_ROBOT_SEND = "/robot/send?access_token=%s";
    }
}
