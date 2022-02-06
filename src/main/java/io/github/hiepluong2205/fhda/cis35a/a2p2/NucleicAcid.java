/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number: 2
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a2p2;

/*
https://docs.google.com/document/d/1GlIbmHnYvTkvgGkP7yLnSscTAzOUjWkoGi6pyzN1oo0/edit?usp=sharing
https://deanza.instructure.com/courses/23660/assignments/678802
 */
public class NucleicAcid {
    private String name, chemicalFormula;
    private double molarMass, density; //and units can be added as a String (within printf()

    public NucleicAcid(String name, String chemicalFormula, double molarMass, double density) {
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.molarMass = molarMass;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public double getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(float molarMass) {
        this.molarMass = molarMass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public void print() {
        System.out.printf("");
    }
}
