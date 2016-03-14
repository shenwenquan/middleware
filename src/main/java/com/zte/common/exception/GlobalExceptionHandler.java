package com.zte.common.exception;

import com.zte.common.bean.Msg;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by apple on 16/2/28.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Msg hand(Exception e) {

        e.printStackTrace();
        return null;
    }
}
