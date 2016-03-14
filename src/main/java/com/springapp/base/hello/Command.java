package com.springapp.base.hello;

/**
 * Created by apple on 16/3/6.
 */
public class Command {

    private int state;

    public Object execute() {
        return "exec:" + state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
