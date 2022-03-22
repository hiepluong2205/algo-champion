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

package io.github.hiepluong2205.educative;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChampArrayTest {
    final Logger logger = LoggerFactory.getLogger(ChampArrayTest.class);

    @Test
    public void testFindAverages() {
        int[] arr={1,2,3,4};
        logger.debug("");
        ChampArray.findAverages(5,arr);
    }
}