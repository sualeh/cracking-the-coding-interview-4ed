package us.fatehi.sualeh.chapter01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.sualeh.chapter01.Question01_7.setZeros;
import static us.fatehi.sualeh.testutil.TestUtil.readIntArray;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestQuestion01_7 {

  @Test
  public void test1Question1_7() {
    final String[] _3x3s = {"1 2 0", "1 2 3", "1 2 3"};
    final String[] x3x3s = {"0 0 0", "1 2 0", "1 2 0"};

    final int[][] _3x3 = readIntArray(_3x3s);
    final int[][] x3x3 = readIntArray(x3x3s);
    setZeros(_3x3);
    assertTrue(Arrays.deepEquals(_3x3, x3x3), String.format(
    "expected:\n%s\nactual:\n%s", Arrays.deepToString(x3x3), Arrays.deepToString(_3x3)));
  }
}
