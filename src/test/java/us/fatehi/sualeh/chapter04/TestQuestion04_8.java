package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter04.Question04_8.findSum;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;

public class TestQuestion04_8
  extends TreeNodeTest
{

  @Test
  public void test1Question04_8()
  {
    final int sum = 5;
    final Collection<List<Integer>> sumPaths = findSum(sumRoot, sum);
    System.out.println(String.format("Paths for sum %d: %s", sum, sumPaths));
    assertEquals("[[5, 0], [2, 3, -4, 3, 1], [5], [3, -4, 3, 1, 2], [-4, 3, 6], [2, 3], [-4, 9]]",
                 sumPaths.toString());
  }

}
