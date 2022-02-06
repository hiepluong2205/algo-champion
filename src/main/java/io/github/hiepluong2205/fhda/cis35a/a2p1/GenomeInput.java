/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a2p1;

//https://docs.google.com/document/d/1GlIbmHnYvTkvgGkP7yLnSscTAzOUjWkoGi6pyzN1oo0/edit?usp=sharing
public class GenomeInput {

    public static void main() {
        String[][] humanGenomeMatrix = {
                {"Human Bob", "200000", "46", "76"},
                {"Human Sally", "200000", "46", "120"},
                {"Human Sri", "200000", "46", "75"}
        };
        HumanGenome humanGenome01 = new HumanGenome("Human Bob", 20000, 46, 76);
        HumanGenome humanGenome02 = new HumanGenome("Human Sally", 20000, 46, 120);
        HumanGenome humanGenome03 = new HumanGenome("Human Sri", 20000, 46, 75);
    }
}
