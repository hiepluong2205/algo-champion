package io.github.hiepluong2205;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;

public class Slf4jTest {
    final static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void test1(){
        Object testObject = new Object();
        logger.debug("I created this object: " + testObject);
    }
}
