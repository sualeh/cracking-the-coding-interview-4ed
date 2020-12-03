package us.fatehi.sualeh.chapter03;

/** 3.1 Describe how you could use a single array to implement three stacks. */
public class Question03_1 {

  /*
   * Divide the array in three equal parts and allow the individual
   * stack to grow in that limited space (note: “[“ means inclusive,
   * while “(“ means exclusive of the end point). »»for stack 1, we will
   * use [0, n/3) »»for stack 2, we will use [n/3, 2n/3) »»for stack 3,
   * we will use [2n/3, n) This solution is based on the assumption that
   * we do not have any extra information about the usage of space by
   * individual stacks and that we can’t either modify or use any extra
   * space. With these constraints, we are left with no other choice but
   * to divide equally.
   */

  public static class ArrayStack {
    int stackSize = 5;
    int[] buffer = new int[stackSize * 3];
    int[] stackPointer = {-1, -1, -1}; // stack pointers to track top elem

    public boolean isEmpty(final int stackNum) {
      return stackPointer[stackNum] == -1;
    }

    public int peek(final int stackNum) {
      final int index = stackNum * stackSize + stackPointer[stackNum];
      return buffer[index];
    }

    public int pop(final int stackNum) {
      final int index = stackNum * stackSize + stackPointer[stackNum];
      stackPointer[stackNum]--;
      final int value = buffer[index];
      buffer[index] = 0;
      return value;
    }

    public void push(final int stackNum, final int value) {
      /*
       * Find the index of the top element in the array + 1, and
       * increment the stack pointer
       */
      final int index = stackNum * stackSize + stackPointer[stackNum] + 1;
      buffer[index] = value;
      stackPointer[stackNum]++;
    }
  }
}
