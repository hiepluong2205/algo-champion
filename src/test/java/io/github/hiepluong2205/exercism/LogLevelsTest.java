package io.github.hiepluong2205.exercism;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LogLevelsTest {

  @BeforeMethod
  public void setUp() {}

  @AfterMethod
  public void tearDown() {}

  @Test
  public void testMessage() {
    System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
    System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));

  }
}
