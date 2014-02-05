package us.fatehi.sualeh.chapter08;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter08.Question08_1.fibo_iterative;
import static us.fatehi.sualeh.chapter08.Question08_1.fibo_recursive;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;

public class TestQuestion08_1
  extends TreeNodeTest
{

  @Test
  public void test1Question08_1a()
  {

    assertEquals(-1, fibo_iterative(-1));
    assertEquals(0, fibo_iterative(0));
    assertEquals(1, fibo_iterative(1));
    assertEquals(1, fibo_iterative(2));
    assertEquals(2, fibo_iterative(3));
    assertEquals(34, fibo_iterative(9));

  }

  @Test
  public void test1Question08_1b()
  {

    assertEquals(-1, fibo_recursive(-1));
    assertEquals(0, fibo_recursive(0));
    assertEquals(1, fibo_recursive(1));
    assertEquals(1, fibo_recursive(2));
    assertEquals(2, fibo_recursive(3));
    assertEquals(34, fibo_recursive(9));

  }

}
