package us.fatehi.sualeh.chapter03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_2.StackWithMin;

public class TestQuestion03_2 {

  @Test
  public void test1Question03_2() {
    final StackWithMin stack = new StackWithMin();

    stack.push(2);
    stack.push(3);
    stack.push(1);
    stack.push(2);
    stack.push(1);
  final Object two = stack.peek().value;

    assertEquals(1, two);
    assertEquals(1, stack.min());

    stack.pop();
  final Object two1 = stack.peek().value;

    assertEquals(2, two1);
    assertEquals(1, stack.min());

    stack.pop();
  final Object two2 = stack.peek().value;

    assertEquals(1, two2);
    assertEquals(1, stack.min());

    stack.pop();
  final Object two3 = stack.peek().value;

    assertEquals(3, two3);
    assertEquals(2, stack.min());
  }
}
