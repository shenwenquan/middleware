package com.springapp.mvc.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 16/2/17.
 */


@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public List<String> hello() {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        int a = 1 / 0;
        return list;
    }


}
