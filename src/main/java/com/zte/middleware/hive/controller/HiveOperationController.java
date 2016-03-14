package com.zte.middleware.hive.controller;

import com.zte.common.bean.Msg;
import com.zte.middleware.hive.bean.HTablesMsg;
import com.zte.middleware.hive.service.HiveOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.zte.common.bean.State.SUCCESS;

/**
 * Created by apple on 16/2/28.
 */

@RestController
@RequestMapping("/hive")
public class HiveOperationController {

    @Autowired
    private HiveOperationService service;

    @RequestMapping(path = "/queryTables/{schema}", method = RequestMethod.GET)
    public Msg queryTables(@PathVariable("schema") String schema) {

        HTablesMsg msg = new HTablesMsg();
        msg.setTables(service.queryTables(schema));
        msg.setReturnState(SUCCESS);
        msg.setMessage("ok!");

        return msg;
    }

}
