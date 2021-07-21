package us.fatehi.sualeh.chapter03;

import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_3.SetOfStacks;

public class TestQuestion03_3 {

  @Test
  public void test1Question03_2() {
    final SetOfStacks stack = new SetOfStacks();

    stack.push(2);
    stack.push(3);
    stack.push(1);
    stack.push(2);
    stack.push(1);

    assertEquals(2, stack.stacks.size());

    int pop;

    pop = stack.pop();

    assertEquals(1, pop);
    assertEquals(2, stack.stacks.size());

    pop = stack.pop();

    assertEquals(2, pop);
    assertEquals(1, stack.stacks.size());

    pop = stack.pop();

    assertEquals(1, pop);
    assertEquals(1, stack.stacks.size());

    pop = stack.pop();

    assertEquals(3, pop);
    assertEquals(1, stack.stacks.size());
  }
}
