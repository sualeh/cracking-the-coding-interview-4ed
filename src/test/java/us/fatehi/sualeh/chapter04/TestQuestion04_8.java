package us.fatehi.sualeh.chapter04;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static us.fatehi.sualeh.chapter04.Question04_8.findSum;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;

public class TestQuestion04_8 extends TreeNodeTest {

  @Test
  public void test1Question04_8() {
    final int sum = 5;
    final Collection<List<Integer>> sumPaths = findSum(sumRoot, sum);
    System.out.println(String.format("Paths for sum %d: %s", sum, sumPaths));

    assertThat(
        sumPaths,
        containsInAnyOrder(
            asList(5, 0),
            asList(2, 3, -4, 3, 1),
            asList(5),
            asList(3, -4, 3, 1, 2),
            asList(-4, 3, 6),
            asList(2, 3),
            asList(-4, 9)));
  }
}
