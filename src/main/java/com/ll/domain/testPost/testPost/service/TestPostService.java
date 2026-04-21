package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.framework.ioc.ApplicationContext;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestPostService {
    private TestPostRepository testPostRepository;

    public TestPostService () {
        testPostRepository = ApplicationContext.testPostRepository;
    }
}