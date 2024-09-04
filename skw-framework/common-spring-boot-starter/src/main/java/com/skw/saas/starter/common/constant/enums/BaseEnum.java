package com.skw.saas.starter.common.constant.enums;

/**
 * 基础枚举
 *
 * @param <T>
 */
public interface BaseEnum<T> {

    /**
     * 获取值
     *
     * @return
     */
    T value();

    /**
     * 值相等
     *
     * @param value
     * @return
     */
    default boolean eqValue(T value) {
        if (value != null && value() == value) {
            return true;
        }
        return false;
    }

    /**
     * 值不相等
     *
     * @param value
     * @return
     */
    default boolean neValue(T value) {
        return !eqValue(value);
    }
}
