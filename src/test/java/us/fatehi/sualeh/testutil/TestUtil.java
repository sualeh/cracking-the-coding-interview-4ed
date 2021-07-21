package us.fatehi.sualeh.testutil;

import java.util.Scanner;

public class TestUtil {

  public static int[][] readIntArray(final String[] inputLines) {

    final int[][] twoDim = new int[inputLines.length][inputLines.length];

    for (int row = 0; row < inputLines.length; row++) {
      final String line = inputLines[row];
      try (Scanner s = new Scanner(line); ) {
        for (int col = 0; col < inputLines.length; col++) {
          if (s.hasNextInt()) {
            twoDim[row][col] = s.nextInt();
          }
        }
      }
    }
    return twoDim;
  }
}
