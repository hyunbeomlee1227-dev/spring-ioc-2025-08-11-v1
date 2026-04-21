package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestFacadePostService;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public static TestPostService testPostService;
    public static TestPostRepository testPostRepository;
    public static TestFacadePostService testFacadePostService;

    public ApplicationContext() {
        testPostRepository = new TestPostRepository();
        testPostService = new TestPostService();
        testFacadePostService = new TestFacadePostService();
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

            case "testFacadePostService" -> {
                if (testFacadePostService == null) {
                    testFacadePostService = new TestFacadePostService();
                }

                return (T) testFacadePostService;
            }
        }

        return null;
    }
}
