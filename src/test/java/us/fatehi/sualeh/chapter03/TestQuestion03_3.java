package us.fatehi.sualeh.chapter03;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
  final Object two = pop;

    assertEquals(1, two);
    assertEquals(2, stack.stacks.size());

    pop = stack.pop();
  final Object two1 = pop;

    assertEquals(2, two1);
    assertEquals(1, stack.stacks.size());

    pop = stack.pop();
  final Object two2 = pop;

    assertEquals(1, two2);
    assertEquals(1, stack.stacks.size());

    pop = stack.pop();
  final Object two3 = pop;

    assertEquals(3, two3);
    assertEquals(1, stack.stacks.size());
  }
}
