package us.fatehi.crack4.chapter03;

/**
 * 3.2 How would you design a stack which, in addition to push and pop, also has a function min
 * which returns the minimum element? Push, pop and min should all operate in O(1) time.
 */
public class Question03_2 {

  /*
   * You can implement this by having each node in the stack keep track
   * of the minimum beneath itself. Then, to find the min, you just look
   * at what the top element thinks is the min. When you push an element
   * onto the stack, the element is given the current minimum. It sets
   * its "local min" to be the min.
   */
  public static class StackWithMin {

    class NodeWithMin {
      int value;
      int min;
      NodeWithMin next;

      public NodeWithMin(final int v, final int min) {
        value = v;
        this.min = min;
      }
    }

    NodeWithMin top;

    public int min() {
      if (top == null) {
        return Integer.MAX_VALUE;
      } else {
        return peek().min;
      }
    }

    public NodeWithMin peek() {
      return top;
    }

    public NodeWithMin pop() {
      if (top != null) {
        final NodeWithMin pop = top;
        top = top.next;
        return pop;
      }
      return null;
    }

    public void push(final int value) {
      final int newMin = Math.min(value, min());
      final NodeWithMin t = new NodeWithMin(value, newMin);
      t.next = top;
      top = t;
    }
  }
}
