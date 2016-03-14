package com.zte.middleware.hive.service;

import java.util.List;

/**
 * Created by apple on 16/2/28.
 */
public interface HiveOperationService {

    List<String> queryTables(String schema);
}
