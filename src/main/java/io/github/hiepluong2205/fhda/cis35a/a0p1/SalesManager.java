/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date: 02/02/2022
 * Date Submitted: 02/02/2022
 * https://deanza.instructure.com/courses/23660/assignments
 */

package io.github.hiepluong2205.fhda.cis35a.a0p1;

import java.util.Scanner;

// https://deanza.instructure.com/courses/23660/assignments/678799
public class SalesManager {
    String[] productDescriptions = {"TV", "VCR", "Remote Controller", "CD Player", "Tape Recorder"};
    double unitPriceTV = 400, unitPriceVCR = 220, unitPriceRemoteController = 35.2, unitPriceCDPlayer = 300, unitPriceTapeRecorder = 150, salesTax = 0.0825, totalPrice, taxAmount;
    int countUnitTV, countUnitVCR, countUnitRemoteController, countUnitCDPlayer, countUnitTapeRecorder;

    public static void main(String[] args) {

    }

    protected void scanFromConsole() {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many TV's were sold? ");
        countUnitTV = scanner.nextInt();
        System.out.print("How many VCR's were sold? ");
        countUnitVCR = scanner.nextInt();
        System.out.print("How many remote controller's were sold? ");
        countUnitRemoteController = scanner.nextInt();
        System.out.print("How many CD's were sold? ");
        countUnitCDPlayer = scanner.nextInt();
        System.out.print("How many Tape Recorder's were sold? ");
        countUnitTapeRecorder = scanner.nextInt();
        scanner.close();
        //
    }
}
