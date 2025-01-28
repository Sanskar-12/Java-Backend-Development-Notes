package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        Main obj=new Main();
        int actual=obj.divide(10,2);
        int expectations=5;
        Assertions.assertEquals(expectations,actual);
    }
}