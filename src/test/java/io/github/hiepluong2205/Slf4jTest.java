package io.github.hiepluong2205;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class Slf4jTest {
    final static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void test1(){
        Object testObject = new Object();
        String testObjString = new String();
        logger.debug("I created this object: " + testObject);
        logger.debug(testObjString);
    }
}
