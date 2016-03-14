package com.springapp.base.hello;

/**
 * Created by apple on 16/3/6.
 */
public abstract class CommandManager2 {

    public Object process(int commandState) {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();
}