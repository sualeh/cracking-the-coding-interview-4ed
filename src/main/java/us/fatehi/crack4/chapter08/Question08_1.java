package us.fatehi.crack4.chapter08;

/** 8.1 Write a method to generate the nth Fibonacci number. */
public class Question08_1 {
  /*
   * There are three potential approaches: (1) recursive approach (2)
   * iterative approach (3) using matrix math. We have described the
   * recursive and iterative approach below, as you would not be
   * expected to be able to derive the matrix-based approach in an
   * interview. For the interested math-geeks, you may read about the
   * (most efficient) matrix-based algorithm at
   * http://en.wikipedia.org/wiki/Fibonacci_number#Matrix_form.
   */

  public static int fibo_iterative(final int n) {
    if (n < 0) {
      return -1; // Error condition.
    }
    if (n == 0) {
      return 0;
    }
    int a = 1, b = 1;
    for (int i = 3; i <= n; i++) {
      final int c = a + b;
      a = b;
      b = c;
    }
    return b;
  }

  public static int fibo_recursive(final int n) {
    if (n == 0) {
      // f(0) = 0
      return 0;
    } else if (n == 1) {
      // f(1) = 1
      return 1;
    } else if (n > 1) {
      // f(n) = f(n—1) + f(n-2)
      return fibo_recursive(n - 1) + fibo_recursive(n - 2);
    } else {
      // Error condition
      return -1;
    }
  }
}
