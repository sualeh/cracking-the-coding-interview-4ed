package us.fatehi.sualeh.chapter01;


import static org.junit.Assert.assertTrue;
import static us.fatehi.sualeh.chapter01.Question01_6.rotate;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class TestQuestion01_6
{

  @Test
  public void test1Question1_6()
  {
    final String[] _3x3s = {
        "0 1 0", "0 1 2", "0 0 3"
    };
    final String[] x3x3s = {
        "0 0 0", "0 1 1", "3 2 0"
    };

    // Test odd-size
    final int[][] _3x3 = readIntArray(_3x3s);
    final int[][] x3x3 = readIntArray(x3x3s);
    System.out.println(Arrays.deepToString(_3x3));
    rotate(_3x3, 3);
    assertTrue(String.format("expected:\n%s\nactual:\n%s",
                             Arrays.deepToString(x3x3),
                             Arrays.deepToString(_3x3)),
               Arrays.deepEquals(_3x3, x3x3));
  }

  @Test
  public void test2Question1_6()
  {
    final String[] _4x4s = {
        "0 1 0 3", "0 1 2 5", "0 6 5 4", "0 8 9 8"
    };
    final String[] x4x4s = {
        "0 0 0 0", "8 6 1 1", "9 5 2 0", "8 4 5 3"
    };

    // Test even-size
    final int[][] _4x4 = readIntArray(_4x4s);
    final int[][] x4x4 = readIntArray(x4x4s);
    System.out.println(Arrays.deepToString(_4x4));
    rotate(_4x4, 4);
    assertTrue(String.format("expected:\n%s\nactual:\n%s",
                             Arrays.deepToString(x4x4),
                             Arrays.deepToString(_4x4)),
               Arrays.deepEquals(_4x4, x4x4));
  }

  private int[][] readIntArray(final String[] inputLines)
  {

    final int[][] twoDim = new int[inputLines.length][inputLines.length];

    for (int row = 0; row < inputLines.length; row++)
    {
      final String line = inputLines[row];
      final Scanner s = new Scanner(line);
      for (int col = 0; col < inputLines.length; col++)
      {
        if (s.hasNextInt())
        {
          twoDim[row][col] = s.nextInt();
        }
      }
    }
    return twoDim;
  }

}
