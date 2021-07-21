package us.fatehi.sualeh.chapter03;

import static us.fatehi.sualeh.chapter03.Question03_6.sort;
import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.junit.jupiter.api.Test;

public class TestQuestion03_6 {

  private static final int NUMBER_OF_RANDOM_TESTS = 3;
  private static final int STACK_SIZE = 10;

  @Test
  public void test1Question03_6() {

    for (int i = 0; i < NUMBER_OF_RANDOM_TESTS; i++) {

      final List<Integer> list = new ArrayList<>();
      for (int j = 0; j < STACK_SIZE; j++) {
        list.add((int) (Math.random() * 1000));
      }
      Collections.shuffle(list);

      final Stack<Integer> stack = new Stack<>();
      for (final Integer integer : list) {
        stack.push(integer);
      }
      assertEquals(10, stack.size());

      sort(stack);
      assertEquals(10, stack.size());

      final List<Integer> stackList = Collections.list(stack.elements());
      Collections.sort(list);

      assertEquals(list, stackList);
    }
  }
}
