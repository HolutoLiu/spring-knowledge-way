package com.skw.saas.starter.common.constant.enums;


import lombok.AllArgsConstructor;

/**
 * 是否 类型
 *
 * @author zc
 */
@AllArgsConstructor
public enum IfEnum implements BaseEnum<Integer> {

    /**
     * 否
     */
    NO(0),

    /**
     * 是
     */
    YES(1);

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
    public static IfEnum getEnum(Integer value) {
        if (value == null) {
            return null;
        }
        for (IfEnum obj : IfEnum.values()) {
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
