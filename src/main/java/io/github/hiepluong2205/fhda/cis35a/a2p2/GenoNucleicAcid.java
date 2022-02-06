/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a2p2;

import java.util.Scanner;

/*
https://docs.google.com/document/d/1GlIbmHnYvTkvgGkP7yLnSscTAzOUjWkoGi6pyzN1oo0/edit?usp=sharing
https://deanza.instructure.com/courses/23660/assignments/678802
 */
public class GenoNucleicAcid {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        NucleicAcid cytosine = new NucleicAcid("cytosine", "C4H5N3O", 111.10, 1.55);
        NucleicAcid adenine = new NucleicAcid("adenine", "C5H5N5", 135.13, 1.6);
        NucleicAcid guanine = new NucleicAcid("guanine", "C5H5N5O", 151.13, 2.200);
        NucleicAcid thymine = new NucleicAcid("thymine", "C5H6N2O2", 126.115, 1.223);
        NucleicAcid uracil = new NucleicAcid("uracil", "C4H4N2O2", 112.08676, 1.32);
    }

    protected static NucleicAcid scanNew() {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Chemical Formula: ");
        String chemFormula = scanner.nextLine();
        System.out.println("Molar Mass: ");
        double molarMass = scanner.nextDouble();
        System.out.println("Density: ");
        double density = scanner.nextDouble();
        return new NucleicAcid(name, chemFormula, molarMass, density);
    }
}
