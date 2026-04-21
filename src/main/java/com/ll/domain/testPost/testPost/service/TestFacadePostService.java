package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.framework.ioc.ApplicationContext;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class TestFacadePostService {
    private final TestPostService testPostService;
    private final TestPostRepository testPostRepository;

    public TestFacadePostService() {
        testPostService = ApplicationContext.testPostService;
        testPostRepository = ApplicationContext.testPostRepository;
    }
}
