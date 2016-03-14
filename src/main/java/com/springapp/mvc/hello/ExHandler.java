package com.springapp.mvc.hello;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 16/2/19.
 */
@ControllerAdvice
@RestController
public class ExHandler {

//    @ExceptionHandler({ArithmeticException.class})
//      public ModelAndView handlerException(Exception e) {
//        e.printStackTrace();
//        ModelAndView mv =new ModelAndView("error");
//        mv.addObject("exception",e.getMessage());
//        return mv;
//    }

    @ExceptionHandler({ArithmeticException.class})
    public Msg handlerException(Exception e) {
        e.printStackTrace();
        Msg msg = new Msg();
        msg.setReturnStatus(100);
        msg.setMessage(e.getMessage());
        return msg;
    }
}
