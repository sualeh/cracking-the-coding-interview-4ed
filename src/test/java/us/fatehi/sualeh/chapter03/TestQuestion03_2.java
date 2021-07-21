package us.fatehi.sualeh.chapter03;


import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_2.StackWithMin;

public class TestQuestion03_2
{

  @Test
  public void test1Question03_2()
  {
    final StackWithMin stack = new StackWithMin();

    stack.push(2);
    stack.push(3);
    stack.push(1);
    stack.push(2);
    stack.push(1);

    assertEquals(1, stack.peek().value);
    assertEquals(1, stack.min());

    stack.pop();

    assertEquals(2, stack.peek().value);
    assertEquals(1, stack.min());

    stack.pop();

    assertEquals(1, stack.peek().value);
    assertEquals(1, stack.min());

    stack.pop();

    assertEquals(3, stack.peek().value);
    assertEquals(2, stack.min());
  }

}
