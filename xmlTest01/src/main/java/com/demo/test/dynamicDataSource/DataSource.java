package com.demo.test.dynamicDataSource;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 定义注解，标识数据源
 */
@Target({TYPE, METHOD})
@Retention(RUNTIME)
public @interface DataSource {
    DataSourceEnum value();
}
