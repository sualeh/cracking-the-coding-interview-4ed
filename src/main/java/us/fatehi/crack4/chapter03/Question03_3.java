package us.fatehi.crack4.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore,
 * in real life, we would likely start a new stack when the previous stack exceeds some threshold.
 * Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of
 * several stacks, and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is,
 * pop() should return the same values as it would if there were just a single stack). FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */
public class Question03_3 {

  public static class SetOfStacks {

    List<Stack> stacks = new ArrayList<>();
    int capacity = 3;

    /*
     * What should pop() do? It should behave similarly to push(), in
     * that it should operate on the last stack. If the last stack is
     * empty (after popping), then we should remove it from the list of
     * stacks.
     */
    public int pop() {
      // TODO: getLastStack() can return null - we need a null check
      final Stack last = getLastStack();
      final int v = last.pop();
      if (last.isEmpty()) {
        stacks.remove(stacks.size() - 1);
      }
      return v;
    }

    /*
     * We know that push() should behave identically to a single stack,
     * which means that we need push() to call push on the last stack.
     * We have to be a bit careful here though: if the last stack is at
     * capacity, we need to create a new stack. Our code should look
     * something like this:
     */
    public void push(final int v) {
      final Stack last = getLastStack();
      if (last != null && !last.isAtCapacity()) {
        // add to last stack
        last.push(v);
      } else {
        // must create new stack
        final Stack stack = new Stack(capacity);
        stack.push(v);
        stacks.add(stack);
      }
    }

    private Stack getLastStack() {
      if (stacks.isEmpty()) {
        return null;
      } else {
        return stacks.get(stacks.size() - 1);
      }
    }
  }

  public static class Stack {

    class Node {
      int value;
      Node next;

      public Node(final int v) {
        value = v;
      }
    }

    int capacity;

    int count;

    Node top;

    public Stack(final int capacity) {
      this.capacity = capacity;
    }

    public boolean isAtCapacity() {
      return count == capacity;
    }

    public boolean isEmpty() {
      return count == 0;
    }

    public int pop() {
      if (!isEmpty()) {
        count--;

        final Node pop = top;
        top = top.next;
        return pop.value;
      }
      throw new IllegalArgumentException("Nothing to pop");
    }

    public void push(final int value) {
      if (isAtCapacity()) {
        throw new IllegalArgumentException("Stack is at capacity");
      }

      final Node t = new Node(value);
      t.next = top;
      top = t;

      count++;
    }
  }
}
