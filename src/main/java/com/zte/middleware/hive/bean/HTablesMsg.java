package com.zte.middleware.hive.bean;

import com.zte.common.bean.Msg;

import java.util.List;

/**
 * Created by apple on 16/2/28.
 */
public class HTablesMsg extends Msg {

    private List<String> tables;

    public List<String> getTables() {

        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }
}
