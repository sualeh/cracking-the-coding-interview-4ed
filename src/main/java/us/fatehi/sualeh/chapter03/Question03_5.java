package us.fatehi.sualeh.chapter03;


import java.util.Stack;

/**
 * 3.5 Implement a MyQueue class which implements a queue using two
 * stacks.
 */
public class Question03_5
{

  /*
   * Since the major difference between a queue and a stack is the order
   * (first-in-first-out vs. last-in-first-out), we know that we need to
   * modify peek() and pop() to go in reverse order. We can use our
   * second stack to reverse the order of the elements (by popping s1
   * and pushing the elements on to s2). In such an implementation, on
   * each peek() and pop() operation, we would pop everything from s1
   * onto s2, perform the peek / pop operation, and then push everything
   * back. This will work, but if two pop / peeks are performed
   * back-to-back, we’re needlessly moving elements. We can implement a
   * “lazy” approach where we let the elements sit in s2. s1 will thus
   * be ordered with the newest elements on the top, while s2 will have
   * the oldest elements on the top. We push the new elements onto s1,
   * and peek and pop from s2. When s2 is empty, we’ll transfer all the
   * elements from s1 onto s2, in reverse order.
   */
  public static class MyQueue<T>
  {
    Stack<T> s1, s2;

    public MyQueue()
    {
      s1 = new Stack<T>();
      s2 = new Stack<T>();
    }

    public void add(final T value)
    {
      s1.push(value);
    }

    public T peek()
    {
      if (!s2.empty())
      {
        return s2.peek();
      }

      while (!s1.empty())
      {
        s2.push(s1.pop());
      }
      return s2.peek();
    }

    public T remove()
    {
      if (!s2.empty())
      {
        return s2.pop();
      }
      while (!s1.empty())
      {
        s2.push(s1.pop());
      }
      return s2.pop();
    }

    public int size()
    {
      return s1.size() + s2.size();
    }
  }

}
