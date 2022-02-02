/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a2p1;

/*
https://docs.google.com/document/d/1GlIbmHnYvTkvgGkP7yLnSscTAzOUjWkoGi6pyzN1oo0/edit?usp=sharing
https://deanza.instructure.com/courses/23660/assignments/678802
*/
public class HumanGenome {
    private String genomeName;
    private int countGenesPerGenome, countChromosomes, countCellsInTrillion;

    public HumanGenome(String genomeName, int countGenesPerGenome, int countChromosomes, int countCellsInTrillion) {
        this.genomeName = genomeName;
        this.countGenesPerGenome = countGenesPerGenome;
        this.countChromosomes = countChromosomes;
        this.countCellsInTrillion = countCellsInTrillion;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public int getCountGenesPerGenome() {
        return countGenesPerGenome;
    }

    public void setCountGenesPerGenome(int countGenesPerGenome) {
        this.countGenesPerGenome = countGenesPerGenome;
    }

    public int getCountChromosomes() {
        return countChromosomes;
    }

    public void setCountChromosomes(int countChromosomes) {
        this.countChromosomes = countChromosomes;
    }

    public int getCountCellsInTrillion() {
        return countCellsInTrillion;
    }

    public void setCountCellsInTrillion(int countCellsInTrillion) {
        this.countCellsInTrillion = countCellsInTrillion;
    }

    public void print() {
        System.out.printf("");
    }
}
