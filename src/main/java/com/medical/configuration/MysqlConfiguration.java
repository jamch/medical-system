package com.medical.configuration;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/3 9:49
 */
public class MysqlConfiguration extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
