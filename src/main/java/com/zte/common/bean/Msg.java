package com.zte.common.bean;

/**
 * Created by apple on 16/2/28.
 */
public class Msg {
    private State returnState;

    private String message;

    public State getReturnState() {
        return returnState;
    }

    public void setReturnState(State returnState) {
        this.returnState = returnState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
