package io.github.hiepluong2205.exercism;

public class RecipeLasagna {
  // TODO: define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven() {
    return 40;
  }

  // TODO: define the 'remainingMinutesInOven()' method
  public int remainingMinutesInOven(int minutePast) {
    int minuteRemaining = expectedMinutesInOven() - minutePast;
    return minuteRemaining;
  }

  // TODO: define the 'preparationTimeInMinutes()' method
  public int preparationTimeInMinutes(int countLayers) {
    int minutePrep = countLayers * 2;
    return minutePrep;
  }

  // TODO: define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int countLayers, int minutePast) {
    int minuteTotalEffort = preparationTimeInMinutes(countLayers) + minutePast;
    return minuteTotalEffort;
  }
}
