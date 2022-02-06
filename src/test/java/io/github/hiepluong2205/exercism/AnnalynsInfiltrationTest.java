/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.exercism;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AnnalynsInfiltrationTest {
    boolean knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent;

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCanFastAttack() {
        knightIsAwake = true;
        assertEquals(AnnalynsInfiltration.canFastAttack(knightIsAwake), false);
    }

    @Test
    public void testCanSpy() {
        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), true);
    }

    @Test
    public void testCanSignalPrisoner() {
        archerIsAwake = false;
        prisonerIsAwake = true;
        assertEquals(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake), true);
    }
    @Test
    public void testCanSignalPrisoner2() {
        archerIsAwake = true;
        prisonerIsAwake = false;
        assertEquals(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake), false);
    }

    @Test
    public void testCanFreePrisoner() {
        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        petDogIsPresent = false;
        assertEquals(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent), false);
    }
}