package com.skw.saas.starter.common.constant.enums;


import lombok.AllArgsConstructor;

/**
 * 通用的状态 类型
 *
 * @author zc
 */
@AllArgsConstructor
public enum BaseStatusEnum implements BaseEnum<Integer> {

    /**
     * 失效
     */
    INVALID(0),

    /**
     * 有效
     */
    VALID(1);

    private final int value;

    @Override
    public Integer value() {
        return value;
    }

    /**
     * 获取指定值对应的枚举
     *
     * @param value
     * @return
     */
    public static BaseStatusEnum getEnum(Integer value) {
        if (value == null) {
            return null;
        }
        for (BaseStatusEnum obj : BaseStatusEnum.values()) {
            if (obj.eqValue(value)) {
                return obj;
            }
        }
        return null;
    }

    /**
     * 判断是否存在指定值
     *
     * @param value
     * @return
     */
    public static boolean hasValue(Integer value) {
        boolean hasVal = false;
        if (getEnum(value) != null) {
            hasVal = true;
        }
        return hasVal;
    }

    /**
     * 判断是否不存在指定值
     *
     * @param value
     * @return
     */
    public static boolean notHasValue(Integer value) {
        return !hasValue(value);
    }

}
