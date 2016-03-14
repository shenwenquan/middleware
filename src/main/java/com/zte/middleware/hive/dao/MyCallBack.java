package com.zte.middleware.hive.dao;

import org.springframework.data.hadoop.hive.HiveClient;
import org.springframework.data.hadoop.hive.HiveClientCallback;

/**
 * Created by apple on 16/3/3.
 */
public class MyCallBack implements HiveClientCallback<Object>

{


    @Override
    public Object doInHive(HiveClient hiveClient) throws Exception {
        return null;
    }
}
