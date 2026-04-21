package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    private static TestPostService testPostService;
    private static TestPostRepository testPostRepository;


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

            case "testPostRepository" -> {
                if (testPostRepository == null) {
                    testPostRepository = new TestPostRepository();
                }

                return (T) testPostRepository;
            }
        }

        return null;
    }
}
