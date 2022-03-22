/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.fhda.cis35a.a4e1p1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SavingsAccountTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void test1() {
        SavingsAccount saver1= new SavingsAccount();
        SavingsAccount saver2= new SavingsAccount();
        SavingsAccount.modifyInterestRate(0.05);
    }
}