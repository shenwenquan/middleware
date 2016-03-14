package com.springapp.hive;

import org.springframework.data.hadoop.hive.HiveClient;
import org.springframework.data.hadoop.hive.HiveClientCallback;
import org.springframework.data.hadoop.hive.HiveTemplate;

import java.util.List;

/**
 * Created by apple on 16/2/22.
 */
public class SomeClass {
    private HiveTemplate hiveTemplate;

    public void setHiveTemplate(HiveTemplate template) {
        this.hiveTemplate = template;
    }

    public List<String> getDbs() {
        return hiveTemplate.execute(new HiveClientCallback<List<String>>() {
            @Override
            public List<String> doInHive(HiveClient hiveClient) throws Exception {
                return hiveClient.execute("show databases");
            }
        });
    }
}
