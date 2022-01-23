package io.github.hiepluong2205.exercism;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LogLevelsTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void test1() {
        Assert.assertEquals(LogLevels.message("[ERROR]: Invalid operation"), "Invalid operation");
        Assert.assertEquals(LogLevels.message("[WARNING]:  Disk almost full\r\n"), "Disk almost full");

    }

    @Test
    public void test2() {
        Assert.assertEquals(LogLevels.logLevel("[ERROR]: Invalid operation"), "error");
    }

    @Test
    public void test3() {
        Assert.assertEquals(LogLevels.reformat("[INFO]: Operation completed"), "Operation completed (info)");
    }
}
