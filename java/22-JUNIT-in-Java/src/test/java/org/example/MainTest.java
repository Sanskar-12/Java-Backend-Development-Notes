package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    // Way to create test case
    @Test
    public void test() {
        Main obj=new Main();
        int actual=obj.divide(10,2);
        int expectations=5;
        Assertions.assertEquals(expectations,actual); // Verifying the actual value with expectated value
    }

    // The Message would be shown in any condition
    @Test
    public void test2withMessage() {
        Main obj=new Main();
        int actual=obj.divide(10,2);
        int expectations=5;
        Assertions.assertEquals(expectations,actual,"Message to dev it test case fails");
    }

    // The Message would be shown if the test case fails
    @Test
    public void test3ifTestCaseFailMessage() {
        Main obj=new Main();
        int actual=obj.divide(10,2);
        int expectations=5;
        Assertions.assertEquals(expectations,actual,()->"Message to dev it test case fails");
    }
}