package com.mantoums.service;

import com.mantoums.callback.MyCallback;

public class TestService {
    private volatile static TestService instance;

    private TestService() {
    }

    public static TestService getInstance() {
        if (instance == null) {
            synchronized (TestService.class) {
                if (instance == null) {
                    instance = new TestService();
                }
            }
        }
        return instance;
    }

    public void start(String message, Integer secondParam, MyCallback callback) {
        String callbackMessage = String.format("[TestService: Callback has been called. message: %s, secondParam: %d]", message, secondParam);
        callback.onCallback(callbackMessage);
    }
}
