package com.zte.middleware.hive.dao;

import java.util.List;

/**
 * Created by apple on 16/2/28.
 */
public interface HiveOperationDao {

    List<String> queryTables(String schema);
}
