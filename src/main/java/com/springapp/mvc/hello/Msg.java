package com.springapp.mvc.hello;

/**
 * Created by apple on 16/2/28.
 */
public class Msg {

    private int returnStatus;
    private String message;

    public int getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(int returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "returnStatus=" + returnStatus +
                ", message='" + message + '\'' +
                '}';
    }
}
