package us.fatehi.sualeh.chapter03;


import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;
import static us.fatehi.sualeh.testutil.TestUtil.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_1.ArrayStack;

public class TestQuestion03_1
{

  @Test
  public void test1Question03_1()
  {
    final ArrayStack stack = new ArrayStack();

    stack.push(0, 1);
    stack.push(1, 2);
    System.out.println(printStack(stack));

    assertTrue(printStack(stack), !stack.isEmpty(0));
    assertTrue(printStack(stack), !stack.isEmpty(1));
    assertTrue(printStack(stack), stack.isEmpty(2));

    final int peek0 = stack.peek(0);
    final int peek1 = stack.peek(1);
    final int peek2 = stack.peek(2);
    System.out.println(printStack(stack));

    assertEquals(printStack(stack), 1, peek0);
    assertEquals(printStack(stack), 2, peek1);
    assertEquals(printStack(stack), 0, peek2);

    stack.push(0, 3);
    final int pop2 = stack.pop(1);
    System.out.println(printStack(stack));

    assertEquals(printStack(stack), 2, pop2);
    assertTrue(printStack(stack), !stack.isEmpty(0));
    assertTrue(printStack(stack), stack.isEmpty(1));
    assertTrue(printStack(stack), stack.isEmpty(2));

  }

  private String printStack(final ArrayStack stack)
  {
    final char[] pointer = new char[stack.stackSize * 3];
    Arrays.fill(pointer, ' ');
    for (int i = 0; i < 3; i++)
    {
      final int index = i * stack.stackSize + stack.stackPointer[i];
      pointer[index] = stack.stackPointer[i] == -1? '-': '^';
    }
    return String.format("array with 3 stacks\n%s\n%s",
                         Arrays.toString(stack.buffer),
                         Arrays.toString(pointer));
  }

}
