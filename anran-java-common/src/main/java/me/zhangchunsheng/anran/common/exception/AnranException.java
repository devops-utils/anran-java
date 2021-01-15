package me.zhangchunsheng.anran.common.exception;

import com.google.common.base.Joiner;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.anran.common.bean.result.BaseAnranResult;

/**
 * <pre>
 * 电费异常结果类
 * Created by Chunsheng Zhang on 2020-7-18.
 * </pre>
 *
 * @author ChunshengZhang
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnranException extends Exception {
    private static final long serialVersionUID = 2020381471513460742L;

    /**
     * 自定义错误讯息.
     */
    private String customErrorMsg;
    /**
     * 返回状态码.
     */
    private String returnStatus;
    /**
     * 返回信息.
     */
    private String returnMsg;

    /**
     * 业务结果.
     */
    private int returnCode;

    /**
     * Instantiates a new Anran exception.
     *
     * @param customErrorMsg the custom error msg
     */
    public AnranException(String customErrorMsg) {
        super(customErrorMsg);
        this.customErrorMsg = customErrorMsg;
    }

    /**
     * Instantiates a new Anran exception.
     *
     * @param customErrorMsg the custom error msg
     * @param tr             the tr
     */
    public AnranException(String customErrorMsg, Throwable tr) {
        super(customErrorMsg, tr);
        this.customErrorMsg = customErrorMsg;
    }

    private AnranException(Builder builder) {
        super(builder.buildErrorMsg());
        returnStatus = builder.returnStatus;
        returnMsg = builder.returnMsg;
        returnCode = builder.returnCode;
    }

    /**
     * 通过BaseAnranResult生成异常对象.
     *
     * @param baseResult the base result
     * @return the anran exception
     */
    public static AnranException from(BaseAnranResult baseResult) {
        return AnranException.newBuilder()
                .returnStatus(baseResult.isSuccess() ? "1" : "0")
                .returnMsg(baseResult.getErrmsg())
                .returnCode(baseResult.getErrcode())
                .build();
    }

    /**
     * New builder builder.
     *
     * @return the builder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The type Builder.
     */
    public static final class Builder {
        private String returnStatus;
        private String returnMsg;
        private int returnCode;

        private Builder() {
        }

        /**
         * Return status builder.
         *
         * @param returnStatus the return status
         * @return the builder
         */
        public Builder returnStatus(String returnStatus) {
            this.returnStatus = returnStatus;
            return this;
        }

        /**
         * Return info builder.
         *
         * @param returnMsg the return info
         * @return the builder
         */
        public Builder returnMsg(String returnMsg) {
            this.returnMsg = returnMsg;
            return this;
        }

        /**
         * Result code builder.
         *
         * @param returnCode the result code
         * @return the builder
         */
        public Builder returnCode(int returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        /**
         * Build anran energy exception.
         *
         * @return the anran energy exception
         */
        public AnranException build() {
            return new AnranException(this);
        }

        /**
         * Build error msg string.
         *
         * @return the string
         */
        public String buildErrorMsg() {
            return Joiner.on("，").skipNulls().join(
                    returnStatus == null ? null : String.format("返回代码：[%s]", returnStatus),
                    returnMsg == null ? null : String.format("返回信息：[%s]", returnMsg),
                    String.format("结果代码：[%s]", returnCode)
            );
        }
    }
}
