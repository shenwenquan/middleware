package com.zte.middleware.hive.service;

import com.zte.middleware.hive.dao.HiveOperationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 16/2/28.
 */
@Service
public class HiveOperationServiceImpl implements HiveOperationService {

    @Autowired
    private HiveOperationDao hiveDao;

    @Override
    public List<String> queryTables(String schema) {
        return hiveDao.queryTables(schema);
    }
}
