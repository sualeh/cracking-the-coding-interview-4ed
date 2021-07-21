package us.fatehi.sualeh.chapter03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.chapter03.Question03_1.ArrayStack;

public class TestQuestion03_1 {

  @Test
  public void test1Question03_1() {
    final ArrayStack stack = new ArrayStack();

    stack.push(0, 1);
    stack.push(1, 2);
    System.out.println(printStack(stack));

    assertTrue(!stack.isEmpty(0), printStack(stack));
    assertTrue(!stack.isEmpty(1), printStack(stack));
    assertTrue(stack.isEmpty(2), printStack(stack));

    final int peek0 = stack.peek(0);
    final int peek1 = stack.peek(1);
    final int peek2 = stack.peek(2);
    System.out.println(printStack(stack));

    assertEquals(1, peek0, printStack(stack));
    assertEquals(2, peek1, printStack(stack));
    assertEquals(0, peek2, printStack(stack));

    stack.push(0, 3);
    final int pop2 = stack.pop(1);
    System.out.println(printStack(stack));

    assertEquals(2, pop2, printStack(stack));
    assertTrue(!stack.isEmpty(0), printStack(stack));
    assertTrue(stack.isEmpty(1), printStack(stack));
    assertTrue(stack.isEmpty(2), printStack(stack));
  }

  private String printStack(final ArrayStack stack) {
    final char[] pointer = new char[stack.stackSize * 3];
    Arrays.fill(pointer, ' ');
    for (int i = 0; i < 3; i++) {
      final int index = i * stack.stackSize + stack.stackPointer[i];
      pointer[index] = stack.stackPointer[i] == -1 ? '-' : '^';
    }
    return String.format(
        "array with 3 stacks\n%s\n%s", Arrays.toString(stack.buffer), Arrays.toString(pointer));
  }
}
