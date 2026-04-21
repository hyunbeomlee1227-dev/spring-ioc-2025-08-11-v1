package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    private static TestPostService testPostService;


    public ApplicationContext() {

    }


    public <T> T genBean(String beanName) {
        switch (beanName) {
            case "testPostService" -> {
                if (testPostService == null) {
                    testPostService = new TestPostService();
                }

                return (T) testPostService;
            }
        }

        return null;
    }
}
