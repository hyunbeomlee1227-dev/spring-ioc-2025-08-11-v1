package com.ll;

import com.ll.framework.ioc.ApplicationContext;

public class Main {
    public static void main(String[] args) {

        com.ll.domain.testPost.testPost.service.TestPostService testpostservice = new ApplicationContext().genBean("testPostService");
    }
}