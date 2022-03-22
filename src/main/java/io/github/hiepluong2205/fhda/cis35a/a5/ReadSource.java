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

package io.github.hiepluong2205.fhda.cis35a.a5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSource {
    public static void main(String[] arguments) throws IOException {

        try {

            FileReader file = new FileReader("ReadSource.java");

            BufferedReader buff = new BufferedReader(file);

            boolean eof = false;

            while (!eof) {

                String line = buff.readLine();

                if (line == null)

                    eof = true;

                else

                    System.out.println(line);

            }

            buff.close();

        } catch (IOException e) {

            System.out.println("Error -- " + e.toString());

        }

    }
}
