package com.zte.common.bean;

/**
 * Created by apple on 16/2/28.
 */
public enum State {

    SUCCESS((byte) 1), FAIL((byte) 0);

    private byte value;

    State(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
