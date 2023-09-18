package com.example.demotestng2;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class SomeTest {

    @Test()
    public void foo() {
        assertTrue(false);
    }

    @Test()
    public void bar() {
        assertTrue(true);
    }
}
