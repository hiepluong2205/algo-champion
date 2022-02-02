package io.github.hiepluong2205.exercism;

//https://exercism.org/tracks/java/exercises/annalyns-infiltration/edit
public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false || prisonerIsAwake == true) {
            return true;
        } else {
            return true;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (knightIsAwake == true) {

        }
        return true;
    }
}
