package com.github.sellersj.no.corp.parent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void test() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello world", hello.getGreeting());
    }
}
