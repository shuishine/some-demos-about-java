package com.mantoums;

import com.mantoums.callback.MyCallback;
import com.mantoums.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Slf4j
public class Main {

    public static void main(String[] args) {
        TestService testService = TestService.getInstance();
        testService.start("Hello, I am a message", 9900000, new MyCallback() {
            @Override
            public void onCallback(String message) {
                log.info("Main: onCallback -> {}", message);
            }
        });
    }
}