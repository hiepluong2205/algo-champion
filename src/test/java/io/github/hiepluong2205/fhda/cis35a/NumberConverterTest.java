package io.github.hiepluong2205.fhda.cis35a;

import io.github.hiepluong2205.fhda.cis35a.a1.NumberConverter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Lab 2a -
You must use arrays, static methods, loops and decision making constructs
Please put each part in its own project.
Total points - 30.

Part 1
1. Convert 1001011 from binary to decimal.
2. Convert 1101110 from decimal to binary.
Using arrays write functions to convert values from binary to decimal and decimal to binary.
*/

public class NumberConverterTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testConvertDecimalToBinary() {
        NumberConverter.convertDecimalToBinary(1101110);
    }

    @Test
    public void testConvertBinaryToDecimal() {
        NumberConverter.convertBinaryToDecimal(1001011);
    }
}