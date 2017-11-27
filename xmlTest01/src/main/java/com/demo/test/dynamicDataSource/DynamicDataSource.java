package com.demo.test.dynamicDataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Administrator
 * 用于返回当前线程的数据源标识
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSource();
    }
}
