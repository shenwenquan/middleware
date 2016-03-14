package com.springapp.base.hello;

/**
 * Created by apple on 16/3/6.
 */
public class DefaultServiceLocator {
    private static ClientService clientService = new ClientServiceImpl();

    private DefaultServiceLocator() {
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
